package gün19;

import java.util.Arrays;
import java.util.Scanner;

public class _05_Methods {
    public static void main(String[] args) {
        /*
        Kullanicidan aralarinda bir bosluk birakarak 5 tam sayi girmesini isteyin.
        Bu sayilardan en büyügünü ve en kücügünü bulan iki farkli metot yazin.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayılar arasında boşluk bırakarak  gir");
        String sayilarcümle=scanner.nextLine();
        String[] array=sayilarcümle.split(" ");
        int[] sayılar=new int[array.length];
        for (int i = 0; i < sayılar.length; i++) {
            sayılar[i]=Integer.parseInt(array[i]);

        }
        enbArray(sayılar);
        enkArray(sayılar);



    }
    public static void enkArray(int[] sayılar){
        Arrays.sort(sayılar);
        System.out.println("en küçük sayı= "+sayılar[0]);
    }
    public static void enbArray(int[] sayılar){
        Arrays.sort((sayılar));
        System.out.println("en büyük sayı="+sayılar[sayılar.length-1]);
    }
}
