package gun11;

import java.util.Scanner;

public class _01_Ornekler {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*System.out.println("iki tamsayı girin.Aralarına virgül koyunuz: ");
        String ikiTamsayi=scanner.nextLine();
        int ayrac=ikiTamsayi.indexOf(",");
        int sayi1=Integer.parseInt(ikiTamsayi.substring(0,ayrac));
        int sayi2=Integer.parseInt(ikiTamsayi.substring(ayrac+1));
        System.out.println("büyük sayı :"+Math.max(sayi1,sayi2));

         */
        System.out.println("kullanıcı kardeş 0-9 arası sayı giriver: ");
        int sayi=scanner.nextInt();
        int randomSayi=(int)(Math.random()*10);
        System.out.println("girilen sayı:"+sayi);
        System.out.println("random sayı:"+randomSayi);
        if (sayi==randomSayi)
            System.out.println("tebrikler");
        else
            System.out.println("malesef kaybettiniz");



    }
}
