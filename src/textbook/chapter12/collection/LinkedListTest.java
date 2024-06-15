package textbook.chapter12.collection;

import java.util.LinkedList;

public class LinkedListTest {
    LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("A"); //linkedlist에 요소 추가
		linkedList.add("B");
		linkedList.add("C");
		
		System.out.println(linkedList);
		linkedList.add(1,"D"); //linkedlist 첫번째 자리에 요소 추가
		
		System.out.println(linkedList);
		
		linkedList.addFirst("O"); //linkedlist 맨 앞에 요소 추가
		System.out.println(linkedList);
		System.out.println(linkedList.removeLㄴast()); //linkedlist 마지막 요소 삭제 후 해당 요소 출력
		
		System.out.println(linkedList);
}
}
