abstract class Scholarship {
    abstract void checkEligibility();
}

class MeritScholarship extends Scholarship {
    @Override
    void checkEligibility() {
        System.out.println("Eligible for Merit Scholarship");
    }
}

class NeedBasedScholarship extends Scholarship {
    @Override
    void checkEligibility() {
        System.out.println("Eligible for Need-Based Scholarship");
    }
}

public class ScholarshipDemo {
    public static void main(String[] args) {
        Scholarship merit = new MeritScholarship();
        Scholarship need = new NeedBasedScholarship();

        merit.checkEligibility();
        need.checkEligibility();
    }
}