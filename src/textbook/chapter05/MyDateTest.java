package textbook.chapter05;


public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(30, 2, 2000);
        System.out.println(date1);
        System.out.println(date1.isValid());

        MyDate date2 = new MyDate(2, 10, 2006);
        System.out.println(date2);
        System.out.println(date2.isValid());

        MyDate date3 = new MyDate(10, 6, 2006);
        System.out.println(date3);
        System.out.println(date3.isValid());

        MyDate date4 = new MyDate(30, 2, 2000);
        System.out.println("date1.equals(date4)" + date1.equals(date4)); //값 비교

        System.out.println(date1.hashCode());
        System.out.println(date4.hashCode());
    }
}
