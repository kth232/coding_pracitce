package textbook.chapter15;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("사원 정보를 입력하세요");
        System.out.println("name: ");
        String name = scanner.nextLine();
        System.out.println("job: ");
        String job = scanner.nextLine(); //이름과 직업(문자열) 입력 받음
        System.out.println("employeeNo: ");
        int num = scanner.nextInt(); //사원번호(정수) 입력 받음

        System.out.printf("name: %s/job: %s/employeeNo: %d%n", name, job, num);
    }
}
