package textbook.chapter10.scheduler;

import java.io.IOException;

public class SchedularTest {
    public static void main(String[] args) throws IOException { 
        //문자 입력받는 System.in.read()를 사용하려면 예외 처리 필수!

        System.out.println("작업 요청이 접수되었습니다!");
        System.out.println("작업 할당 정책을 선택하세요(대소문자 구분x)");
        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 작업이 없거나 대기가 가장 적은 개발자에게 할당");
        System.out.println("P : 우선순위가 높은 작업 먼저 할당");
        System.out.println("A : 개발자가 직접 작업 가져가기");

        int ch = System.in.read(); //입력받은 문자 변수에 대입
        Scheduler scheduler = null; //scheduler 변수 초기화

        //대소문자 상관없이 해당 값 입력받으면 각 작업 정책 클래스의 인스턴스 생성 후 scheduler 변수에 대입
        if(ch == 'R' || ch == 'r'){
            scheduler = new RoundRobin();
        }
        else if(ch == 'L' || ch == 'l'){
            scheduler = new LeastJob();
        }
        else if(ch == 'P'|| ch == 'p'){
            scheduler = new PriorityAllocation();
        }
        else if(ch == 'A'|| ch == 'a'){
            scheduler = new AgentGetTask();
        }
        else{
            System.out.println("not supported function");
            return;
        }

        scheduler.getNextTask(); //정책에 상관없이 인터페이스에 선언한 메서드 호출
        scheduler.distributeTask();
    }
}
