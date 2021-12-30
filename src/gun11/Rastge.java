package gun11;

import java.util.Scanner;

public class Rastge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("iki sayı giriniz: ");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();
        int carpma,toplama,cıkarma,bölme;
        carpma=sayi1*sayi2;
        toplama=sayi1+sayi2;
        cıkarma=sayi1-sayi2;
        bölme=sayi1/sayi2;
        scanner.nextLine();
        System.out.println("Toplam  için 'T' ,Çıkarma için'Ç', Çarpma için 'P',Bölme için 'B' tuşuna basınız");
        String islem=scanner.nextLine();
        if (islem.equalsIgnoreCase("T"))
            System.out.println(toplama);
        if(islem.equalsIgnoreCase("Ç"))
            System.out.println(cıkarma);
        if (islem.equalsIgnoreCase("P"))
            System.out.println(carpma);
        if (islem.equalsIgnoreCase("B"))
            System.out.println(bölme);

    }

}
