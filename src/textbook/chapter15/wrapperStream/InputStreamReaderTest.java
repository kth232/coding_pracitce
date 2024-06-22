package textbook.chapter15.wrapperStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        // 바이트 단위로 읽어오는 기반 스트림을 매개변수로 받은 InputStreamReader 보조 스트림 -> 문자로 변환
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("writer.txt"))){
            int i;
            while( (i = isr.read()) != -1){  //보조 스트림으로 읽음, 파일 끝까지 읽으면 -1 반환
                System.out.print((char)i);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
