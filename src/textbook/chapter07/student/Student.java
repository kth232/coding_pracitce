package textbook.chapter07.student;

import java.util.ArrayList;

public class Student {
    int studentID; //학번
    String studentNM; //학생명
    ArrayList<Subject> subjectList; //subject arrayList, subject 자료형 정의
    //ArrayList 클래스는 배열 크기 제한에 자유롭다, add(), remove() 메서드 등으로 요소 개수 증감 가능

    public Student(int studentID, String studentNM){ //학번, 학생명을 매개변수로 받는 생성자
        this.studentID = studentID; //인스턴스 객체 생성
        this.studentNM = studentNM;

        subjectList = new ArrayList<Subject>(); //subject arrayList 생성
    }

    public void addSubject(String name, int score){
        Subject subject = new Subject(); //subject 객체 생성

        subject.setName(name); //과목명 추가
        subject.setScore(score); //점수 추가
        subjectList.add(subject); //arrayList 클래스의 add()로 배열에 저장
    }

    public void showStudentInfo()
    {
        int total = 0; //총점 초기화

        for(Subject s : subjectList){ //향상된 for문: 변수 s에 subjectList 배열의 각 요소 대입

            total += s.getScore(); //subjectList의 get()으로 가져온 score 값 더해서 총점 구하기
            System.out.printf("ID: %s / Student Name: %s / Subject Name: %s / score: %d%n", studentID, studentNM, s.getName(), s.getScore()); //과목별 점수 출력
        }
        System.out.printf("Student Name: %s / total: %d%n", studentNM, total); // 총점 출력
    }
}
