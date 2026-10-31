package se.exp3.a3;

/**
 * A1-3 Subject
 */
public class Subject {
    private String code;     // - code
    private String title;    // - title
    private int credits;     // - credits

    public Subject(String code, String title, int credits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
    }

    /** + getEnrollment() : integer */
    public int getEnrollment() { return 0; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }
}
