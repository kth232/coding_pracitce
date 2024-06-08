package programers;

public class arraysAvg {
    static double solution(int numbers[]) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        int avg = (int)(sum / numbers.length);
        return avg;
    }

        public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        System.out.println(solution(arr));
    }
}
