package week01_t;

public class Ex01 {
    public static void main(String[] args) {
        int line=4;
        for(int i = 1; i<=line; i++) {
            for(int k = line ; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=1; j <=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
