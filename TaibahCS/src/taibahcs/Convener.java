package taibahcs;

import java.util.ArrayList;

public class Convener extends FacultyMember {

    public ArrayList<Course> course = new ArrayList<>();//كورس ياخذ كورسات 
    private ArrayList<Lecturers> lecturers = new ArrayList<>();
    private ArrayList<TAs> tas = new ArrayList<>();
    private ArrayList<Integer> members = new ArrayList<>();
    private ArrayList<String> _courses = new ArrayList<>();// الكورس  من نوع استرينق نضيف فقط اسم الكورس  

    public Convener() {
    }

    public Convener(int FacultyID, String firstName, String lastName, String academicRank,
            String academicSpecialization) {
        super(FacultyID, academicRank, firstName, lastName, academicSpecialization);
    }

    public Convener(int FacultyID, String firstName, String lastName, String academicRank,
            String academicSpecialization, ArrayList<String> courses, ArrayList<Integer> member) {
        super(FacultyID, academicRank, firstName, lastName, academicSpecialization);
        this._courses = courses;
        this.members = member;
    }

    public void allocateCourse(Course c, int ID) {
        for (Lecturers e : lecturers) {
            if (e.getFacultyID() == ID ) {
                e.setAssignedCourses(c);
            }
        }
        for (TAs e : tas) {
            if (e.getFacultyID() == ID) {
                e.setAssignedCourses(c);
            }
        }
    }

    public void addMember(int member) {
        if (!members.equals(member)) {
            members.add(member);
        }
    }

    public void addCourse(String course) {
        if (!_courses.equals(course)) {
            _courses.add(course);
        }
    }

    public void dropCourse(String c, int ID) {
        if (members.contains(c)) {
            members.remove(c);
        }
    }

    public ArrayList<Course> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<Course> course) {
        this.course = course;
    }

    public ArrayList<Lecturers> getLecturers() {
        return lecturers;
    }

    public void setLecturers(ArrayList<Lecturers> lecturers) {
        this.lecturers = lecturers;
    }

    public ArrayList<TAs> getTas() {
        return tas;
    }

    public void setTas(ArrayList<TAs> tas) {
        this.tas = tas;
    }

    public ArrayList<Integer> getmembers() {
        return members;
    }

    public void setmembers(ArrayList<Integer> members) {
        this.members = members;
    }

    public ArrayList<String> get_courses() {
        return _courses;
    }

    public void set_courses(ArrayList<String> _courses) {
        this._courses = _courses;
    }

    @Override
    public String toString() {
        return "FacultyID : " + super.getFacultyID() + ", firstName : " + super.getFirstName() 
                + ", lastName : " + super.getLastName() + ", academicRank : " + super.getAcademicRank() 
                + ", academicSpecialization : " + super.getAcademicSpecialization() 
                + ", courses : " + get_courses() + ", Memebers : " + getmembers() + "\n";

    }

}
