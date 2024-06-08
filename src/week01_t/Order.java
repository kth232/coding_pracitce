package week01_t;

public class Order {
    String orderNum;
    String id;
    String date;
    String name;
    String productsNum;
    String address;

    @Override
    public String toString() {
        return "주문번호='" + orderNum + '\'' +
                ", 주문자 ID='" + id + '\'' +
                ", 주문 날짜='" + date + '\'' +
                ", 주문자명='" + name + '\'' +
                ", 주문상품 번호='" + productsNum + '\'' +
                ", 배송 주소='" + address;
    }
}
