package textbook.chapter11.object;

public class Person {
    public int regNo; //주민등록번호
    public String name;
    public int age;

    public Person(){}

    public Person(int regNo, String name, int age){
        this.regNo = regNo;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() { //toString 재정의
        return "register No: "+ regNo + " / name: "+ name + " / age: " + age;
    }

    public boolean equals(Object obj) { //Object 클래스의 equals() 재정의
        if(obj instanceof Person){ //자료형 확인
            Person person = (Person)obj; //person 형으로 형변환
            if(regNo == person.regNo) //주민등록번호로 person 구분
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() { //키 값(객체 정보)을 통해 인스턴스 주소 값을 반환하는 함수
        return regNo; //해시코드 값으로 주민번호를 반환하도록 재정의
    }
}
