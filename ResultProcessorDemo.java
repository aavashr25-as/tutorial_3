interface ResultProcessor {
    void calculateGrade(int marks);
}

class EngineeringDepartment implements ResultProcessor {
    @Override
    public void calculateGrade(int marks) {
        if (marks >= 80)
            System.out.println("Engineering Grade: A");
        else
            System.out.println("Engineering Grade: B");
    }
}

class ManagementDepartment implements ResultProcessor {
    @Override
    public void calculateGrade(int marks) {
        if (marks >= 70)
            System.out.println("Management Grade: A");
        else
            System.out.println("Management Grade: B");
    }
}

public class ResultProcessorDemo {
    public static void main(String[] args) {
        ResultProcessor eng = new EngineeringDepartment();
        ResultProcessor mgmt = new ManagementDepartment();

        eng.calculateGrade(75);
        mgmt.calculateGrade(75);
    }
}