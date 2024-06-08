package week02_p;

public class Ex02 {
    public static String solution(int money) {
        int americano = 5500; //아메리카노 1잔당 5,500원
        int maxCups = money / americano;
        int remainMoney = money % americano;

        return "최대 잔 수: "+ maxCups + ", 잔 돈: " + remainMoney;
    } //주어진 돈 안에서 최대로 마실 수 있는 음료 잔 수와 잔돈 구하기

    public static void main(String[] args) {
        int money = 12000;
        String sol = solution(money);
        System.out.println(sol);
    }
}

