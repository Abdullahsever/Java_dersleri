package gun14;

import java.util.Scanner;

public class _01ContunieOrnek {

    /*
        Kullanicidan 5 pozitif tam sayi girmesini isteyin.
        Bu sayilardan 5 ile 10 arasindakiler haric, digerlerinin toplamini bulun.
        Bu soruda continue kullanin.
         */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("5 pozitif tam sayı girin ");
            int sayı = scanner.nextInt();
            if (sayı > 5 && sayı < 10) {
                continue;
            } else {
                toplam = toplam + sayı;
            }

        }


    }
}
