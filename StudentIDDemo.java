class StudentID {
    private static int counter = 1;
    private int id;

    public StudentID() {
        id = counter++;
    }

    public void displayID() {
        System.out.println("Student ID: " + id);
    }
}

public class StudentIDDemo {
    public static void main(String[] args) {
        StudentID s1 = new StudentID();
        StudentID s2 = new StudentID();
        StudentID s3 = new StudentID();

        s1.displayID();
        s2.displayID();
        s3.displayID();
    }
}