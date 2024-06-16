package textbook.chapter12.collection.list;

import textbook.chapter12.collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemArrayList {
    private ArrayList<Member> arrayList;  // ArrayList 선언

    public MemArrayList(){
        arrayList = new ArrayList<Member>();  //멤버로 선언한 ArrayList 생성
    }

    public void addMember(Member member){  //ArrayList에 멤버 추가
        arrayList.add(member);
    }

    public String removeMember(int memberId){  // 멤버 아이디를 매개변수로, 삭제 여부를 반환

        for(int i =0; i<arrayList.size(); i++){ // 해당 아이디를 가진 멤버를 ArrayList에서 찾음
            Member member = arrayList.get(i); //get()로 회원 데이터 순차적으로 가져옴
            int tempId = member.getMemberId();
            if(tempId == memberId){ // 멤버ID가 매개변수와 일치하면
                arrayList.remove(i); // 해당 멤버를 삭제
                return "remove complete"; // true 반환
            }
        }

        Iterator<Member> ir = arrayList.iterator(); //iterator() 호출하여 Iterator 반환
        while(ir.hasNext()) { //요소가 있는 동안
            Member member = ir.next(); //다음 회원 반환
            int tempId = member.getMemberId();
            if(tempId == memberId){ // 멤버아이디가 매개변수와 일치하면
                arrayList.remove(member); // 해당 멤버를 삭제
                return "remove complete"; // true 반환
            }
        }

        System.out.println(memberId + "isn't exist");  //for 가 끝날때 까지 return이 안된 경우
        return "remove impossible";
    }

    public void showAllMember(){ //전체 회원 출력 메서드
        for(Member member : arrayList){
            System.out.println(member);
        }
        System.out.println();
    }
}
