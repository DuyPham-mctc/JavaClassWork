package Week07;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {
    //Data that an ITECCourse object needs to s
    String name;
    int code;
    List<String> students;
    int maxStudents;


    void addStudent(String studentName) {
        if (students == null) {
        //See if students has been set up yet initialize it if not
            students = new ArrayList<>();
        }
        students.add(studentName);
    }
    void writeCourseInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled:");
        for (String student: students) {
            System.out.println(student);
        }
        System.out.println("There are "+ getNumberOfStudents() +" students enrolled");
        System.out.println("The max number of students for this course is "+ maxStudents);
    }
    int getNumberOfStudents() {
        return this.students.size();
    }
}
