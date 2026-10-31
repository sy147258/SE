package se.exp3.a3;

import java.util.ArrayList;
import java.util.List;

/**
 * A1-3 School 领域类图
 * School (0..*) Student
 * School (1..*) Department  (组合)
 */
public class School {
    private String name;             // - name
    private String address;          // - address
    private int establishedYear;     // - establishedYear
    private List<Department> departments = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public School(String name, String address, int establishedYear) {
        this.name = name;
        this.address = address;
        this.establishedYear = establishedYear;
    }

    /** + addDepartment() */
    public void addDepartment(Department d) { departments.add(d); }

    /** + getStudentCount() : integer */
    public int getStudentCount() { return students.size(); }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public int getEstablishedYear() { return establishedYear; }
    public void setEstablishedYear(int y) { this.establishedYear = y; }
    public List<Department> getDepartments() { return departments; }
    public List<Student> getStudents() { return students; }
}
