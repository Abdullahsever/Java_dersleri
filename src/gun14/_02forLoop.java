package gun14;

import java.util.Scanner;

public class _02forLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("baslangic degeri girin");
        int baslangic = scanner.nextInt();

        System.out.println("Bitis degeri girin");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if (baslangic<bitis){
            /*
            olurda kullanici baslangic degerini büyük bitis degerini
            kücük yazarsa diye if-else blogu icerisinde kontrol edip ona uygun döngü
            yazdik.
             */
            for (int i =baslangic; i<=bitis;i++){
                toplam+=i;//toplam=toplam+i
            }
        }
        else {
            for (int j =baslangic; j>=bitis;j--){
                toplam+=j;
            }
        }
        System.out.println("toplam = " + toplam);

    }
}
