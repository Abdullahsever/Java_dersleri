package gun14;

import java.util.Scanner;

public class _01_Continue {
    public static void main(String[] args) {
        /*
    Kullanıcıdan bir cümle girmesini isteyin. Cümledeki her harfi alt alta yazdırın. Boşluk gelirse boşluğu yazdırmayın
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("cümle girin");
        String cumle =scanner.nextLine();

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i)==' '){
                continue;
            }
            System.out.println(cumle.charAt(i));


        }
    }
}
