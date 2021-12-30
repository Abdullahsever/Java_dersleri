package gün22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _05_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cümle yazın");
        String cümle = scanner.nextLine();

        String[] array = cümle.split("");
        ArrayList<String> list = reverseArray(array);
        arrayYazma(list);

    }

    public static ArrayList<String> reverseArray(String[] array) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);

        }
        Collections.reverse(list);
        return list;


    }

    public static void arrayYazma(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

        }


    }

}
