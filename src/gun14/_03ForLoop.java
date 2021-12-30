package gun14;

import java.util.Scanner;

public class _03ForLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi girmesini isteyin ve
         bu sayinin faktoriyelini hesaplayin. Kullanici en fazla 24 girebilir
         Faktoriyel => 5 icin = 5*4*3*2*1 dir
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayı girin");
        int num=scanner.nextInt();
        double faktoriyel =1; // int 23 faktoriyelden fazlasını tutamıyor
        for (int i = 1; i <=num ; i++) {
            faktoriyel*=i;//faktoriyel=faktoriyel*i

        }
        System.out.println("faktoriyel "+faktoriyel);
    }
}
