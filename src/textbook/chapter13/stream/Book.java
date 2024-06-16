package textbook.chapter13.stream;

public class Book {
    String subject;
    int price;

    Book(String subject, int price){
        this.subject = subject;
        this.price = price;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
