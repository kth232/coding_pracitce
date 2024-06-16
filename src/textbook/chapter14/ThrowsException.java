package textbook.chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
        //메서드가 호출될 때 예외 처리하도록 미룸
        FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException 발생 가능
        Class c = Class.forName(className);  //ClassNotFoundException 발생 가능
        return c;
    }

    public static void main(String[] args) {

        ThrowsException test = new ThrowsException();

        try {
            test.loadClass("a.txt", "java.lang.String");

        } catch (FileNotFoundException e) { //각 예외 상황마다 다른 방식으로 처리함
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            //} catch (FileNotFoundException | ClassNotFoundException e) { //여러 예외 처리를 한 문장으로 처리 가능
            // e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            //예외 클래스의 최상위 클래스로 다른 catch 블록에 선언한 것 외에 다른 예외가 발생하더라도 자동 형변환
            //모든 예외처리가 Exception 클래스에 의해 처리되므로 가장 아래쪽에 배치해야 함
            // ->다른 catch블록에 예외가 도달하지 못해 컴파일 오류 발생
        }
    }
}