package java0425;

import java.util.Arrays;

public class Midterm {
    public static void numCheek(int num[]){
        int intArray[] = new int[20];

        for (int i=0; i<num.length; i++){
//            System.out.println(i);
//            for (int j=0; j<10; j++){
//                if (num[i] == j){
//                    intArray[j]++;
//                }
//            }
            intArray[num[i]]++;
        }

        boolean bool = true;
        for (int k=0; k<intArray.length; k++){
            if (intArray[k]>1){
                bool = false;
                break;
            }
        }
        System.out.println(Arrays.toString(num) + ":" + bool);
    }
    public static void main(String[] args) {
        int i1[] = {0,1,2,3,4,5,6,7,8,9};
        int i2[] = {1,2,5,0,1,2,3,4,5,6,7,8,9};
        int i3[] = {0,1,2,9,9,5,6,7,8,9};
        int i4[] = {0,1,2,3,8,9};
        int i5[] = {5,6,7,8,9};

        numCheek(i1);
        numCheek(i2);
        numCheek(i3);
        numCheek(i4);
        numCheek(i5);
    }
}
