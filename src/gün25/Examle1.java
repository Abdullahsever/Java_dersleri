package gün25;

import java.util.HashSet;

public class Examle1 {
    public static void main(String[] args) {
        sayılar(2);
        sayılar(2,3,4,5,2);

    }
    public static void sayılar (int...nums){
        HashSet<Integer> sayılar=new HashSet<>();
        for (int num: nums) {
            sayılar.add(num);

        }
        System.out.println(sayılar);

    }
}
