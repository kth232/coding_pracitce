package textbook.chapter07;

public class TwoDimension {
    public static void main(String[] args) {

        char[][] alphabets = new char[2][13]; //2행 13열 2차원 배열 생성
        char ch = 'a'; //소문자 a로 기준

        for(int i=0; i<alphabets.length; i++) { // 행 길이만큼 반복
            for(int j=0; j<alphabets[i].length; j++) { //열 길이만큼 반복
                alphabets[i][j] = ch; //2차원 배열에 알파벳 소문자 값 저장
                System.out.print(alphabets[i][j] + " "); //배열 요소 출력, 문자 사이에 공백 추가
                ch++;
            }
            System.out.println();  //행 출력 끝나면 한 줄 띄움
        }
    }
}
