package textbook.chapter10.scheduler;

public class PriorityAllocation implements Scheduler{ //scheduler 인터페이스 구현
    //중요도가 높은 작업부터 대기열에서 가져와 개발 능력이 높은 개발자에게 우선 작업 배분, 추상 메서드 구현
    @Override
    public void getNextTask() {
        System.out.println("중요도가 높은 작업을 먼저 가져옴");
    }

    @Override
    public void distributeTask() {
        System.out.println("개발 능력이 높은 개발자에게 우선 할당");
    }
}
