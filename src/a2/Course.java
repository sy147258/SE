package se.exp3.a2;

/**
 * A1-2 Course（被 College 组合）
 * 约束：{Course 必须在某个 Building 中进行} —— Course (*) 关联 Building (1)
 */
public class Course {
    private String title;    // - title
    private String code;     // - code
    private int credits;     // - credits
    private Building building; // 关联 Building（必有，满足约束）

    public Course(String title, String code, int credits) {
        this.title = title;
        this.code = code;
        this.credits = credits;
    }

    /** + getDescription() : string */
    public String getDescription() {
        return code + " " + title + " (" + credits + " credits)";
    }

    /** 约束：Course 必须位于某个 Building 中 */
    public void setBuilding(Building b) {
        if (b == null) throw new IllegalArgumentException("Course 必须在某个 Building 中进行");
        this.building = b;
    }

    public Building getBuilding() { return building; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    // 简化：返回选课人数（实际应从注册系统取）
    public int getEnrollment() { return 0; }
}
