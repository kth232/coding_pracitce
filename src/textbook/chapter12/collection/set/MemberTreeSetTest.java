package textbook.chapter12.collection.set;


import textbook.chapter12.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet(); //결과값 정렬

        Member member1 = new Member(1003, "park");
        Member member2 = new Member(1001, "lee");
        Member member3 = new Member(1002, "kim");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);
        memberTreeSet.showAllMember();

        Member member4 = new Member(1003, "hong");  //1003 아이디 중복
        memberTreeSet.addMember(member4);
        memberTreeSet.showAllMember();

        //comparator를 사용하고 싶으면 어떻게 해야하지?
//        MemTreeSet<Member2> memberTreeSet2 = new MemTreeSet<Member2>(new Member2());
//
//        memberTreeSet2.addMember(new Member(102, "lee2"));
//        memberTreeSet2.addMember(new Member(103, "kim2"));
//        memberTreeSet2.addMember(new Member(101, "park2"));
//        memberTreeSet2.showAllMember();
    }
}
