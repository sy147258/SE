package se.exp3.a2;

import java.util.ArrayList;
import java.util.List;

/**
 * A1-2 College 类模型
 * College (1) --- 聚合(aggregation) --- Building (*)
 * College (1) --- 组合(composition) --- Course (1..*)
 */
public class College {
    private String name;                       // - name
    private int numberOfDepartments;           // - numberOfDepartments
    // 聚合：College 拥有 Building，但 Building 可独立存在
    private List<Building> buildings = new ArrayList<>();
    // 组合：Course 依赖 College 而存在
    private List<Course> courses = new ArrayList<>();

    public College(String name) { this.name = name; }

    /** + establish() */
    public void establish() {
        System.out.println(name + " college established.");
    }

    /** + getTotalStudents() : integer */
    public int getTotalStudents() {
        return courses.stream().mapToInt(Course::getEnrollment).sum();
    }

    public void addBuilding(Building b) { buildings.add(b); }
    public void addCourse(Course c) { courses.add(c); }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getNumberOfDepartments() { return numberOfDepartments; }
    public void setNumberOfDepartments(int n) { this.numberOfDepartments = n; }
    public List<Building> getBuildings() { return buildings; }
    public List<Course> getCourses() { return courses; }
}
