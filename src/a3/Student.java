package se.exp3.a3;

import java.util.ArrayList;
import java.util.List;

/**
 * A1-3 Student
 * Student (1..5) Subject
 */
public class Student {
    private String name;       // - name
    private String studentId;  // - studentId
    private String major;      // - major
    private List<Subject> subjects = new ArrayList<>();

    public Student(String name, String studentId, String major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }

    /** + enroll() （最多 1..5 门） */
    public void enroll(Subject s) {
        if (subjects.size() >= 5) throw new IllegalStateException("Student 最多选修 5 门 Subject");
        subjects.add(s);
    }

    /** + getGPA() : real */
    public double getGPA() { return 0.0; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
    public List<Subject> getSubjects() { return subjects; }
}
