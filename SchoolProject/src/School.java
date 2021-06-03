import java.util.ArrayList;

//The School Class holds the student, teacher, and course lists.
//Students and teachers are removed or added to the lists (by calling the methods in this class in the main class)


public class School {
    ArrayList<Teacher> teachers = new ArrayList<>(3);
    ArrayList<Student> students = new ArrayList<>(10);
    ArrayList<String> courses = new ArrayList<>();

    //methodt that adds the courses to the ArrayList
    public void addCourses(){
        courses.add("Math");
        courses.add("Science");
        courses.add("English");
    }


    //fields for the School
    private String schoolName = "Windermere Secondary";
    private int schoolAge = 60;
    private String schoolDistrict = "District 39";



    //method to add to the student list:
    public void addStudentList(){

        students.add(new Student("Emma ", "Cho ", 9));
        students.add(new Student("Stephanie ", "Chan ", 8));
        students.add(new Student("Lana ", "Fong ", 8));
        students.add(new Student("Ethan ", "Song ", 10));
        students.add(new Student("Emmanuel ", "Con ", 11));
        students.add(new Student("Aidan ", "Chan ", 9));
        students.add(new Student("Adrian ", "Lee ", 8));
        students.add(new Student("Tanya ", "Tong ", 9));
        students.add(new Student("Jason ", "Chan ", 9));
        students.add(new Student("Ella ", "Tang ", 9));

    }

    //method to print the Student List:
    public void printStudentList(ArrayList<Student> students){
        for (int i = 0; i < students.size(); i++){

            System.out.println("Student name: " + students.get(i).getFirstName() + students.get(i).getLastName() + "\t" + "Grade: " + students.get(i).getGrade());

        }
    }



    //method to add to the Teacher list:
    public void addTeacherList(){

        teachers.add(new Teacher("Amy ", "Chan ", "Math"));
        teachers.add(new Teacher("Marcus ", "Tam ", "English"));
        teachers.add(new Teacher("Emily ", "Tong", "Science"));

    }

    //method to print the Teacher List:
    public void printTeacherList(ArrayList<Teacher> teachers){
        for (int i = 0; i < teachers.size(); i++){

            //teachers.toArray();
            System.out.println("Teacher's name: " + teachers.get(i).getFirstName() + " " + teachers.get(i).getLastName() + "\t" + "\t" + "Course: " + teachers.get(i).getSubject());
        }
    }




    //adds a new student
    public void addStudent(){
        students.add(new Student());
    }

    //removes a student at a given index point
    public void removeStudent(int index){
        students.remove(index);
    }

    //adds a new teacher
    public void addTeacher(){
        teachers.add(new Teacher());
    }


    //removes a teacher at a given index point
    public void removeTeacher(int index){
        teachers.remove(index);
    }


//setters and getters
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSchoolAge() {
        return schoolAge;
    }

    public void setSchoolAge(int schoolAge) {
        this.schoolAge = schoolAge;
    }

    public String getSchoolDistrict() {
        return schoolDistrict;
    }

    public void setSchoolDistrict(String schoolDistrict) {
        this.schoolDistrict = schoolDistrict;
    }

}
