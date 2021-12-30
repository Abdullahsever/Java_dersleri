package gun16;

import java.util.Scanner;

public class _05_Array {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane pozitif tam sayi girmesini isteyin.
        Bu sayilari bir diziye atin. Bu sayilardan en büyügünü ekrana yazdirin.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("5 tane sayı girin");
        int[] array=new int[5];
        int enbyk =0;
        for (int index = 0; index < array.length; index++) {
            System.out.println("sayı girin");
            array[index]=scanner.nextInt();
            if(array[index]> enbyk){
                enbyk =array[index];
            }
        }
        System.out.println("en büyük sayı: "+enbyk);




    }
}
