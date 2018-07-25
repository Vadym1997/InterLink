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


