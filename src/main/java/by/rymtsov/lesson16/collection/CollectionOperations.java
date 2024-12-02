package main.java.by.rymtsov.lesson16.collection;

import main.java.by.rymtsov.lesson16.student.Student;

import java.util.*;

/**
 * This class has static methods to create
 * a set of passport numbers, set of students,
 * map of students with passport numbers as keys
 * and an output method for map collection.
 */

public class CollectionOperations {

    public static Set<String> createSetOfPassportNumbers() {
        Set<String> passportNumbers = new HashSet<>();
        passportNumbers.add("MP12345");
        passportNumbers.add("MP67890");
        passportNumbers.add("MO12345");
        passportNumbers.add("MO67890");
        passportNumbers.add("XZ12345");
        passportNumbers.add("YX67890");
        passportNumbers.add("UI18795");
        return passportNumbers;
    }

    public static Set<Student> createSetOfStudents() {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Ilya"));
        students.add(new Student("Kate"));
        students.add(new Student("Sultan"));
        students.add(new Student("Marina"));
        students.add(new Student("Sergey"));
        students.add(new Student("Kirill"));
        students.add(new Student("Rita"));
        return students;
    }

    public static Map<String, Student> createMapOfStudents(Set<String> passportNumbers,
                                                           Set<Student> students) {
        if (passportNumbers.size() != students.size()) {
            throw new IllegalArgumentException("Passport numbers and student numbers do not match.");
        }
        Map<String, Student> studentMap = new HashMap<>();
        Iterator<String> passportNumbersIterator = passportNumbers.iterator();
        Iterator<Student> studentIterator = students.iterator();

        while (passportNumbersIterator.hasNext() && studentIterator.hasNext()) {
            studentMap.put(passportNumbersIterator.next(), studentIterator.next());
        }
        return studentMap;
    }

    public static void outputMapOfStudents(Map<String, Student> studentMap) {
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
