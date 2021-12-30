package gun15Cmrtsi;

import java.util.Scanner;

public class _02SwitchCase2 {
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
                System.out.println("haftaiçin");
                break;
            case 6:
            case 7:
                System.out.println("haftasonu");
                break;

        }


    }
}
