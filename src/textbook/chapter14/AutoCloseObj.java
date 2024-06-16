package textbook.chapter14;

public class AutoCloseObj implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("resource closed");
    }
}
