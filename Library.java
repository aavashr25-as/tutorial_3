class Member {
    public int borrowingLimit() {
        return 0;
    }
}

class StudentMember extends Member {
    @Override
    public int borrowingLimit() {
        return 3;
    }
}

class TeacherMember extends Member {
    @Override
    public int borrowingLimit() {
        return 10;
    }
}

public class Library {
    public static void main(String[] args) {
        Member student = new StudentMember();
        Member teacher = new TeacherMember();

        System.out.println("Student Limit: " + student.borrowingLimit());
        System.out.println("Teacher Limit: " + teacher.borrowingLimit());
    }
}