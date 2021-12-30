package gun9;

import java.util.Scanner;

public class _02IfElseOrnekler {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ekrandan sayı girin: ");
        double sayı=scanner.nextDouble();
        if (sayı>0){
            System.out.println("Pozitif");
        }
        else if (sayı<0){
            System.out.println("Negatif");
        }
        else{
            System.out.println("sıfır");
        }

    }
}
