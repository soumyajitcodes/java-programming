package static_final;

import java.util.Date;

class Student {
    private String rollNumber;
    private static int count = 1;

    private String generateRollNumber() {
        Date d = new Date();
        String roll = "UNIV-"+(d.getYear()+1900)+"-"+count;
        count++;
        return roll;
    }

    public Student() {
        rollNumber = generateRollNumber();
    }

    public String getRoll() {
        return rollNumber;
    }
}

public class studentRoll {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();

        System.out.println(s1.getRoll());
        System.out.println(s2.getRoll());
        System.out.println(s3.getRoll());
        System.out.println(s4.getRoll());

    }
}
