package gun17;

import java.util.Scanner;

public class _05ArrayExample {
    public static void main(String[] args) {
        /*
        kullanıcıdan 5 tane sayı  isteyin.
        bu sayılardan ortalamayı geçen sayı miktarını bulun
         */
        Scanner scanner=new Scanner(System.in);
        
        int[] sayılar=new int[5];
        int toplam=0;
        for (int i = 0; i <sayılar.length ; i++) {
            System.out.println("sayı girin");
            sayılar[i]=scanner.nextInt();
            toplam+=sayılar[i];
            
        }
        int ortalama=toplam/ sayılar.length;
        int miktar=0;

        for (int sayı:sayılar) {
            if (sayı>ortalama) {
                miktar++;
            }
        }
        System.out.println("miktar "+miktar);
            
        }
    }

