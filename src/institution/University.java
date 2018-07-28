package institution;

import Person.Student;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Student> students ;

    public University(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }
//    метод повертає середнє серед знань
    public double AvarageKnowledge(){
        double suma=0;
        for (Student student : students) {

            suma += student.getKnowledge().getLevel();
        }
        return suma/(students.size());

    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    // заміняє студента на і-тому місці студентом, який приходить з вхідного параметра метода
    public void setStudent(Student student, int i) {
       students.remove(i);
       students.add(i,student);
        }
        //додає студента до університету
        public void addStudent(Student student) {
            students.add(student);
        }
    }


