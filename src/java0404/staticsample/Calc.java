package java0404.staticsample;

public class Calc {
    public static int abs(int a) {  // abs: 절대값
        /*
        삼항연산자

        int a = (조건) ? a : b;

        int s= 0;
        if (조건) {
            s = a
        } else {
            s = b
        }
        */
        return a > 0 ? a : -a; //a와 b를 비교해서 크면 a 작으면 -를 a에 곱해서 리턴
    }
    public static int max(int a, int b){
        return a > b ? a : b; //a와 b를 비교해서 크면 a 작으면 b 리턴
    }
    public static int min(int a, int b){
        return a < b ? a : b; //a와 b를 비교해서 작으면 a 크면 b 리턴
    }
}
