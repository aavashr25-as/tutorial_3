import java.util.ArrayList;

class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}

class StudentCourse {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public StudentCourse(String name) {
        this.name = name;
    }

    public void registerCourse(Course course) {
        courses.add(course);
    }

    public void displayCourses() {
        System.out.println("Courses registered by " + name + ":");
        for (Course c : courses) {
            System.out.println(c.getCourseName());
        }
    }
}

public class CourseRegistrationDemo {
    public static void main(String[] args) {
        StudentCourse s = new StudentCourse("Aava");

        s.registerCourse(new Course("AI"));
        s.registerCourse(new Course("Database"));

        s.displayCourses();
    }
}