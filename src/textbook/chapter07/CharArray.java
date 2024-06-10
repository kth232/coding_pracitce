package textbook.chapter07;

public class CharArray {
    public static void main(String[] args) {
        char[] alpahabets = new char[26]; //알파벳 문자 26개 문자형 배열 생성(배열은 크기 고정)
        char ch = 'A'; //a로 기준을 잡으면 소문자 알파벳 26개 출력됨

        for(int i = 0 ; i < alpahabets.length; i++, ch++){
            alpahabets[i] = ch;
        } //알파벳 문자 배열에 담기

        for(int i=0; i<alpahabets.length; i++){
            alpahabets[i] = (char) (alpahabets[i] + 32);
            //char 타입에 숫자를 더하면 자료형이 int로 변환됨
            // char 타입 변수에 값을 저장하므로 정수 연산 후 char 타입으로 명시적 형변환 필요함
        } //A = 65, a = 97 ,아스키 코드 대문자와 소문자는 32만큼 차이남, 교재 Q2 참고

        for(int i = 0; i < alpahabets.length; i++){
            System.out.println(alpahabets[i] + ":" + (int)alpahabets[i]);
        } //배열 요소 출력, 문자 자료형 정수형으로 명시적 형변환->아스키 코드 값 출력
    }
}
