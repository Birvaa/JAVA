import java.util.Scanner;
class Student {
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    double[] grade_obtained;
    double spi;

    Student(int id_no, int no_of_subjects_registered) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = new String[no_of_subjects_registered];
        this.subject_credits = new int[no_of_subjects_registered];
        this.grade_obtained = new double[no_of_subjects_registered];
    }

    void calculate_spi() {
        double total_credits = 0;
        double total_mark = 0;

        for (int i=0;i<no_of_subjects_registered;i++) {
            total_credits += subject_credits[i];
            total_mark += grade_obtained[i] * subject_credits[i];
        }

        spi = total_mark / total_credits;
    }

    void display() {
        System.out.println("Student ID: " + id_no);
        System.out.println("SPI: " + spi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of student :");
        int n = Integer.parseInt(args[0])
        Student[] students = new Student[n];

        for (int i = 1; i < n; i++) {
            System.out.println("enter student ID :");
            int id_no = sc.nextInt();
            System.out.println("enter number of subjects_registered :");
            int no_of_subjects_registered = sc.nextInt();
            Student s = new Student(id_no, no_of_subjects_registered);

            for (int j = 0; j < no_of_subjects_registered; j++) {
                System.out.println("enter subject_code :");
                s.subject_code[j] = sc.next();
                System.out.println("enter subject_credits :");
                s.subject_credits[j] = sc.nextInt();
                System.out.println("enter grade_obtained:");
                s.grade_obtained[j] = sc.nextDouble();
            }

            s.calculate_spi();
            students[i] = s;
        }

        for (Student s : students) {
            s.display();
        }
    }
}