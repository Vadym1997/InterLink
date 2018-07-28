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

        Student student1 = new Student("Andrew Kostenko", a4);
        Student student2 = new Student("Andrew Kos",a5);
        Student student3 = new Student("Olena Dub",a4);
        Student student4 = new Student("Vadym Labinskiy",a5);
        Student student5 = new Student("Oleh Cava",a4);
        Student student6 = new Student("Anna Karenina",a4);
        Student student8 = new Student("Julia Veselkina",a3);
        Student student9 = new Student("Maria Perechrest",a5);

    ArrayList<Student> studentArrayList = new ArrayList<>();
       studentArrayList.add(student1);
       studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);
        studentArrayList.add(student6);
        studentArrayList.add(student8);
        studentArrayList.add(student9);
// Додаємо студентів із іншого списка,це може бути
// файл на комп*ютері, база даних і т.д. В нашому випадку - з іншого списка
        for (Student student : studentArrayList) {
            university.addStudent(student);
            System.out.println(student);
        }


//        Student student = new Student("Alla Andrienko",a5);
//        university.setStudent(student, 0);
        ArrayList<Student> internshipList = new ArrayList<>();

        Internship internship = new Internship("Interlink", internshipList);
        System.out.println("__________________________________________________________________________________________________________________");
        System.out.println("Avaradge knowledge"+ " "+university.AvarageKnowledge());
        System.out.println("List of internship's students:");
        ArrayList<Student> interns = internship.getStudents(university);
//        internship.setStudent(new Student("Artem Buk", a5),0);
        for (Student intern : interns) {
            System.out.println(intern);}



    }
    }

