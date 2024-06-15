package textbook.chapter12.collection;

public class Member {
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
        return memberId; //해시코드 값으로 ID 출력
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Member){
            Member member = (Member)obj; //ID로 구분
            if( this.memberId == member.memberId )
                return true;
            else
                return false;
        }
        return false;
    }

//    @Override
//    public int compareTo(Member member) {
//
//        return (this.memberId - member.memberId);   //오름차순
//        //return (this.memberId - member.memberId) *  (-1);   //내림차순
//    }
}
