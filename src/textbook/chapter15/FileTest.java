package textbook.chapter15;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\coding practice\\coding_pracitce\\src\\textbook\\chapter15");
        //해당 경로에 file 클래스 생성(아직 실제 파일 생성 x)
        file.createNewFile(); //실제 파일 생성

        //파일 속성 확인하는 메서드 호출
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        file.delete(); //파일 삭제
    }
}
