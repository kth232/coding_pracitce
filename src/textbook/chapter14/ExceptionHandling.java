package textbook.chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        FileInputStream fis = null;

        System.out.println("==FileNotFoundException==");
        try {
            fis = new FileInputStream("a.txt");
        } catch (
                FileNotFoundException e) {
            System.out.println(e); //예외 클래스의 toString 메서드 호출
            //return;
        } finally {
            if (fis != null) {
                try {
                    fis.close(); //파일 입력 스트림 닫기
                } catch (IOException e) {
                    //TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("항상 수행됨");
        }
        System.out.println("여기도 수행됨");

        System.out.println("==ArrayIndexOutOfBoundsException==");
        int[] arr = {1,2,3,4,5};
        try{
            for(int i=0; i<=5; i++){ //배열 범위를 벗어나게 값을 저장하려는 경우
                System.out.println(arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){ //runtimeException 하위 클래스
            //예외처리 없어도 컴파일 오류 발생 x, ->예외 발생 시 비정상 종료
            System.out.println(e);
        }
        System.out.println("비정상 종료 x");
    }
}
