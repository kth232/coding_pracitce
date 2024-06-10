package textbook.chapter05;

import java.util.Calendar;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean isValid = true; //유효값 검사, default = true


    public MyDate (int day, int month, int year){ //생성자 함수
        setYear(year);
        setMonth(month);
        setDay(day); //함수를 통해 대입 값 검증

        /*
        setDay(day); //함수를 통해 대입 값 검증
        setMonth(month); //month를 가지고 day 값을 검증하기 때문에 month보다 day가 앞에 오면 안됨
        setYear(year);
         */
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        switch(month){// month 값을 가지고 검증하기 때문에 set 순서 중요함!
            case 1, 3, 5, 7, 8, 10, 12: //해당 월일 때 1-31일까지
                if (day < 0 || day > 31) {
                    isValid = false;
                } else {
                    this.day = day;
                }
                break;
            case 4, 6, 9, 11: //해당 월일 때 1-30일까지
                if (day < 0 || day > 30) {
                    isValid = false;
                } else {
                    this.day = day;
                }
                break;
            case 2:
                //윤년 계산: 4로 나누어 떨어지고 100으로 나누어 떨어지지 않는 해, 400으로 나누어 떨어지는 해
                if (( year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0) {
                    if (day < 0 || day > 29){ //윤년 2월은 29일까지
                        isValid = false;
                    } else {
                        this.day = day;
                    }
                } else {
                    if (day < 0 || day > 28){ //평년 2월은 28일까지
                        isValid = false;
                    } else {
                        this.day = day;
                    }
                }
                break;
            default:
                isValid = false;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12){
            isValid = false;
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > Calendar.getInstance().get(Calendar.YEAR)){
            //Calendar util 클래스 사용
            //로컬에서 사용하는 default time zone의 YEAR 값 가져옴
            isValid = false;
        } else {
            this.year = year;
        }
    }
    public String isValid() {
        if (isValid) {
            return "Valid Date";
        } else {
            return "Invalid Date";
        }
    }

    @Override
    public String toString() {
        return  "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", isValid=" + isValid;
    }
}
