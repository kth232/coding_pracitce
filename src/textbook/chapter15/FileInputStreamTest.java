package textbook.chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;

            try {
            fis = new FileInputStream("input.txt");//파일 입력 스트림 생성, 파일 존재x
                byte[] bs = new byte[10];
                int i;
                while ( (i = fis.read(bs)) != -1){ //read()로 파일을 읽어올 때 끝에 도달하면 -1 반환
                    /*
                    for(byte b : bs){ //배열 크기만큼 한번에 읽어오기(기존 값 위에 덮어씀)
                        System.out.print((char)b); //1바이트씩 다 읽어올 때까지 반복
                    }
                    */
                    for(int k= 0; k<i; k++){
                        System.out.print((char)bs[k]); //배열 전체가 아닌 바이트 개수만큼 출력
                    }
                    System.out.println(" : " + i + "byte read");
                }
                //System.out.println((char)fis.read()); //1바이트씩 읽어오면 아스키 코드 값 출력
                //System.out.println((char)fis.read()); //문자형으로 형변환
                //System.out.println((char)fis.read());

        } catch (IOException e) {
            System.out.println(e);
        } finally{
            try {
                fis.close(); //파일 입력 스트림 닫기
            }catch (FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println(e); //읽으려는 파일 없을 경우 예외 처리
            } catch (NullPointerException e){ //스트림이 없을 경우 예외 처리
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}
