package textbook.chapter15.basedStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {

        try(FileReader fr = new FileReader("writer.txt")){ //문자 단위로 읽어오는 스트림
            int i;
            while( (i = fr.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
