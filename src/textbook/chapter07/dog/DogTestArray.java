package textbook.chapter07.dog;

public class DogTestArray {
    public static void main(String[] args) {
        Dog[] dogArray = new Dog[5]; //크기가 5인 배열 생성
        dogArray[0] = new Dog("멍멍이", "치와와");
        dogArray[1] = new Dog("뽀삐", "진돗개");
        dogArray[2] = new Dog("순심이", "삽살개");
        dogArray[3] = new Dog("철이", "마르티스");
        dogArray[4] = new Dog("초코", "푸들"); // 배열 요소에 각 인스턴스 값 추가


        for(int i =0; i<dogArray.length; i++) { //배열 길이만큼 반복하여 각 배열 요소에 저장된 강아지 정보 출력
            System.out.println(dogArray[i].showDogInfo());
        }
        System.out.println("-----------");
        for(Dog dog : dogArray) { //향상된 for문, Dog 클래스 자료형 dog 변수에 dogArray 배열 각 요소 대입
            System.out.println(dog.showDogInfo()); //강아지 정보 출력
        }
    }
}
