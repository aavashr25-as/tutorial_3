abstract class StudentFee {
    abstract void calculateFee();
}

class Undergraduate extends StudentFee {
    @Override
    void calculateFee() {
        System.out.println("Undergraduate Fee = Rs. 50000");
    }
}

class Graduate extends StudentFee {
    @Override
    void calculateFee() {
        System.out.println("Graduate Fee = Rs. 80000");
    }
}

public class FeeCalculation {
    public static void main(String[] args) {
        StudentFee ug = new Undergraduate();
        StudentFee grad = new Graduate();

        ug.calculateFee();
        grad.calculateFee();
    }
}