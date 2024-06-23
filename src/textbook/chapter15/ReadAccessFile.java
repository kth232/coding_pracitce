package textbook.chapter15;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadAccessFile { //파일 입출력을 동시에 할 수 있는 클래스
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw"); //rw: 읽기, 쓰기 가능
        rf.writeInt(100); //4byte
        System.out.println("파일 포인터 위치:" + rf.getFilePointer()); //파일 포인터: 어느 위치에서 읽고 쓰는지 가리킴(0에서부터 시작)
        rf.writeDouble(3.14); //8byte
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());
        rf.writeUTF("안녕하세요"); //한글(3byte) * 5 + null(2byte) = 17byte
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());

        rf.seek(0); //포인터 위치 변경해주는 메서드(0으로 옮김)
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());

        int i = rf.readInt(); //읽어올 때 저장할 때 사용한 자료형과 맞게 메서드 사용해야 함
        double d = rf.readDouble();
        String str = rf.readUTF();


        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());
    }
}
