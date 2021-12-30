package gun13;

import java.util.Scanner;

public class _03_DowhileOrnek {
    /*
    kullanıcıdan  isim girmesini isteyin.ve kaç isim girmek istediğini sorun.kaç isminin baş harfi a ile başlıyor
    bunu bulun
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("kaç isim girmek istiyorsunuz");
        int isimSayısı =scanner.nextInt();
        int sayac =0;
        int toplamKactane=0;
        scanner.nextLine();
        while (sayac<isimSayısı){
            System.out.println("isim girin");
            String isim=scanner.nextLine();
            if (isim.startsWith("A")){
                toplamKactane++;
            }
            sayac++;
        }
        System.out.println("toplam kaç tane "+ toplamKactane);

    }

}
