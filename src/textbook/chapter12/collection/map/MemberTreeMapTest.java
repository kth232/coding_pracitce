package textbook.chapter12.collection.map;

import textbook.chapter12.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberHashMap = new MemberTreeMap(); //treemap: 정렬되어 값 출력

        Member member3 = new Member(1003, "park");
        Member member1 = new Member(1001, "lee");
        Member member4 = new Member(1004, "hong");
        Member member2 = new Member(1002, "kim");

        memberHashMap.addMember(member3);
        memberHashMap.addMember(member1);
        memberHashMap.addMember(member4);
        memberHashMap.addMember(member2);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();
    }
}
