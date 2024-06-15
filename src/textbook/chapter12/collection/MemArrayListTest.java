package textbook.chapter12.collection;

public class MemArrayListTest {
    MemArrayList MemArrayList = new MemArrayList();

    Member member1 = new Member(1001, "lee");
    Member member2 = new Member(1002, "kim");
    Member member3 = new Member(1003, "park");
    Member member4 = new Member(1004, "hong");

    MemArrayList.addMember(member1);
    MemArrayList.addMember(member2);
    MemArrayList.addMember(member3);
    MemArrayList.addMember(member4);

    MemArrayList.showAllMember();

    MemArrayList.removeMember(member4.getMemberId());
    MemArrayList.showAllMember();
}
