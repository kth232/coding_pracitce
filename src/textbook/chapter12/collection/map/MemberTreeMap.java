package textbook.chapter12.collection.map;

import textbook.chapter12.collection.Member;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap; //이진 검색 트리로 구현, 정렬되어 값 출력

    public MemberTreeMap()
    {
        treeMap = new TreeMap<Integer, Member>();
    }

    public void addMember(Member member){
        treeMap.put(member.getMemberId(), member); //키-값 쌍으로 추가
    }

    public boolean removeMember(int memberId){
        if(treeMap.containsKey(memberId)){
            treeMap.remove(memberId); //키값(ID)에 맞는 자료 삭제
            return true;
        }

        System.out.println(memberId + "isn't exist");
        return false;
    }

    public void showAllMember(){
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while (ir.hasNext()){
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
