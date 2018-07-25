package Main;

import Person.consciousness.Knowledge;
import Person.Student;
import institution.University;
import institution.interlink.Internship;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        University university = new University("CH.U.I.", students);
        Knowledge a1 = new Knowledge(1);
        Knowledge a2 = new Knowledge(2);
        Knowledge a3 = new Knowledge(3);
        Knowledge a4 = new Knowledge(4);
        Knowledge a5 = new Knowledge(5);


        university.addStudent(new Student("Andrew Kostenko",a4));
        university.addStudent(new Student("Andrew Kos",a5));
        university.addStudent(new Student("Olena Dub",a3));
        university.addStudent(new Student("Vadym Labinskiy",a5));
        university.addStudent(new Student("Oleh Cava",a1));
        university.addStudent(new Student("Anna Karenina",a2));
        university.addStudent(new Student("Julia Veselkina",a3));
        university.addStudent(new Student("Maria Perechrest",a5));
        System.out.println("Students of University:");
        for (Student student : students) {
            System.out.println(student);

        }
//        Student student = new Student("Alla Andrienko",a5);
//        university.setStudent(student, 0);
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

