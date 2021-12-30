package gun6;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class EkrandanVeriAlma {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //String isim= sc.next();
        //System.out.println("isminiz: "+ isim);
        System.out.println("-----------------");
       // String cumle = sc.nextLine();
        //System.out.println("cümle :" +cumle);
        /*System.out.println("Bİr sayı girin :");
        System.out.println("ikinci sayı girin :");
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println(a+b);

         */

        System.out.println("Dikdörgenin ilk kenarı");
        double a = sc.nextDouble();
        System.out.println("Dikdörtgenin ikinci kenarı");
        double b =sc.nextDouble();
        System.out.println("alanı: "+(a*b));



    }
}
