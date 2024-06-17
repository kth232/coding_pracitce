package textbook.chapter15;

import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) throws IOException {

        System.out.println("알파벳을 쓰고 [Enter]를 누르세요");
        int i;

        try {
            while((i = System.in.read()) != '\n') { //줄개행 될 때까지 1바이트씩 반복해서 읽어옴
                //입력받은 값 i에 대입, 바이트 단위 스트림
                //System.out.println(i); //1바이트 출력 시 아스키 값 출력
                System.out.print((char) i); //문자형으로 형변환
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
