package Week07;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse_New {
    //Data that an ITECCourse object needs to store
    String name;
    int code;
    List<String> students;
    int maxStudents;

    //Constructor
    ITECCourse_New(String courseName, int courseCode, int courseMaxStudents) {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<>();
        //Set up the students list
        this.maxStudents = courseMaxStudents;
    }
    void addStudent(String studentName) {
        //No need to create ArrayList, the constructor has already done it
        //Check to see if the course is full before adding new student
        if (this.students.size() == this.maxStudents) {
            System.out.println("Course is full can't add "+ studentName);
        } else {
            this.students.add(studentName);
        }
    }
    void writeCourseInfo() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Students enrolled:");
        for (String student: this.students) {
            System.out.println(student);
        }
        System.out.println("There are "+ getNumberOfStudents() +" students enrolled");
        System.out.println("The max number of students for this course is "+ this.maxStudents);
    }
    int getNumberOfStudents() {
        return this.students.size();
    }
    void removeStudent(String studentName) {
        if (this.students.contains(studentName)) {
            this.students.remove(studentName);
            System.out.println(studentName +" was un-enrolled from "+ this.name);
        } else {
            System.out.println(studentName +" was not found in "+ this.name);
        }

    }
}
