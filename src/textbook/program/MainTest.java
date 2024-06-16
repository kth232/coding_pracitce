package textbook.program;

import textbook.program.define.*;

public class MainTest {
    School CASchool = School.getInstance();
    Subject korean;
    Subject math;
    Subject english;

    GradeReport gradeReport = new GradeReport();

    public static void main(String[] args) {

        MainTest test = new MainTest();

        test.creatSubject();
        test.createStudent();

        String report = test.gradeReport.getReport(); //성적 결과 생성
        System.out.println(report); // 출력
    }

    //테스트 과목 생성
    public void creatSubject(){

        korean = new Subject("국어", Define.KOREAN);
        math = new Subject("수학", Define.MATH);
        english = new Subject("영어", Define.ENGLISH);

        english.setGradeType(Define.PF_TYPE); //학점 평가 정책 지정

        CASchool.addSubject(korean);
        CASchool.addSubject(math);
        CASchool.addSubject(english);
    }

    //테스트 학생 생성
    public void createStudent(){

        Student student1 = new Student(181213, "안성원", korean  );
        Student student2 = new Student(181518, "오태훈", math  );
        Student student3 = new Student(171230, "이동호", korean  );
        Student student4 = new Student(171255, "조성욱", korean  );
        Student student5 = new Student(171590, "최태평", math );

        CASchool.addStudent(student1);
        CASchool.addStudent(student2);
        CASchool.addStudent(student3);
        CASchool.addStudent(student4);
        CASchool.addStudent(student5);

        korean.register(student1);
        korean.register(student2);
        korean.register(student3);
        korean.register(student4);
        korean.register(student5);

        math.register(student1);
        math.register(student2);
        math.register(student3);
        math.register(student4);
        math.register(student5);

        english.register(student1);
        english.register(student2);
        english.register(student3);
        english.register(student4);
        english.register(student5);

        addScoreForStudent(student1, korean, 95);
        addScoreForStudent(student1, math, 56);
        addScoreForStudent(student1, english, 80);

        addScoreForStudent(student2, korean, 95);
        addScoreForStudent(student2, math, 95);
        addScoreForStudent(student2, english, 85);

        addScoreForStudent(student3, korean, 100);
        addScoreForStudent(student3, math, 88);
        addScoreForStudent(student3, english, 92);

        addScoreForStudent(student4, korean, 89);
        addScoreForStudent(student4, math, 95);
        addScoreForStudent(student4, english, 70);

        addScoreForStudent(student5, korean, 85);
        addScoreForStudent(student5, math, 56);
        addScoreForStudent(student5, english, 68);
    }

    //과목별 성적 입력
    public void addScoreForStudent(Student student, Subject subject, int point){

        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);
    }
}
