package se.exp3.a3;

import java.util.ArrayList;
import java.util.List;

/**
 * A1-3 Instructor
 * Instructor (1..3) Subject
 */
public class Instructor {
    private String name;     // - name
    private String title;    // - title
    private double salary;   // - salary
    private List<Subject> subjects = new ArrayList<>();

    public Instructor(String name, String title, double salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    /** + assignSubject() （最多 1..3 门） */
    public void assignSubject(Subject s) {
        if (subjects.size() >= 3) throw new IllegalStateException("Instructor 最多承担 3 门 Subject");
        subjects.add(s);
    }

    /** + getLoad() : integer */
    public int getLoad() { return subjects.size(); }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public List<Subject> getSubjects() { return subjects; }
}
