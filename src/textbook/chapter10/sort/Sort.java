package textbook.chapter10.sort;

public interface Sort {
    void ascending(int[] arr);
    void descending(int[] arr);

    default void description(){
        System.out.println("Algorithms to sort numbers");
    }
}
