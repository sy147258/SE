package se.exp3.a3;

import java.util.ArrayList;
import java.util.List;

/**
 * A1-3 Department
 * Department (1..*) Instructor
 * Department (1..*) Subject
 */
public class Department {
    private String name;       // - name
    private double budget;     // - budget
    private List<Instructor> instructors = new ArrayList<>();
    private List<Subject> subjects = new ArrayList<>();

    public Department(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    /** + addInstructor() */
    public void addInstructor(Instructor i) { instructors.add(i); }

    /** + getHeadCount() : integer */
    public int getHeadCount() { return instructors.size(); }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getBudget() { return budget; }
    public void setBudget(double budget) { this.budget = budget; }
    public List<Instructor> getInstructors() { return instructors; }
    public List<Subject> getSubjects() { return subjects; }
}
