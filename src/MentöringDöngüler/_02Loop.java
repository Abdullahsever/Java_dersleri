package MentöringDöngüler;

import java.util.Scanner;

public class _02Loop {
    public static void main(String[] args) {
        //Calculate the sum of digits of a number given by user. E.g.-
//    INUPT : 123        OUPUT : 6
//    INUPT : 12345      OUPUT : 15

       /* int toplam = 0;
        int sayi=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi girin");
        sayi=scanner.nextInt();
        String str=String.valueOf(sayi);

        for (int i = 0; i < str.length(); i++) {
            if(sayi!=0){
                toplam+=sayi%10;
                sayi=sayi/10;
            }

        }
        System.out.println(toplam);

        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı girin ");
        int sayı=scanner.nextInt();
        int toplam=0;
        while (sayı>0) {
            int rakam = sayı % 10;
            toplam += rakam;
            sayı = sayı / 10;
        }
        System.out.println(toplam);





    }
}
