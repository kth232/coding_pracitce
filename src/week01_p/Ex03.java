package week01_p;

public class Ex03 {
    public static int solution(int age) {
        int answer = 2024 - (age - 1);
        return answer;
    } //2024년 기준 선생님의 출생년도 출력

    public static void main(String[] args) {
        int age = 42;
        int sol = solution(age);
        System.out.println("선생님의 출생연도: "+ sol);
    }
}
