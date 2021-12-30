package gun17;

import java.util.Scanner;

public class _04_ArrayExample {
    public static void main(String[] args) {
        //girilen cümledeki kelime sayısı bulma
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cümle yazın");
        String str=scanner.nextLine();
        String[] cumle=new String[str.length()];
        int kelimeSayısı=1;
        for (int i = 0; i < cumle.length; i++) {
            cumle[i]=String.valueOf(str.charAt(i));
            if (str.charAt(i)==' '){
                kelimeSayısı++;
            }

        }
        for (String harf: cumle)
              {
                  System.out.print((harf+" "));
                  System.out.println();

        }
        System.out.println("kelime sayısı= "+kelimeSayısı);

    }
}
