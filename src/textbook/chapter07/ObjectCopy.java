package textbook.chapter07;

import java.util.Arrays;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];
        Book[] bookArray3 = new Book[3];

        //array1 인스턴스 생성 후 책 이름, 저자 값 저장
        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

        //array1 배열의 0번째부터 3개 요소를 array2 0번째에 복사하는 메서드
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        //array2 배열 요소, 책 정보 출력
        System.out.println("=== bookArray2(array1 copy) ===");
        for(int i = 0; i < bookArray2.length; i++){
            bookArray2[i].showBookInfo();
        }

        bookArray3[0] = new Book(); //array3 객체 직접 생성(기본 생성자)
        bookArray3[1] = new Book();
        bookArray3[2] = new Book();

        for(int i=0; i<bookArray1.length; i++){   // array1의 각 요소를 직접 복사(깊은 복사)
            bookArray3[i].setBookName(bookArray1[i].getBookName());
            bookArray3[i].setAuthor(bookArray1[i].getAuthor());
        }

        //array1의 0번째 요소 값 변경
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        //array1 배열 요소, 책 정보 출력
        System.out.println("=== bookArray1 ===");
        for(int i = 0; i < bookArray1.length; i++){
            bookArray1[i].showBookInfo();
        }

        //array2 배열 요소, 책 정보 출력
        // 얕은 복사(참조주소 복사)로 array1 변경 시 array2도 같이 변경됨
        System.out.println("=== bookArray2 ===");
        for(int i=0; i<bookArray2.length; i++){
            bookArray2[i].showBookInfo();
        }

        //array3 배열 요소, 책 정보 출력
        // 깊은 복사(값 복사)로 array1 변경 시 array3은 영향x
        System.out.println("=== bookArray3 ===");
        for(int i=0; i<bookArray3.length; i++){
            bookArray3[i].showBookInfo();
        }

    }
}
