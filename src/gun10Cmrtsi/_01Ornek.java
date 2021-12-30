package gun10Cmrtsi;

import java.util.Scanner;

public class _01Ornek {
    public static void main(String[] args) {
        //3 tane sayı giriniz.girilen en büyük ve en küçük sayıyı bulup  yazdırın
        Scanner scanner=new Scanner(System.in);
        System.out.print("Üç adet sayı giriniz: ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();

        int enBuyuk=num1;//num1 i en büyük varsayıp diğerleri ile karşılaştır ve karşılaşılan değer büyükse yeni değeri ona ata
        int enKucuk=num1;//num1 i en küçük varsayıp diğerleri ile karşılaştır ve karşılaşılan değer küçükse yeni değeri ona ata
        if (num2>enBuyuk)
            enBuyuk=num2; // if eğer tek satır işlemi ise süslü paranteze gerek yok.burada  num2>enBüyük ise num2=enbüyük değer atanıyor
        if (num3>enBuyuk)
            enBuyuk=num3;
        if (num2<enKucuk)
            enKucuk=num2;
        if (num3<enKucuk)
            enKucuk=num3;

        System.out.println("en büyük : "+ enBuyuk);
        System.out.println("en küçük : "+ enKucuk);


    }
}
