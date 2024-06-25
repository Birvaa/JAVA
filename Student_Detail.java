import java.util.Scanner;

class StudentDetail{
    double enrollmentNo;
    String name;
    int semester;
    float cpi;

    void printDetails() {
        System.out.println("------------------------");
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
        System.out.println("CPI: " + cpi);
    }
}

public class Student_Detail{
    public static void main(String[] args) {
        StudentDetail[] students = new StudentDetail[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            students[i] = new StudentDetail();
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enrollment No: ");
            students[i].enrollmentNo = scanner.nextDouble();
            System.out.print("Name: ");
            students[i].name = scanner.next();
            System.out.print("Semester: ");
            students[i].semester = scanner.nextInt();
            System.out.print("CPI: ");
            students[i].cpi = scanner.nextFloat();
        }

        System.out.println("Student Details:");
        for (int i = 0; i < 2; i++) {
            students[i].printDetails();
        }
    }
}