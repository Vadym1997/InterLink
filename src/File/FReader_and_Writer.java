package File;

import Person.Student;

import java.io.*;
import java.util.ArrayList;

public class FReader_and_Writer {
    //метод записує у файл студентів із вхідного списку
    public void writeInFile(String path, ArrayList<Student> students) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(path)))) {
            objectOutputStream.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error " + e);
        }
    }
    //метод зчитує з файла студентів  і формує з них список
    public ArrayList<Student> readFromFile(String path) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(path)))) {
            return (ArrayList<Student>) objectInputStream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            System.err.println("Error" + e);
            return null;
        }
    }
}
