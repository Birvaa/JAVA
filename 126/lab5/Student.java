class Student {
    String studentName; 
    static String university;

    public Student(String studentName, String university) {
        this.studentName = studentName;
        this.university = university;
    }

    void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("School: " + university);
    }

    public static void main(String[] args) { 
        Student s1 = new Student("shreya", "DIET");
        s1.display();
        Student s2 = new Student("mansi", "DIET");
        s2.display();
    }
}