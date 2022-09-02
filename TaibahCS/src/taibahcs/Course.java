package taibahcs;

public class Course  {

    private String cousrseCode;
    private String courseName;
    private int creditHours;

    public Course() {
    }

    public Course(String CousrseCode) {
        this.cousrseCode = CousrseCode;
    }

    public Course(String CousrseCode, String CourseName, int CreditHours) {
        this.cousrseCode = CousrseCode;
        this.creditHours = CreditHours;
        this.courseName = CourseName;
    }

    public String getCousrseCode() {
        return cousrseCode;
    }

    public void setCousrseCode(String CousrseCode) {
        this.cousrseCode = CousrseCode;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int CreditHours) {
        this.creditHours = CreditHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String CourseName) {
        this.courseName = CourseName;
    }

    @Override
    public String toString() {
        return "Cousrse code: " + cousrseCode + ", Course name: " + courseName
                + ", Credit hours :" + creditHours;

    }
}
