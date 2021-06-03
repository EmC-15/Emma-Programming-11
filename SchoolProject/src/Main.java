public class Main {
    public static void main(String[] args) {

        //creates a new object in the School Class (Windermere)
        School Windermere = new School();


        //prints welcome message
        System.out.println("Welcome to " + Windermere.getSchoolName() + "!  " + "We're in " + Windermere.getSchoolDistrict() + ".  Winderemere Secondary is " + Windermere.getSchoolAge() + " years old." + "\n");


        //Student List:
        System.out.println("Student List: " + "\n");
        //calls the addStudentList method in the School class and adds the students to the list
        Windermere.addStudentList();
        //calls the printStudentList method in the School class and prints the student list
        Windermere.printStudentList(Windermere.students);
        //prints the size of the Student list array
        System.out.println(Windermere.students.size() + "\n");


        //Teacher List:
        System.out.println("Teacher List: " + "\n");
        //calls the addTeacherList method in the School class and adds the teachers to the list
        Windermere.addTeacherList();
        //calls the printTeacherList method in the School class and prints the teacher list
        Windermere.printTeacherList(Windermere.teachers);
        //prints the size of the Teacher list Array
        System.out.println(Windermere.teachers.size() + "\n");


        //new student list:
        System.out.println("New Student List:" + "\n");
        //removes 2 students at index 9 and 8
        Windermere.removeStudent(9);
        Windermere.removeStudent(8);
        //prints the new student list
        Windermere.printStudentList(Windermere.students);
        //prints the size of the student list
        System.out.println(Windermere.students.size() + "\n");



        //new Teacher List:
        System.out.println("New Teacher List:" + "\n");
        //removes a teacher at index 2
        Windermere.removeTeacher(2);
        //prints the new teacher list
        Windermere.printTeacherList(Windermere.teachers);
        //prints the size of the teacher list
        System.out.println(Windermere.teachers.size() + "\n");


        System.out.println("end");


    }
}
