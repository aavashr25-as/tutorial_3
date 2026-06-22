class Attendance {
    public void calculateAttendance() {
        System.out.println("General Attendance");
    }
}

class EngineeringAttendance extends Attendance {
    @Override
    public void calculateAttendance() {
        System.out.println("Engineering Attendance = 80%");
    }
}

class MedicalAttendance extends Attendance {
    @Override
    public void calculateAttendance() {
        System.out.println("Medical Attendance = 90%");
    }
}

public class AttendanceDemo {
    public static void main(String[] args) {
        Attendance eng = new EngineeringAttendance();
        Attendance med = new MedicalAttendance();

        eng.calculateAttendance();
        med.calculateAttendance();
    }
}