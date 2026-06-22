class Student {
    private String name;
    private int rollno;
    private String faculty;

    public Student(String name, int rollNumber, String faculty) {
        this.name = name;
        this.rollno = rollNumber;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollno;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Faculty: " + faculty);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Aava", 101, "BSc CSIT");
        s.displayProfile();
    }
}