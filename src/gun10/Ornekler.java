package gun10;

import java.util.Scanner;

public class Ornekler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        kullanicidan yan yana aralarinda bir bosluk olacak
        sekilde 2 tamsayi isteyin. bu sayilarin tek mi cift mi oldugunu kontrol edin
         */

        /*System.out.println("yan yana aralarinda bir bosluk olacak\n" +
                "        sekilde 2 tamsayi yazin");

        String sayilar = scanner.nextLine();
        System.out.println(sayilar);

        int bosluk = sayilar.indexOf(" ");
        String sayi1 = sayilar.substring(0, bosluk);
        String sayi2 = sayilar.substring(bosluk + 1);

        int sayi1Int = Integer.parseInt(sayi1);
        System.out.println(sayi1Int);
        int sayi2Int = Integer.parseInt(sayi2);
        System.out.println(sayi2Int);

        if (sayi1Int % 2 == 0) {
            System.out.println("1. sayi cifttir");
        } else {
            System.out.println("1. sayi tektir");
        }

        if (sayi2Int % 2 == 0) {
            System.out.println("2. sayi cifttir");
        } else {
            System.out.println("2. sayi tektir");
        }

         */
        //ekrandan şifre isteyin bu şifre;
        //1.en az 6 karakter olmalı 2.içerisinde "pass" yada "sifre" olmamalı 3.en fazla 12 karakter olmalı
        // bu şartları sağlıyorsa şifre başarılı değilse başarısız yazmalı
        /*System.out.println("lütfen şifrenizi giriniz: ");
        String istenen=scanner.nextLine();
        if (istenen.length()>=6 && !(istenen.contains("pass") || istenen.contains("sifre")) && istenen.length()<=12){
            System.out.println("şifre başarılı");
        }
        else {
            System.out.println("şifre başarısız");
        }

         */
        System.out.println("Dersi ve notu giriniz: Mat: 90 şeklinde");
        String dersVeNot = scanner.nextLine();
        int boslukIndex=dersVeNot.indexOf(" ");
        String notStr =dersVeNot.substring(boslukIndex+1);
        int not =Integer.parseInt(notStr);

        if (not>=90){
            System.out.println("A");
        }
        else if (not>=80){
            System.out.println("B");
        }
        else if (not>=70){
            System.out.println("C");
        }
        else if (not>=60){
            System.out.println("D");
        }
        else if (not>=50){
            System.out.println("F");
        }
        else{
            System.out.println("kaldın tebrikler");
        }
    }
}
