package textbook.chapter12.collection.set;

import textbook.chapter12.collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet(){
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){

        Iterator<Member> ir = hashSet.iterator(); //Iterator를 활용해 순회함

        while( ir.hasNext()){ //요소가 있는 동안
            Member member = ir.next(); //회원을 하나씩 가져옴
            int tempId = member.getMemberId(); //ID 비교
            if( tempId == memberId){ //같은 아이디인 경우
                hashSet.remove(member); //회원 삭제
                return true;
            }
        }
        System.out.println(memberId + "isn't exist");
        return false;
    }

    public void showAllMember(){ //모든 회원 출력
        for(Member member : hashSet){
            System.out.println(member);
        }
        System.out.println();
    }
}
