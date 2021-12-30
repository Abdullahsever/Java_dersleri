package gun16;

import java.util.Scanner;

public class _03_Array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("kaç elemanlı dizi olsun");
        int num=scanner.nextInt();
        int[] nums= new int[num];
        for (int i = 0; i < nums.length; i++) {
            //Diziyi doldurmak için döngü
            System.out.println("numara girin eklensin");
            nums[i]=scanner.nextInt();

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");

        }
    }
}
