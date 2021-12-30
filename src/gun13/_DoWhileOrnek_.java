package gun13;

import java.util.Scanner;

public class _DoWhileOrnek_ {
    public static void main(String[] args) {
        /*
        Kullanıcıdan tam sayı girmesini isteyin.Bu sayıların karekökünü ekrana yazdırın. Kullanıcı sıfır girene kadar
        bu işlemi tekrarlayın.
         */
        Scanner scanner=new Scanner(System.in);
        int num;
        do {
            System.out.println("sayı girin");
            num=scanner.nextInt();

            int karekok=(int)(Math.sqrt(num));
            System.out.println("karekök =" + karekok);
        }while (num!=0);
    }
}
