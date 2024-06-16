package textbook.chapter12.collection.set;

import textbook.chapter12.collection.Member;

public class MemberHashsetTest {
    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(1001, "lee");
        Member member2 = new Member(1002, "kim");
        Member member3 = new Member(1003, "park");


        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);
        memberHashSet.showAllMember();

        Member member4 = new Member(1003, "hong");  //1003 아이디 중복
        memberHashSet.addMember(member4); //추가 안됨
        memberHashSet.showAllMember();
    }
}
