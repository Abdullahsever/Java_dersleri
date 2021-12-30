package gün19;

import java.util.Scanner;

public class _03_Methods {
    public static void main(String[] args) {
        /*
        Kullanıcının gireceği sayının tek mi çift mi olduğunu bulan bir metod yazın
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı girin ");
        int sayı = scanner.nextInt();
        tekMiCiftMi(sayı);
    }

    public static void tekMiCiftMi(int num) {
        if (num % 2 == 1) {
            System.out.println("sayı tektir");
        } else {
            System.out.println("sayı çifttir");
        }
    }
}
