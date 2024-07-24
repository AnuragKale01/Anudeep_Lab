package lab3_2;
//Create a Student class that takes studentName and studentID Now override both equal() and hashCode() based on studentID only. (Note: Students can use the Objects.hash() method to generate hashcodes or else they can write custom logic to generate unique hashcodes.) Add a constructor. Create a few students and add them to a Hashset. Now add another student with the same studentID to the set. Is it possible to add the new student or it just replaced the previous student n
import java.util.HashSet;
import java.util.Objects;

class Student {
    private String studentName;
    private int studentID;

    // Constructor
    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    // Getter methods
    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    // Overriding equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentID == student.studentID;
    }

    // Overriding hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }

    // Overriding toString() method for better readability
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentID=" + studentID +
                '}';
    }

    public static void main(String[] args) {
        // Creating a few student instances
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        Student student3 = new Student("Charlie", 3);

        // Creating a HashSet and adding the students
        HashSet<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // Creating another student with the same studentID as student1
        Student student4 = new Student("Alicia", 1);

        // Adding this student to the HashSet
        students.add(student4);

        // Printing all the students in the HashSet
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
