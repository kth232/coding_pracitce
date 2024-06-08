package week01_t;

public class Student {
    private int studentId;
    private int cardNum;
    private String name;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.cardNum = studentId + 100;
    }

    @Override
    public String toString() {
        return "studentId=" + studentId +
                ", cardNum=" + cardNum +
                ", name=" + name;
    }
}
