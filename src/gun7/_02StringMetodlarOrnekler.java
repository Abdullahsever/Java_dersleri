package gun7;

import java.util.Scanner;

public class _02StringMetodlarOrnekler {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       //String Surname =scanner.nextLine();
       // System.out.println(Surname.endsWith("k"));

        String dogYil=scanner.nextLine();
        System.out.println(dogYil.isEmpty());
        System.out.println("isminizi girin: ");
        String isim=scanner.nextLine();
        System.out.println("Soyisminizi girin: ");
        String soyIsim=scanner.nextLine();
        String istenen =isim.charAt(0)+". ";
        System.out.print(istenen);
        String istenen2=soyIsim.charAt(0)+".";
        System.out.println(istenen2);

    }


}
