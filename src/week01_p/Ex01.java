package week01_p;

public class Ex01 {
        public static int solution(int num1, int num2) {
            return (num1 == num2) ? 1 : -1;
        } //두 수가 같으면 1, 다르면 -1 출력


    public static void main(String[] args) {
        int num1 = 5, num2 = 5;
        int sol = solution(num1, num2);
        System.out.println("result: " + sol);
    }
}