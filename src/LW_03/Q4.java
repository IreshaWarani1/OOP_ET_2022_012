package LW_03;


public class Q4 {


    public static class Lecturer {
        private String lecturerName;
        private String courseTeaching;

        public Lecturer() {}

        public Lecturer(String lecturerName, String courseTeaching) {
            this.lecturerName = lecturerName;
            this.courseTeaching = courseTeaching;
        }

        public String getLecturerName() {
            return lecturerName;
        }

        public void setLecturerName(String lecturerName) {
            this.lecturerName = lecturerName;
        }

        public String getCourseTeaching() {
            return courseTeaching;
        }

        public void setCourseTeaching(String courseTeaching) {
            this.courseTeaching = courseTeaching;
        }

        @Override
        public String toString() {
            return "Lecturer Name: " + lecturerName + ", Teaching: " + courseTeaching;
        }
    }


    public static class Course {
        private String courseName;
        private String courseCode;
        private Lecturer lecturer;  // Course has a Lecturer

        public Course() {}

        public Course(String courseName, String courseCode, Lecturer lecturer) {
            this.courseName = courseName;
            this.courseCode = courseCode;
            this.lecturer = lecturer;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public String getCourseCode() {
            return courseCode;
        }

        public void setCourseCode(String courseCode) {
            this.courseCode = courseCode;
        }

        public Lecturer getLecturer() {
            return lecturer;
        }

        public void setLecturer(Lecturer lecturer) {
            this.lecturer = lecturer;
        }

        @Override
        public String toString() {
            return "Course Name: " + courseName + ", Course Code: " + courseCode + ", " + lecturer.toString();
        }
    }

    public static class Student {
        private String studentName;
        private String degreeName;
        private String courseFollowing;

        public Student() {}

        public Student(String studentName, String degreeName, String courseFollowing) {
            this.studentName = studentName;
            this.degreeName = degreeName;
            this.courseFollowing = courseFollowing;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public String getDegreeName() {
            return degreeName;
        }

        public void setDegreeName(String degreeName) {
            this.degreeName = degreeName;
        }

        public String getCourseFollowing() {
            return courseFollowing;
        }

        public void setCourseFollowing(String courseFollowing) {
            this.courseFollowing = courseFollowing;
        }

        @Override
        public String toString() {
            return "Student Name: " + studentName + ", Degree: " + degreeName + ", Following: " + courseFollowing;
        }
    }


    public static void main(String[] args) {

        // Create Lecturer object
        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Dr. John Smith");
        lecturer.setCourseTeaching("Object-Oriented Programming");

        // Create Course object
        Course course = new Course();
        course.setCourseName("Object-Oriented Programming");
        course.setCourseCode("CS202");
        course.setLecturer(lecturer);

        // Create Student object
        Student student = new Student();
        student.setStudentName("Alice Johnson");
        student.setDegreeName("BSc Computer Science");
        student.setCourseFollowing(course.getCourseName());

        // Display Information
        System.out.println("===== University Course Registration System =====");
        System.out.println("\n--- Lecturer Information ---");
        System.out.println(lecturer);

        System.out.println("\n--- Course Information ---");
        System.out.println(course);

        System.out.println("\n--- Student Information ---");
        System.out.println(student);
    }
}
