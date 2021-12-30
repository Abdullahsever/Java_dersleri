package gun12;

import java.util.Scanner;

public class _05WhileSoru {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int girilen=scanner.nextInt();
        int i=0;
        int toplam=0;
        while (i<=girilen){
            toplam+=i;
            i++;
        }
        System.out.println("toplam= "+toplam);


    }

}
