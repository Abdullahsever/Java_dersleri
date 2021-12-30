package gun17;

import java.util.Scanner;

public class _03_ArrayExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] sayılar=new int[5];

        int enb=0;
        for (int i = 0; i < sayılar.length ; i++) {
            System.out.println("sayı girin ");
            sayılar[i]=scanner.nextInt();

        }
        for (int sayı :sayılar) {
            int yüzler=(sayı/100)%10;
            if (yüzler>enb){
                enb=yüzler;
            }

        }
        System.out.println("enb ="+ enb);
    }
}
