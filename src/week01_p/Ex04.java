package week01_p;

public class Ex04 {
    public static int solution(int num1, int num2) {
        return (int)((double)num1/num2 * 1000);
    } //num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분 출력, 자료형 명시적 형변환

    public static void main(String[] args) {
        int num1 = 7, num2 = 3;
        int sol = solution(num1, num2);
        System.out.println("result: " + sol);
    }
}
