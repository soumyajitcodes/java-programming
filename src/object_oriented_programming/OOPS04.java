package object_oriented_programming;

class Student {
    public int studentRoll;
    public String studentName;
    public String studentCourse;
    public double studentMarks01;
    public double studentMarks02;
    public double studentMarks03;

    public double total() {
        return studentMarks01+studentMarks02+studentMarks03;
    }

    public double average() {
        return total()/3;
    }

    public String grade() {
        if (average()>=75) {
            return "A+ GRADE";
        }
        else if (average()>=70 && average()<75) {
            return "A GRADE";
        }
        else if (average()>=65 && average()<70) {
            return "B GRADE";
        }
        else if (average()>=55 && average()<65) {
            return "C GRADE";
        }
        else {
            return "FAIL GRADE";
        }
    }
}

public class OOPS04 {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentRoll = 301303;
        student.studentName = "Jhon";
        student.studentCourse = "Engineering";
        student.studentMarks01 = 50;
        student.studentMarks02 = 70;
        student.studentMarks03 = 80;

        System.out.println("Total Marks   --> "+student.total());
        System.out.println("Average Marks --> "+student.average());
        System.out.println("Grade         --> "+student.grade());

    }
}
