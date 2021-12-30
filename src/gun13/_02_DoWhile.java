package gun13;

import java.util.Scanner;

public class _02_DoWhile {
    public static void main(String[] args) {
        /*
        kullanıcından sıfır girene kadar  sayı girmesini isteyin
         */
        Scanner scanner=new Scanner(System.in);
        int num;
        do {
            System.out.println("sayı  girin");
            num=scanner.nextInt();
        }while (num!=0);
    }
}
