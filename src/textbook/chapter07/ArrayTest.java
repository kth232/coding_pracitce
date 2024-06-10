package textbook.chapter07;

public class ArrayTest {
    public static void main(String[] args) {

        double[] data = new double[5]; //실수 배열 5개 생성(array는 배열 길이 고정)
        int size = 0; //배열 요소 개수 저장할 변수 선언
        double total = 0; //총합 저장할 변수 선언

        data[0] = 10.0; size++; // 배열에 값 저장할 때마다 size 값 증가
        data[1] = 20.0; size++;
        data[2] = 30.0; size++;

        //data.length는 배열의 크기(5), size는 유효한 값이 저장된 배열 요소 개수(3)
        //반복문은 i < n 형태로 쓰는 것이 직관적으로 이해하기 쉽기 때문에 선호하는 표기법
        for(int i = 0; i < size; i++){
            System.out.println(data[i]);
        }

        for(int i=0; i< size; i++){
            total += data[i];
        } //배열 요소 합 구하기
        System.out.printf("total: %.2f", total); //실수 소수점 2자리까지만 출력
    }
}
