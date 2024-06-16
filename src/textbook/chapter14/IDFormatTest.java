package textbook.chapter14;

public class IDFormatTest {
    private String userID;

    public String getUserID(){
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException{ //사용자 지정 예외 처리
        //setUserID()가 호출될 때 처리하도록 미룸
        if(userID == null){
            throw new IDFormatException("아이디는 null 일 수 없습니다"); //예외 강제 발생
        }
        else if( userID.length() < 8 || userID.length() > 20){
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요"); //예외 강제 발생
        }
        this.userID = userID;
    }

    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();

        String userID = null; //ID가 null인 경우
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        userID = "1234567"; //ID가 8자 이하인 경우
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
