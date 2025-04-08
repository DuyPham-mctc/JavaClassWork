package Week07;

public class ITECCourseManager_New {
    public static void main(String args[]) {
        //Much less code!
        ITECCourse_New maintenanceCourse = new ITECCourse_New("Microcomputer Systems Maintenance", 1310, 20);
        //Add some students.
        //TODO check that we have not exceeded the max number for the class
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");
        maintenanceCourse.removeStudent("Anna");
        maintenanceCourse.writeCourseInfo();

        ITECCourse_New datacomCourse = new ITECCourse_New ("Data Communications", 1424, 30);
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");
        datacomCourse.writeCourseInfo();

        ITECCourse_New softwaredevelopmentCourse = new ITECCourse_New("Software Development Projects", 2903, 24);
        softwaredevelopmentCourse.addStudent("Gus");
        softwaredevelopmentCourse.addStudent("Harry");
        softwaredevelopmentCourse.addStudent("Izzy");
        softwaredevelopmentCourse.writeCourseInfo();
    }
}
