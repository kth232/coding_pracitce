package textbook.chapter10.book;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf; //arraylist 선언

    public Shelf(){
        shelf = new ArrayList<String>(); //기본 생성자, shelf 클래스 생성 시 arrayList도 생성됨
    }

    public ArrayList<String> getShelf(){
        return shelf; //저장된 배열 반환
    }

    public int getCount(){
        return shelf.size(); //arraylist에 저장된 요소 개수 반환
    }
}
