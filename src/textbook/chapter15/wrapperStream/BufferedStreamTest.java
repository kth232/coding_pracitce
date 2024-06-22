package textbook.chapter15.wrapperStream;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) {

        long nanoSecond = 0;

        try(FileInputStream fis = new FileInputStream("input.txt");
        FileOutputStream fos = new FileOutputStream("copy.txt")){

            nanoSecond = System.nanoTime(); //파일 복사 전 시간

            int i;
            while( ( i = fis.read()) != -1){ //한 바이트씩 읽어와서 출력함
                fos.write(i);
            }

            nanoSecond = System.nanoTime() - nanoSecond; //파일 복사에 걸린 시간 계산
        }catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("fileoutputStream 소요 시간(버퍼 x): " + nanoSecond + "nanoSec");

        long nanoSecond2 = 0; //초기화, millisecond보다 더 짧은 시간으로 계산해야 비교 가능
        try(FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("copy.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos)){

            nanoSecond2 = System.nanoTime(); //파일 복사 전 시간

            int i;
            while( ( i = bis.read()) != -1){ //버퍼 8kb만큼 한 번 읽어옴
                bos.write(i);
            }

            nanoSecond2 = System.nanoTime() - nanoSecond2; //파일 복사에 걸린 시간 계산
        }catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("bufferdoutputStream 소요 시간: " + nanoSecond2 + "nanoSec");
    }
}
