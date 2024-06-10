package textbook.chapter07;

public class Book {
    private String bookName; //책 이름
    private String author;

    public Book(){} //기본 생성자

    public Book(String bookName, String author){ //매개변수가 있는 생성자 오버로드
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    //책 이름, 저자 정보 출력하는 함수
    public void showBookInfo(){
        System.out.println("Book Name: " + bookName + "/ Author: " + author);
    }
}
