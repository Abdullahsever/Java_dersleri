package gun8;

import java.util.Locale;
import java.util.Scanner;

public class Ornekler8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*System.out.println("Doğum yılı: ");
        int dogumYılı= scanner.nextInt();
        System.out.println("Şuan: ");
        int suAn= scanner.nextInt();
        int hesap = suAn-dogumYılı;
        System.out.println(hesap);

         */
        /*System.out.println("isimsoyisim girin: ");
        String isimVeSoyisim=scanner.nextLine();
        int boslukIndex=isimVeSoyisim.indexOf(" ");
        String isim = isimVeSoyisim.substring(0,boslukIndex);
        String soyIsım=isimVeSoyisim.substring(boslukIndex+1);

        String isimYeni = isim.toLowerCase(Locale.ROOT);
        String ilkHarf = soyIsım.substring(0,1).toLowerCase(Locale.ROOT);
        String soyisimDigerHarfler=soyIsım.substring(1).toUpperCase(Locale.ROOT);
        String soyisimYeni = ilkHarf.concat(soyisimDigerHarfler);
        System.out.println(isimYeni+ " "+soyisimYeni);

         */
        System.out.println("yarıçap giriniz: ");
           int cemberinyarıcapı=scanner.nextInt();
            double pi= 3.14;
            double cevre = 2*pi*cemberinyarıcapı;
            double kareKenarı=cevre;
            int sonuc =(int) (kareKenarı*kareKenarı);
        System.out.println(cevre);
        System.out.println("sonuc= "+ sonuc);








    }
}
