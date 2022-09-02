package taibahcs;

import java.util.ArrayList;

public class Lecturers extends FacultyMember {
//كلها من نوع برايفت وتستخدم باكلاس 
    private int maxmimumMumberOfCourse;
    private int quotaOfCreditHourse;
    private ArrayList<Course> assignedCourses = new ArrayList<>();
    private int currenthourse = 0;
    private int currentcourse = 0;
    private ArrayList<String> _courses = new ArrayList<>();

    public Lecturers() {
    }

    public Lecturers(int FacultyID, String firstName, String lastName, String academicRank,
            String academicSpecialization, int maxmimumMumberOfCourse, int quotaOfCreditHourse) {
        super(FacultyID, firstName, lastName, academicRank, academicSpecialization);
        this.maxmimumMumberOfCourse = maxmimumMumberOfCourse;
        this.quotaOfCreditHourse = quotaOfCreditHourse;
    }

    public int getMaxmimumMumberOfCourse() {
        return maxmimumMumberOfCourse;
    }

    public void setMaxmimumMumberOfCourse(int maxmimumMumberOfCourse) {
        this.maxmimumMumberOfCourse = maxmimumMumberOfCourse;
    }

    public int getQuotaOfCreditHourse() {
        return quotaOfCreditHourse;
    }

    public void setQuotaOfCreditHourse(int quotaOfCreditHourse) {
        this.quotaOfCreditHourse = quotaOfCreditHourse;
    }

    public ArrayList<Course> getAssignedCourses() {
        return assignedCourses;
    }

    public void setAssignedCourses(Course course) {
        for (int i = 0; i < currentcourse; i++) {
            if (currentcourse < maxmimumMumberOfCourse && currenthourse < quotaOfCreditHourse) {
                String g = course.getCousrseCode();
                this.assignedCourses.add(new Course(g));
                if(!(_courses.contains(g))){//اذا انت تحتوي على المادة 
                    this._courses.add(g);
                }
                currenthourse += course.getCreditHours();
            } else {
                if (currentcourse == maxmimumMumberOfCourse) {
                    System.out.println("\n////You have reached max number of course////");
                    break;
                } else {
                    System.out.println("\n////You have reached max number of hourse///");
                    break;
                }
            }

        }
    }

    public void setcurrentcourse(int currentcourse) {
        this.currentcourse = currentcourse;
    }

    public void setcurrenthourse(int currenthourse) {
        this.currenthourse = currenthourse;
    }

    public int getcurrenthourse() {
        return currenthourse;
    }

    public int getcurrentcourse() {
        return currentcourse;
    }

    public ArrayList<String> getCourses() {
        return _courses;
    }

    public void setCourses(String _courses) {
        this._courses.add(_courses);
    }
       
    @Override
    public String toString() {
        return "FacultyID : " + super.getFacultyID() + ", firstName : " + super.getFirstName()
                + ", lastName : " + super.getLastName() + ", academicRank : " + super.getAcademicRank()
                + ", academicSpecialization : " + super.getAcademicSpecialization()
                + ",  Current Courses : " + getcurrentcourse() + ", maxmimumMumberOfCourse : "
                + maxmimumMumberOfCourse + ", Current Hours : " + getcurrenthourse()
                + ", quotaOfCreditHourse : " + quotaOfCreditHourse
                + ", assignedCourses : " + this._courses;
    }
}
