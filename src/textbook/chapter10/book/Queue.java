package textbook.chapter10.book;

public interface Queue {
    String enQueue(String title); //배열 맨 마지막에 추가
    String deQueue(); //배열의 가장 처음 항목 반환
    int getSize(); //현재 큐에 있는 요소 개수
}
