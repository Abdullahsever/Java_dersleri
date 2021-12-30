package gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayı giriniz ");
        int num=scanner.nextInt();
        int toplam=(num*(num+1))/2;
        System.out.println(toplam);
    }
}
