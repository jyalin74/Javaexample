package java0321;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        // myDate.day = 31; 오류
        myDate.setDay(31);
        int day = myDate.getDay();
        System.out.println(day);
    }
}