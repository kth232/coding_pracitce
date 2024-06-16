package textbook.chapter12.collection.list;

public class QueueTest {
    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enQueue("A");
        queue.enQueue("B");
        System.out.println(queue.deQueue());

        queue.enQueue("C");
        queue.enQueue("D");
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
