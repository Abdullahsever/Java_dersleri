package gun10;

import java.util.Scanner;

public class ModAlma {
    public static void main(String[] args) {
         int sayi1 =11;
          int modHali =sayi1%10;
          //bir sayının bölümünden kalanı verir.

        System.out.println("ModHali = " + modHali);

        int sayi2 =2;
        int modHali2=sayi2%10;
        System.out.println("modhali2 = "+ modHali2);
        //eğer modu alınacak sayı mod değerinden kuçükse kendisini verir.
        Scanner scanner= new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı girin: ");
        int num =scanner.nextInt();

        int birlerBasmagı = num%10;
        System.out.println("birler basamağı"+birlerBasmagı);

        //Onlar basamağını bulmak için 10  bölüp mod10 alınır.

        int onlarBasamagı=(num/10)%10;
        System.out.println("onlar basamağı "+onlarBasamagı);
        // onlar basamağı için sayı 10 a bölünür mod10 u alınır.
        int yüzlerBasamagı =(num/100)%10;
        System.out.println("yüzler basamağı "+yüzlerBasamagı);
        // yüzler basamağı için 100 e bölüp mod 10 u bulunur.
        //binler basamağı olsa idi 1000 e bölüp mod 10 alınırdı. değer in tanımlanmalıdır.

        /*
        girilen bir sayının tek mi çift  mi olduğunu ekrana yazdırın.
         */

        System.out.println("Bir tam sayı girin ");
         int tekVeyaCift= scanner.nextInt();
         if (tekVeyaCift%2==0){
             System.out.println("sayı çifttir");
         }
         else {
             System.out.println("sayı tektir");
         }
    }
}
