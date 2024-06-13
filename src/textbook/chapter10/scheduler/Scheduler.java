package textbook.chapter10.scheduler;

public interface Scheduler { //scheduler 인터페이스 정의
    public void getNextTask(); //다음 작업 가져오는 메서드
    public void distributeTask(); //작업 배분하는 메서드
    
}
