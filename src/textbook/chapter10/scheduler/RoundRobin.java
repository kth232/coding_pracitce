package textbook.chapter10.scheduler;

public class RoundRobin implements Scheduler { //scheduler 인터페이스 구현
    //한명씩 돌아가며 동일하게 작업 배분, 추상 메서드 구현
    @Override
    public void getNextTask() {
        System.out.println("작업을 순서대로 대기열에서 가져옴");
    }
    @Override
    public void distributeTask() {
        System.out.println("다음 순서 개발자에게 배분함");
    }
}
