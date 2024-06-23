package textbook.chapter15.serialization;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Person person1 = new Person("kim", "대표이사");
        Person person2 = new Person("lee", "상무이사");

        try(FileOutputStream fos = new FileOutputStream("serial.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(person1); //파일에 작성
            oos.writeObject(person2);

        }catch(IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("serial.out");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            Person p1 = (Person)ois.readObject(); //파일에 작성된 값 읽어오기
            Person p2 = (Person)ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     //externalizable test
     public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person1 = new Person("kim", "대표이사");
        Person person2 = new Person("lee", "상무이사");

        FileOutputStream fos = new FileOutputStream("external.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

       try(fos; oos){
           oos.writeObject(person1); //파일에 작성
           oos.writeObject(person2);
       } catch (IOException e){
           e.printStackTrace();
       }

        FileInputStream fis = new FileInputStream("external.out");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person p1 = (Person)ois.readObject();
        Person p2 = (Person)ois.readObject();

        System.out.println(p1);
        System.out.println(p2);
    }
    */
}
