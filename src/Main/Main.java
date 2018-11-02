package Main;

import Person.consciousness.Knowledge;
import Person.Student;
import institution.University;
import institution.interlink.Internship;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        University university = new University("CH.U.I.", students);
        university.getStudents(university);

        System.out.println("Students of University:");
        for (Student student : students) {
            System.out.println(student);

        }

        ArrayList<Student> internshipList = new ArrayList<>();

        Internship internship = new Internship("Interlink", internshipList);
        System.out.println("__________________________________________________________________________________________________________________");
        System.out.println("List of internship's students:");
        ArrayList<Student> interns = internship.getStudents(students);
//        internship.setStudent(new Student("Artem Buk", a5),0);
        for (Student intern : interns) {
            System.out.println(intern);}

    }
    }

