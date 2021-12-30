package gun12;

import java.util.Locale;
import java.util.Scanner;

public class _02_SwitchCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bugün haftanın hangi günü?");
        String day=scanner.nextLine();
        String day1=day.toLowerCase(Locale.ROOT);


        switch (day1){
            case "pazartesi":
                System.out.println("1.gün");
                break;
            case "salı":
                System.out.println("2.gün");
                break;
            case "çarşamba":
                System.out.println("3.günü");
                break;
            case  "perşembe":
                System.out.println("4.günü");
                break;
            case "cuma":
                System.out.println("5.gün");
                break;
            case  "cumartesi":
                System.out.println("6.günü");
                break;
            case  "pazar":
                System.out.println("7.günü");
                break;
            default:
                System.out.println("Geçersiz gün ismi");
        }
    }

}
