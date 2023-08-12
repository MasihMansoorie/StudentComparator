package topStudentsProject;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String school;
    private double score;
    private Character grade;

    public Student(int id, String firstName, String lastName, String school, double score, Character grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
        this.score = score;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentsOfTheYear{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", school='" + school + '\'' +
                ", score=" + score +
                ", ch=" + grade +
                '}';
    }


    // Sorting by id ----

}
