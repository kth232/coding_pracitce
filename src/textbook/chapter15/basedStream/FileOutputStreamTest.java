package textbook.chapter15.basedStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest { //바이트 단위 출력 스트림
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("output.txt", true)) //향상된 try-with-resource
        //append 변수: 기존 파일에 새로 작성할 것인지(false=기본값), 맨 뒤에 이어서 작성할 것인지(true) 여부 체크
        {
            byte[] bs = new byte[26];
            byte data = 65;     //'A'의 아스키 값
            for(int i = 0; i < bs.length; i++){  // A-Z 까지 배열에 넣기
                bs[i] = data;
                data++;
            }
            fos.write(bs, 2, 10);   // 배열의 2 번째 위치부터 10 개 바이트 출력하기

            //fos.flush(); // 자료의 양이 출력할 만큼 많지 않더라도 강제 출력
            //fos.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");
    }
}
