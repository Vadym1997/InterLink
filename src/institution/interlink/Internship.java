package institution.interlink;

import Person.consciousness.Knowledge;
import Person.Student;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Internship {
  private String name;
  private ArrayList<Student> internshipList;

    public Internship(String name, ArrayList<Student> internshipList) {
        this.name = name;
        this.internshipList = internshipList;
    }

    /// заміняє інтерна на і-тому місці інтерном, який приходить з вхідного параметра метода
    public void setStudent(Student student, int i) {
        internshipList.remove(i);
        internshipList.add(i, student);
    }


    ///Метод для отримання студентів(із університету) на стажування, в яких знання 4 або 5
    public ArrayList<Student> getStudents(ArrayList<Student> arrayList) {
        IntStream.range(0, arrayList.size()).filter(i -> arrayList.get(i).getKnowledge().equals(new Knowledge(4)) || arrayList.get(i).getKnowledge().equals(new Knowledge(5))).forEach(i -> internshipList.add(arrayList.get(i)));
        return internshipList;
    }
}








