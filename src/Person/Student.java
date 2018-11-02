package Person;

import Person.consciousness.Knowledge;

public class Student {
    private long id;
    private     String name;
    private   Knowledge knowledge;

        public Student() {
        }

    public Student(long id, String name, Knowledge knowledge) {
        this.id = id;
        this.name = name;
        this.knowledge = knowledge;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", knowledge=" + knowledge +
                '}';
    }
}


