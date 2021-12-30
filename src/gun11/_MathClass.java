package gun11;

import java.util.Scanner;

public class _MathClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi1= -15;
        int sayi2= 4;

        System.out.println("sayı1 nin mutlak değer = "+ Math.abs(sayi1));
        System.out.println("sayi1 ve sayi2 den büyük olan = "+ Math.max(sayi1,sayi2));
        System.out.println("sayi1 ve sayi2 den küçük olan = "+ Math.min(sayi1,sayi2));
        System.out.println("sayi2 nin karekökü= "+Math.sqrt(sayi2));
        System.out.println("2, 4 ve 8 arasından en büyük olan "+Math.max(2,Math.max(4,8)));
        System.out.println("2. nin 3 üncü kuvveti "+ Math.pow(2,3));
        Scanner sc = new Scanner(System.in);
        System.out.println("ekrana saniye girin");
        int saniye = sc.nextInt();

        int sn = saniye%60;
        int saat = saniye/60;
        int dakika = saat%60;
        saat = saat / 60;

        System.out.println(saat+":"+dakika+":"+sn);
    }

}
