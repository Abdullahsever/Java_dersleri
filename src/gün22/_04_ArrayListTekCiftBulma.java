package gün22;

import deneme._tekrar;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _04_ArrayListTekCiftBulma {
    public static void main(String[] args) {
        /*
        Kullanicidan 10 tane sayi girmesini isteyin. Bu sayilardan
        cift sayi olanlari bir dizi icerisine atin. ciftSayilar() diye bir metot olusturun.
         */
        Scanner scanner = new Scanner(System.in);
        int[] sayılar = new int[10];
        for (int i = 0; i < sayılar.length; i++) {
            System.out.println("sayı girin");
            sayılar[i] = scanner.nextInt();

        }
        System.out.println("çift sayılar" + ciftsayılar(sayılar));
        ArrayList<Integer> ciftsayılar = ciftsayılar(sayılar);
        System.out.println("tek sayılar" + teksayılar(sayılar));
        ArrayList<Integer> teksayılar = teksayılar(sayılar);

    }

    public static ArrayList<Integer> ciftsayılar(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                list.add(array[i]);

            }


        }
        return list;

    }

    public static ArrayList<Integer> teksayılar(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 1) {
                list.add(array[i]);

            }


        }
        return list;

    }
}
