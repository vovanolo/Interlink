package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");

//        university.addStudent(new Student("Andrew Kostenko"));
//        university.addStudent(new Student("Julia Veselkina"));
//        university.addStudent(new Student("Maria Perechrest"));
        Student []students = new Student [3];
        students[0] =new  Student("Andrew Kostenko" );
        students[1] =new  Student("Julia Veselkina" );
        students[2] =new  Student("Maria Perechrest" );

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        System.out.println ( "If level is more 50");
        internship.getStudents(students);
    }
}