package gun13;

import java.util.Scanner;

public class _WhileOrnek2 {
    public static void main(String[] args) {
        /*
        0-10 arası Random bir sayı oluşurun.Kullanıcıya 5 hak verin.
        Eğer doğru tahmin ederse Tebrikler yazdırın.5 Kerede de bilemezse oyunu kaybettiniz yazdırın.
         */

        Scanner scanner=new Scanner(System.in);
         int random= (int)(Math.random()*10);//random double sayı üretir .int lazım olduğundan int çevirdik.
         int sayac=0;
         while (sayac<5){
             System.out.println("sayı girin ");
             int num=scanner.nextInt();
              if (num==random){
                  System.out.println("tebrikler");
                  break;//sayı doğru tahmin edilirse break  döngüyü kırar ve program sonlanır
              }else if (sayac==4){// 5.sayıda da bilemediğinde kaybettiniz yazdırması için
                  System.out.println("kaybettiniz");
                  //else olsaydı sadece her bilemediğinde kaybettiniz yazardı
                  System.out.println("random "+ random);// random sayıyı kaybettiğimizde gösterir.
              }
              sayac++;
         }
    }
}
