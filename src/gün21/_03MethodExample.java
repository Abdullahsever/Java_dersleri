package gün21;

import java.util.Arrays;

public class _03MethodExample {
    public static void main(String[] args) {
        /*
         Bir ögrencinin isminin girildiği ve notlarinın ortalamasini bulan bir metot yazin.
         (Kac not aldigi belli degil)
         */
        ortalamaBul("mehmet",23,45,89,63);
        ortalamaBul("abdullah",77,88,96,52,32,18,99);
    }
    public  static void ortalamaBul(String name,int... notlar){
        int toplamNot=0;
        for (int i = 0; i <notlar.length ; i++) {
            toplamNot+=notlar[i];

        }
        int ortalama=toplamNot/notlar.length;
       System.out.println("öğrenci "+ name+" sınavlardan ortalama "+ortalama+" sonucunu almıştır");
    }
}
