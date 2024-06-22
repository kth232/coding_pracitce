package textbook.chapter15.wrapperStream;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("data.txt");
            DataOutputStream dos = new DataOutputStream(fos)) //자료형을 그대로 보존하는 dataStream
        {
            //각 자료형에 따라 다르게 처리함->같은 자료형 메서드로 순서대로 읽어오지 않으면 같은 값을 가져올 수 없다
            dos.writeByte(100);
            dos.writeChar('A');
            dos.writeInt(10);
            dos.writeFloat(3.14f);
            dos.writeUTF("Test");
        }catch(IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("data.txt");
            DataInputStream dis = new DataInputStream(fis))
        {
            System.out.println(dis.readByte()); //자료형에 맞게 읽어와서 순서대로 출력
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readUTF());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
