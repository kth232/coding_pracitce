package week02_p;

import java.util.Arrays;

public class Ex01 {
    public static int solution(int[] array) {
        Arrays.sort(array);

        int length = array.length;

        if(length % 2 == 1) {
            return array[length / 2];
        } else {
            int midIndex = length / 2;
            return (array[midIndex-1] + array[midIndex]) / 2;
        }
    } //중앙값 출력하기

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 10, 11};
        int sol = solution(arr);
        System.out.println(sol);
    }
}
