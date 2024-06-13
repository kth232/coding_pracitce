package textbook.chapter10.scheduler;

public class AgentGetTask implements Scheduler {
    @Override
    public void getNextTask() {
        System.out.println("개발자가 다음 작업 요청");
    }

    @Override
    public void distributeTask() {
        System.out.println("개발자가 해당 작업을 가져감");
    }
}
