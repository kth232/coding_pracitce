package week02_p;

public class Ex03 {
    public static int solution(int[] array, int n) {
        int count = 0;
        for (int num : array){
            if(num == n) {
                count++;
            }
        }
        return count;
    } //중복 숫자 개수 출력

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 2, 3};
        int sol = solution(arr, 2);
        System.out.println(sol);
    }
}
