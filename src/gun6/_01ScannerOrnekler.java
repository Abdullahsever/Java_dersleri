package gun6;

import java.util.Scanner;

public class _01ScannerOrnekler {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*String cumle = ikiKelime.nextLine();
        int bosluk=cumle.indexOf(" ");
        String ilk=cumle.substring(0,bosluk);
        String iki=cumle.substring(bosluk+1);
        System.out.println(iki+" "+ilk);

         */
       /* System.out.println("kısa kenarı girin :");
        int kısa=scanner.nextInt();
        System.out.println("uzun kenarı girin :");
        int uzun=scanner.nextInt();
        System.out.println("Çevre: "+2*(kısa+uzun));
        */
        System.out.println("Doğum Yılınızı giriniz: ");
        int dogumYılı=scanner.nextInt();
        System.out.println("Bugunki tarihi giriniz: ");
        int bugunkitarih=scanner.nextInt();
        int yas= bugunkitarih-dogumYılı;
        System.out.println("yaşınız: "+yas);




    }
}
