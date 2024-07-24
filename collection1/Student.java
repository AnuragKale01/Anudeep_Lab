/* Create a Student class that takes studentName and studentID Now override both equal() and hashCode() based on studentID only. (Note: Students can use the Objects.hash() method to generate hashcodes or else they can write custom logic to generate unique hashcodes.) Add a constructor. Create a few students and add them to a Hashset. Now add another student with the same studentID to the set. Is it possible to add the new student or it just replaced the previous student ?*/
package collection1;

import java.util.HashSet;
import java.util.Objects;

public class Student {
    private String studentName;
    private int studentID;

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return studentID == student.studentID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Karan", 11101);
        Student student2 = new Student("Avi", 11102);
        Student student3 = new Student("Ayushi", 11103);

        HashSet<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);

        Student student4 = new Student("David", 11101); // Same studentID as student1
        boolean added = studentSet.add(student4);

        System.out.println("Student added to HashSet: " + added);
        System.out.println("Students in HashSet:");
        for (Student student : studentSet) {
            System.out.println(student.getStudentID() + ": " + student.getStudentName());
        }
    }
}

