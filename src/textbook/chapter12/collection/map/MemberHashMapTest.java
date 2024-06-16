package textbook.chapter12.collection.map;

import textbook.chapter12.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member member1 = new Member(1001, "lee");
        Member member2 = new Member(1002, "kim");
        Member member3 = new Member(1003, "park");
        Member member4 = new Member(1004, "hong");

        memberHashMap.addMember(member1);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);
        memberHashMap.addMember(member4);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004); //ID 값을 사용하여 회원 삭제
        memberHashMap.showAllMember();
    }
}
