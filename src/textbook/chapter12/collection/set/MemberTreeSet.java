package textbook.chapter12.collection.set;

import textbook.chapter12.collection.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet; //이진탐색트리 구현, 정렬되어 값 출력
    public MemberTreeSet(){
        treeSet = new TreeSet<Member>(); //comparator 인터페이스를 사용할 때 구현 객체를 매개변후로 전달
    }

    public void addMember(Member member){
        treeSet.add(member);
    }

    public boolean removeMember(int memberId){

        Iterator<Member> ir = treeSet.iterator();

        while( ir.hasNext()){
            Member member = ir.next();
            int tempId = member.getMemberId();
            if( tempId == memberId){
                treeSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "isn't empty");
        return false;
    }

    public void showAllMember(){
        for(Member member : treeSet){
            System.out.println(member);
        }
        System.out.println();
    }
}
