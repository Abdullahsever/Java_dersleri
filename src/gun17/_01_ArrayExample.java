package gun17;

import java.util.Scanner;

public class _01_ArrayExample {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane sayi alin ve bu sayilarin tek olanlarini bir diziye atin
         */
        Scanner scanner=new Scanner(System.in);

        int[] dizi=new int[5];
        for (int i = 0; i < dizi.length; i++) {//diziye eleman eklemek için
            System.out.println("sayıları giriniz: ");
             dizi[i]=scanner.nextInt();

            }
        int miktar=0;
        for (int i = 0; i < dizi.length; i++) {//dizideki elemanları kontrol etmek için
            if (dizi[i]%2==1){
                System.out.println(dizi[i]);
                miktar++;


            }


        }
        System.out.println("miktar "+miktar);

    }
}
