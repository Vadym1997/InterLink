package institution;
import Person.Student;
import Person.consciousness.Knowledge;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class University {
    private String name;
    private ArrayList<Student> students;

    public University(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }
    //    метод повертає середнє серед знань
    public double AvarageKnowledge() {
        double suma = 0;
        for (Student student : students) {
            suma += student.getKnowledge().getLevel();
        }
            return suma / (students.size());
        }

    public void getStudents(University university) {

                System.out.println("Звідки отримуються студенти?" +
                        " 1 з програми." +
                        " 2 з файлу." +
                        " 3 з БД.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                university.addStudent(new Student(1, "Andrew Kostenko", new Knowledge(3)));
                university.addStudent(new Student(2, "Andrew Kos", new Knowledge(5)));
                university.addStudent(new Student(3, "Olena Dub", new Knowledge(3)));
                university.addStudent(new Student(4, "Vadym Moroz", new Knowledge(5)));
                university.addStudent(new Student(5, "Oleh Cava", new Knowledge(2)));
                university.addStudent(new Student(6, "Anna Karenina", new Knowledge(4)));
                university.addStudent(new Student(7, "Julia Veselkina", new Knowledge(3)));
                university.addStudent(new Student(8, "Maria Perechrest", new Knowledge(4)));
                break;

            case 2:
                //read from file
                String path = " ";
//                try {
//                    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(path)));
//                    ArrayList<Student> studentArrayList = (ArrayList<Student>) objectInputStream.readObject();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
                break;

            case 3:
                //Connecting to Database
        }

     }


    // заміняє студента на і-тому місці студентом, який приходить з вхідного параметра метода
    public void setStudent(Student student, int i) {
        students.remove(i);
        students.add(i, student);
    }

    //додає студента до університету
    private void addStudent(Student student) {
        students.add(student);
    }

    public void add_students(ArrayList<Student> studentArrayList) {
        students.addAll(studentArrayList);
    }


    public ArrayList<Student> getStudents() {
        return students;
    }

}


