package week01_p;

public class Ex02 {
    public static int solution(int num1, int num2) {
        return num1 % num2;
    } //num1을 num2로 나눈 나머지 출력


    public static void main(String[] args) {
        int num1 = 5, num2 = 3;
        int sol = solution(num1, num2);
        System.out.println("result: " + sol);
    }
}
