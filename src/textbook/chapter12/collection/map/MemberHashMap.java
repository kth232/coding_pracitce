package textbook.chapter12.collection.map;

import textbook.chapter12.collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberId(), member); //키-값 쌍으로 추가

    }

    public boolean removeMember(int memberId){
        if(hashMap.containsKey(memberId)){
            hashMap.remove(memberId); //중복되는 ID가 있다면 해당 회원 삭제
            return true;
        }

        System.out.println(memberId + "isn't exist");
        return false;
    }

    public void showAllMember(){
        Iterator<Integer> ir = hashMap.keySet().iterator(); //key값을 set 객체로 반환(중복 불가), Iterator로 순회하며 전체 회원 출력
        while (ir.hasNext()){ //다음 키가 있다면
            int key = ir.next(); //키 값 가져옴
            Member member = hashMap.get(key); //키로 value 가져오기
            System.out.println(member);
        }
        System.out.println();
    }
}
