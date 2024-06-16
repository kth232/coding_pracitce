package textbook.chapter14;

import java.io.FileNotFoundException;

public class AutoCloseTest {
    public static void main(String[] args) throws FileNotFoundException {
        AutoCloseObj obj = new AutoCloseObj();
        try (obj){
            throw new Exception(); //강제 예외 발생
        }catch(Exception e) {
            System.out.println("exception part");
        }
    }
}
