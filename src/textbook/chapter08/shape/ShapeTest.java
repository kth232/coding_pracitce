package textbook.chapter08.shape;

import java.util.ArrayList;

public class ShapeTest {
    ArrayList<Shape> sList = new ArrayList<Shape>(); //shape 형으로 ArrayLIst 배열 객체 생성

    public void addShape()
    {
        sList.add(new Circle());    //ArrayList에 추가되면서 Shape 타입으로 묵시적 형변환(업캐스팅)
        sList.add(new Rectangle());
        sList.add(new Triangle());

        for( Shape s : sList){     // 배열의 요소들을 Shape 타입으로 꺼내서 draw 호출
            s.draw();              // 각자 클래스에 오버라이딩된 draw()가 호출됨
        }
    }

    public void testCasting()
    {
        for(int i=0; i<sList.size(); i++){ //모든 배열 요소들을 하나씩 반복
            Shape s = sList.get(i); //Shape 타입으로 가져옴
            if(s instanceof Circle){ //instanceof 속성으로 circle 형 확인
                Circle c = (Circle)s; //Circle로 명시적 형변환(다운캐스팅)
                c.circle();
            }
            else if(s instanceof Rectangle){ //instanceof 속성으로 rectangle 형 확인
                Rectangle r = (Rectangle)s; //rectangle로 명시적 형변환(다운캐스팅)
                r.rectangle();
            }
            else if(s instanceof Triangle){ //instanceof 속성으로 triangle 형 확인
                Triangle t = (Triangle)s; //triangle로 명시적 형변환(다운캐스팅)
                t.triangle();
            }
            else{
                System.out.println("This type is not supported");
            }
        }
    }

    public static void main(String[] args) {
        ShapeTest sTest = new ShapeTest(); //test객체 생성
        sTest.addShape();
        System.out.println("--DownCasting to the original type--");
        sTest.testCasting();

    }
}
