//The Teacher Class holds in information about the teachers (first and last name of teachers, their subject they teach)

public class Teacher {

    //fields for the teachers
    private String firstName;
    private String lastName;
    private String subject;

    Teacher(){
        firstName = "unknown FName";
        lastName = "unknown LName";
        subject = "unknown";
    }

    //constructor for the teachers
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
