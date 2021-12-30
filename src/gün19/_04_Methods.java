package gün19;

import java.util.Arrays;

public class _04_Methods {
    public static void main(String[] args) {
        /*
        6 elemanlı bir sayı dizisi oluşturun ve bu dizideki tek ve çift eleman sayısınu bulan bir metod yazın
         */
        int[] sayı={2,3,4,5,6,7};

        tekCift(sayı);

    }
    public static void tekCift(int[]  dizi){
        int tekSayıAdeti=0;
        int çiftSayıadeti=0;
        for (int i = 0; i < dizi.length; i++) {


            if (dizi[i] % 2 == 0) {
                System.out.println("çift");
                çiftSayıadeti++;

            } else {
                System.out.println("tek");
                tekSayıAdeti++;
            }

        }
        System.out.println("tekToplam "+ tekSayıAdeti);
        System.out.println("çift toplam "+çiftSayıadeti);
    }
}
