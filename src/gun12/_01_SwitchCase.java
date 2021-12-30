package gun12;

import java.util.Scanner;

public class _01_SwitchCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bugün haftanın kaçıncı günü?");
        int day=scanner.nextInt();
        switch (day){
            case 1 :
            System.out.println("Bugün pazartesi");
            break; // programın burada sonlanmasını saglar.break sadece switch -case e ait bir komut değil.
            case 2:
                System.out.println("Bugün salı");
                break;
            case 3 :
                System.out.println("Bugün çarşamba");
                break;
            case  4:
                System.out.println("Bugün perşemne");
                break;
            case  5:
                System.out.println("Bugün cuma");
                break;
            case  6:
                System.out.println("Bugün cumartesi");
                break;
            case  7:
                System.out.println("Bugün pazar");
                break;
            default:
                System.out.println("Geçersiz Tarih");
        }
    }
}
