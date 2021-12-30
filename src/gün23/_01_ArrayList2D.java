package gün23;

import java.util.ArrayList;

public class _01_ArrayList2D {
    public static void main(String[] args) {
        int num = 5;
        int[] numArray = new int[5];
        int[][] nums = new int[5][5];
        ArrayList<Integer> list = new ArrayList<>();


        String[] array = new String[3];
        array[0] = "Matematik";
        array[1] = "Almanca";
        array[2] = "Fizik";
        ArrayList<ArrayList<Integer>> notlarTablosu = new ArrayList<>();
        ArrayList<Integer> matNotlar = new ArrayList<>();
        matNotlar.add(90);
        matNotlar.add(89);
        matNotlar.add(99);

        ArrayList<Integer> almancaNotlar = new ArrayList<>();

        almancaNotlar.add(66);
        almancaNotlar.add(78);
        almancaNotlar.add(89);

        ArrayList<Integer> fizikNotlar = new ArrayList<>();

        fizikNotlar.add(67);
        fizikNotlar.add(89);
        fizikNotlar.add(90);

        notlarTablosu.add(matNotlar);
        notlarTablosu.add(almancaNotlar);
        notlarTablosu.add(fizikNotlar);

        // tek bir listeyi yazdırma
        for (int i = 0; i < matNotlar.size(); i++) {
            System.out.println(matNotlar.get(i) + " ");
            System.out.println("***************");

        }
        //tüm notları yazdırma
        for (int i = 0; i < notlarTablosu.size(); i++) {
            System.out.println(array[i]);//String dizi
            for (int j = 0; j < notlarTablosu.get(i).size(); j++) {
                System.out.println((i+1)+ ". satrıdaki "+(j+1)+" . not= "+ notlarTablosu.get(i).get(j));

            }

        }

    }
}
