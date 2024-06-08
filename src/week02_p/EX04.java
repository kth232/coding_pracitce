package week02_p;

public class EX04 {
    public static int solution(int price) {
        if (price >= 500000) {
            return (int)(price * 0.8); //50만원 이상 구매 시 20% 할인
        } else if (price >= 300000){
            return (int)(price * 0.9); //30만원 이상 구매 시 10% 할인
        } else if (price >= 100000) {
            return (int)(price * 0.95); //10만원 이상 구매 시 5% 할인
        } else{
            return price;
        }
    } //옷 가게 할인받기

    public static void main(String[] args) {
        int price = 280000;
        int sol = solution(price);
        System.out.println(sol);
    }
}
