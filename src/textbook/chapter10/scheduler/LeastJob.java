package textbook.chapter10.scheduler;

public class LeastJob implements Scheduler{ //scheduler 인터페이스 구현
    //현재 업무가 없거나 작업대기가 가장 적은 개발자에게 작업 배분, 추상 메서드 구현
    @Override
    public void getNextTask() {
        System.out.println("작업을 순서대로 대기열에서 가져옴");
    }

    @Override
    public void distributeTask() {
        System.out.println("현재 업무가 없거나 대기가 가장 적은 개발자에게 할당");
    }
}
