package gun12;

import java.util.Scanner;

public class _04WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 sayi isteyin.
        Bu sayilardan en büyügünü ekrana yazdirin.
         */
        Scanner scanner=new Scanner(System.in);
        int enbSayi=0;
        int i =0;
        while (i<5){
            System.out.println("Sayı girin");
            int num=scanner.nextInt();

            if(num>enbSayi){
                enbSayi=num;
            }
            i++;
        }
        System.out.println("enbyük "+ enbSayi);
    }
}
