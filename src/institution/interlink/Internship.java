package institution.interlink;

import Person.consciousness.Knowledge;
import Person.Student;
import institution.University;

import java.util.ArrayList;

public class Internship {
   private String name;
    private ArrayList<Student> internshipList;
    public Internship(String name, ArrayList<Student> internshipList) {
        this.name = name;
        this.internshipList = internshipList;
    }
/// замінює інтерна на і-тому місці інтерном, який приходить з вхідного параметра метода
    public void setStudent(Student student, int i) {
     internshipList.remove(i);
     internshipList.add(i,student);
    }
///Метод для отримання студентів(із університету) на стажування, в яких знання вищі середнього
    public ArrayList<Student> getStudents(University university) {
        for (int i = 0; i < university.getStudents().size(); i++) {
            double avarageKnowledge = university.AvarageKnowledge();
              if(university.getStudents().get(i).getKnowledge().getLevel()>= avarageKnowledge)
                internshipList.add(university.getStudents().get(i));
        }
        return internshipList;
    }
}








