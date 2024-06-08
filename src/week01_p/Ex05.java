package week01_p;

public class Ex05 {
    public static double solution(int[] numbers) {
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double answer = sum / numbers.length;
        return answer;
    }// numbers의 원소의 평균값 출력

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sol = solution(numbers);
        System.out.println("result: " + sol);
    }
}
