package gun15Cmrtsi;

import java.util.Scanner;

public class _03SwitchCase3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayı gir");
        int gun=scanner.nextInt();


        switch (gun){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("haftaiçi");
                break;
            default: //default en sonda olursa break; yazmaya ihtiyaç yoktur.
                System.out.println("haftasonu");


        }


    }
}
