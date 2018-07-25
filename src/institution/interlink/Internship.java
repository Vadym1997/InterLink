package institution.interlink;

import Person.consciousness.Knowledge;
import Person.Student;

import java.util.ArrayList;

public class Internship {
    String name;
    ArrayList<Student> internshipList;

    public Internship(String name, ArrayList<Student> internshipList) {
        this.name = name;
        this.internshipList = internshipList;
    }
/// заміняє інтерна на і-тому місці інтерном, який приходить з вхідного параметра метода
    public void setStudent(Student student, int i) {
     internshipList.remove(i);
     internshipList.add(i,student);
    }


///Метод для отримання студентів(із університету) на стажування, в яких знання 4 або 5
    public ArrayList<Student> getStudents(ArrayList<Student> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getKnowledge().equals(new Knowledge(4)) || arrayList.get(i).getKnowledge().equals(new Knowledge(5)))
                internshipList.add(arrayList.get(i));
        }
        return internshipList;
    }
}








