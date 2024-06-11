package textbook.chapter07.student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1= new Student(1001, "Lee");

        student1.addSubject("korean", 100);
        student1.addSubject("math", 50);

        Student student2 = new Student(1002, "Kim");

        student2.addSubject("korean", 70);
        student2.addSubject("math", 85);
        student2.addSubject("english", 100);

        student1.showStudentInfo();
        System.out.println("======================================");
        student2.showStudentInfo();
    }
}
