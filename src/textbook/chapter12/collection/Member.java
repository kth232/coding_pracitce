package textbook.chapter12.collection;

import java.util.Comparator;

public class Member implements Comparable<Member> {
    private int memberId;        //회원 아이디
    private String memberNm;   //회원 이름

    public Member(int memberId, String memberNm){ //생성자
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

    //@Override
    public int compare(Member mem1, Member mem2) { //comparator 인터페이스를 사용할 때 구현해야할 메서드(전달받은 값 2개 비교)
        //전달받은 두 매개변수를 비교함, 첫번째 매개변수가 더 클 때 양수 반환=오름차순
        //인터페이스 구현체를 만들어야 함, 하지만 웬만하면 거의 사용 x, 주로 만들어져 있는 것을 사용함
        return mem1.compareTo(mem2);
        //return mem1.getMemberId()-mem2.getMemberId();
        //return (mem1.compareTo(mem2))* -1; //내림차순
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Member){
            Member member = (Member)obj; //ID로 구분
            if( this.memberId == member.memberId ) //ID가 같을 경우
                return true;
            else
                return false;
        }
        return false;
    }

    @Override
    public int compareTo(Member member) { //treeSet에서 정렬하기 위한 Comparable 인터페이스의 추상 메서드(자기 자신과 전달받은 값 비교)
        //노드와 비교하여 작으면 왼쪽, 크면 오른쪽으로 이동
        return (this.memberId - member.memberId);   //오름차순, 추가한 회원 ID와 매개변수로 받은 회원 ID를 비교
        //return (this.memberId - member.memberId) *  (-1);   //내림차순, 반환값을 음수로 만듦
    }
}
