package gün19;

import java.util.Scanner;

public class _01_Array2DExample {
    public static void main(String[] args) {
         /*
        euro ve dolar in son 6 ayda ki karsiliklarini bir tabloya ekleyin.
        Bu tabloyu ekrana yazdirin.
         */

        Scanner scanner = new Scanner(System.in);

        int[][] kurTablosu = new int[6][2];

        for (int satir = 0; satir < kurTablosu.length; satir++) {
            for (int sütun = 0; sütun < kurTablosu[satir].length; sütun++) {

                if (sütun==0){
                    System.out.println("Dolar");
                    kurTablosu[satir][sütun] = scanner.nextInt();
                }
                else {
                    System.out.println("Euro");
                    kurTablosu[satir][sütun] = scanner.nextInt();
                }
            }
        }
        System.out.print("dolar \t euro");
        System.out.println();


        for (int i = 0; i < kurTablosu.length; i++) {
            for (int j = 0; j < kurTablosu[i].length; j++) {
                System.out.print(kurTablosu[i][j]+"\t");
            }
            System.out.println();
        }

        /*int[][] kurTablosu2 = new int[2][6];

        for (int satir = 0; satir < kurTablosu2.length; satir++) {
            for (int sütun = 0; sütun < kurTablosu2[satir].length; sütun++) {

                if (satir==0){
                    System.out.println("Dolar");
                    kurTablosu[satir][sütun] = scanner.nextInt();
                }
                else {
                    System.out.println("Euro");
                    kurTablosu[satir][sütun] = scanner.nextInt();
                }
            }
        }

         */

    }
}
