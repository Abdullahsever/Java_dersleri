package gün21;

import java.util.Scanner;

public class _01MethodExample {
    public static void main(String[] args) {
        /*
         Okulda calisan bir ögretmen icin,
        ögrencilerin vize ve final notlarini girebilecegi
        ve kac ögrenci girmek istedigini alan
        bir metot ve sonuclari yazdiran ayri bir metot daha yazin.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("kaç öğrenci notunu girmek istiyorsunuz");
        int ogrSayısı=scanner.nextInt();
        int[][] notlar=notGirisi(ogrSayısı);
        notYazdır(notlar);//yada notYazdır(notGirisi(ogrSayısı));

    }
    public static int[][] notGirisi(int kacOgrenci){
        Scanner scanner=new Scanner(System.in);

        int [][] notlar=new int[kacOgrenci][2];

        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {
                if (j==0){
                    System.out.println("vize sonucu girin");
                    notlar[i][j]=scanner.nextInt();
                }
                else {
                    System.out.println("final sonucu girin");
                    notlar[i][j]=scanner.nextInt();
                }

            }

        }
        return notlar;

    }
    public static void notYazdır(int[][] notlar){
        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j <notlar[i].length ; j++) {
                if (j==0){
                    System.out.println("vize "+ notlar[i][j]);

                }
                else {
                    System.out.println("final"+notlar[i][j]);
                }

            }

        }
    }
}
