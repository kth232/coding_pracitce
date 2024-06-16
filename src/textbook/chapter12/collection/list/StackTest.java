package textbook.chapter12.collection.list;

public class StackTest {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        System.out.println(stack.pop());

        stack.push("C");
        stack.push("D");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
