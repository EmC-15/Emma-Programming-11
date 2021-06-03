//The Student Class holds information about the students (first and last name, their grade, student number)

public class Student {

    //fields:
    private String firstName;
    private  String lastName;
    private int grade;
    static int number = 1 ;
    private int studentNum;

    Student(){
        firstName = "unknown";
        lastName = "unknown";
        grade = 0;
        studentNum = number;
        number++;
    }

    //constructor for the student (first and last name, grade)
    Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    //setters and getters
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }


}
