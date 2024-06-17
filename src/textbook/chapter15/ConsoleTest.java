package textbook.chapter15;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {

        Console console = System.console();

        System.out.println("name: ");
        String name = console.readLine();
        System.out.println("job: ");
        String job = console.readLine();
        System.out.println("PW ");
        char[] pass = console.readPassword();
        String strPass = new String(pass);

        System.out.printf("name: %s/job: %s/PW: %s%n", name, job, strPass);
    }
}
