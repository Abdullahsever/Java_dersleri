package gün20Cmrtesi;

import java.util.Arrays;

public class _03Array2D {
    public static void main(String[] args) {
        //elemanları int olan bir dizi
        int[] arr;

        int[][] arr2={
                {1,2,3},//arr2[0]
                {3,5,7},//arr2[1]
                {10,11,12}//arr2[2]
        };
        for (int i = 0; i <arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));

        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+"\t");//i arrayinin j indeksindeki eleman

            }
            System.out.println();

        }
    }
}
