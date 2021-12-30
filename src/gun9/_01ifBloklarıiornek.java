package gun9;

import java.util.Scanner;

public class _01ifBloklarıiornek {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*System.out.println("Ekrandan ismini giriniz: ");
        String isim=scanner.nextLine();
        if (isim.startsWith("A")){
            System.out.println("İsminizin ilk harfi A ile başlıyor");
        }
        else
        {
            System.out.println("İsminizin ilk harfi A ile başlamıyor");
        }

         */
       /* System.out.println("şuanki yılı giriniz: ");
        int yıl= scanner.nextInt();
        System.out.println("doğum tarihi giriniz: ");
        int dogumtarihi= scanner.nextInt();
        int yas=yıl-dogumtarihi;
        if (yas>=18){
            System.out.println("Tebrikler.Ehliyet alabilirsiniz");
        }
        else{
            System.out.println("Malesef ehliyet alamazsınız");
        }

        */
        System.out.println("Takımınızı giriniz: ");
        String takım=scanner.nextLine();
        if (takım.equalsIgnoreCase("Fenerbahçe")){
            System.out.println("Fenerbahçelisin.Helal");
        }
        else if (takım.equalsIgnoreCase("Galatasaray")){
            System.out.println("Galatasaray mı? Neyse  bakem\"");
        }
        else
        {
            System.out.println("Tv yi kapat hacı");
        }
    }
}
