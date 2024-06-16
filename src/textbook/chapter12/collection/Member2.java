package textbook.chapter12.collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2>, Comparable<Member2> {
    private int memberId;        //회원 아이디
    private String memberNm;   //회원 이름

    public Member2(int memberId, String memberNm){ //생성자
        this.memberId = memberId;
        this.memberNm = memberNm;
    }

    public int getMemberId() {  //
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getMemberNm() {
        return memberNm;
    }
    public void setMemberNm(String memberNm) {
        this.memberNm = memberNm;
    }

    @Override
    public String toString(){   //toString 메소드 오버로딩
        return "name: " + memberNm + " / ID: " + memberId;
    }

    @Override
    public int hashCode() {
        return memberId; //해시코드 값으로 ID 반환
    }

    @Override
    public int compare(Member2 mem1, Member2 mem2) { //comparator 인터페이스를 사용할 때 구현해야할 메서드
        //전달받은 두 매개변수를 비교함, 첫번째 매개변수가 더 클 때 양수 반환=오름차순
        //return mem1.getMemberId()-mem2.getMemberId();
        return (mem1.compareTo(mem2))* -1; //내림차순
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member2) {
            Member2 member = (Member2) obj; //ID로 구분
            if (this.memberId == member.memberId) //ID가 같을 경우
                return true;
            else
                return false;
        }
        return false;
    }

    @Override
    public int compareTo(Member2 member2) {
        return (this.memberId - member2.memberId);
    }
}
