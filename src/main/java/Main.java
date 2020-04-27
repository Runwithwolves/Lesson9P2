import Lesson9HW.Student;
import Lesson9HW.StudentsGroup;
import Lesson9HW.StudentsList;

public class Main extends StudentsGroup {

    public static void main(String[] args) {
        Student studentCanada=new Student ("Evelynn", "24", "Canada");
        Student studentBelgium=new Student ("Adam", "22", "Belgium");
        Student studentUSA=new Student ("Claire","19","USA");
        Student studentEngland=new Student ("Johnattan", "23", "England");
        StudentsList students = new StudentsList();
        students.addStudent(studentCanada);
        students.addStudent(studentBelgium);
        students.addStudent(studentUSA);
        students.addStudent(studentEngland);
        //students.exclude(studentUSA) вот эта команда позволяет исключать ученика из списка группы.
        students.printStudents();


    }

}
