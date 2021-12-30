package gun14;

import java.util.Locale;
import java.util.Scanner;

public class _05ForLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan icinde a ve c de olacak sekilde bir kelime girmesini isteyin.
        Kelime icerisindeki a harflerinin sayisini bulun.
        c harfi görünce program sonlansin.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("içinde a ve c içeren kelime girin ");
        String kelime=scanner.nextLine();
        int aSayısı=0;
        for (int i = 0; i < kelime.length(); i++) {

           if (kelime.toLowerCase().charAt(i)=='a'){
               aSayısı++;

           }else if(kelime.toLowerCase().charAt(i)=='c'){
               break;
           }

        }
        System.out.println("aSayısı = " + aSayısı);

    }
}
