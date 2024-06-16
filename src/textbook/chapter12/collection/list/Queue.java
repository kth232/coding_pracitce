package textbook.chapter12.collection.list;

import java.util.ArrayList;

public class Queue {
    private ArrayList<String> arrayQueue = new ArrayList<String>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue() {
        int len = arrayQueue.size();
        if(len == 0 ) {
            System.out.println("Queue is empty");
            return null;
        }

        return(arrayQueue.remove(0));
    }
}
