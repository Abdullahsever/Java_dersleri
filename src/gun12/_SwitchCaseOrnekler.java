package gun12;

import java.util.Locale;
import java.util.Scanner;

public class _SwitchCaseOrnekler {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("iki sayı giriniz:");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.println("Toplama için 't', çıkarma için'c', Çarpma için 'p', bölme için'b' giriniz");
        scanner.nextLine();
        String islem=scanner.nextLine();
        String islem1=islem.toLowerCase(Locale.ROOT);

        switch (islem1){
            case"t":
                System.out.println("sonuç "+(num1+num2));
                break;
            case "c":
                System.out.println("sonuç "+(num1-num2));
                break;
            case "p":
                System.out.println("sonuç "+(num1*num2));
                break;
            case "b":
                if (num2!=0){
                    System.out.println("sonuç "+(num1/num2));
                }
                else {
                    System.out.println("tanımsız");
                }
                break;
            default:
                System.out.println("geçersiz işlem");
        }
    }
}
