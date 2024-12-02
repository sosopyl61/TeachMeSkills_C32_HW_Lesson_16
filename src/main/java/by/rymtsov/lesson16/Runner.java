package main.java.by.rymtsov.lesson16;

import main.java.by.rymtsov.lesson16.collection.CollectionOperations;
import main.java.by.rymtsov.lesson16.student.Student;

import java.util.Map;
import java.util.Set;

/**
 * This is the application runner class.
 * Task:
 * Create a collection of passport numbers (String format).
 * Create a collection of students in our group.
 * Each collection should not have duplicate elements.
 * Create a key-value collection, where the key will be the passport number from the first collection, and the value will be the Student class object from the second collection.
 * Loop through the key-value collection with a for-each loop and display the collection elements on the screen.
 */

public class Runner {
    public static void main(String[] args) {
        Set<String> passportNumbers = CollectionOperations.createSetOfPassportNumbers();
        Set<Student> students = CollectionOperations.createSetOfStudents();
        Map<String, Student> studentMap = CollectionOperations.createMapOfStudents(passportNumbers, students);

        CollectionOperations.outputMapOfStudents(studentMap);
    }
}
