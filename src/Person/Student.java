package Person;

import Person.consciousness.Knowledge;

public class Student {
       String name;
       Knowledge knowledge;
    public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }
    public Knowledge getKnowledge() {
        return knowledge;
    }
    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", knowledge=" + knowledge +
                '}';
    }
}


