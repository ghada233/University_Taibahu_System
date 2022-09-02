package taibahcs;

public class FacultyMember {

    private int FacultyID;
    private String academicRank;
    private String firstName;
    private String lastName;
    private String academicSpecialization;

    public FacultyMember(int FacultyID, String firstName, String lastName, String academicRank, String academicSpecialization) {
        this.FacultyID = FacultyID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.academicRank = academicRank;
        this.academicSpecialization = academicSpecialization;
    }

    FacultyMember() {
    }

    public int getFacultyID() {
        return FacultyID;
    }

    public void setFacultyID(int FacultyID) {
        this.FacultyID = FacultyID;
    }

    public String getAcademicRank() {
        return academicRank;
    }

    public void setAcademicRank(String academicRank) {
        this.academicRank = academicRank;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAcademicSpecialization() {
        return academicSpecialization;
    }

    public void setAcademicSpecialization(String academicSpecialization) {
        this.academicSpecialization = academicSpecialization;
    }

    @Override
    public String toString() {
        return "FacultyID : " + FacultyID + " firstName : "
                + firstName + ", lastName : " + lastName + " academicRank : "
                + academicRank + ", academicSpecialization : " + academicSpecialization;
    }

}
