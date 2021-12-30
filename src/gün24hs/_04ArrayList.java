package gün24hs;

import java.util.ArrayList;
import java.util.List;

public class _04ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(7, 8, 9, 10, 11, 12,13));
        ArrayList<Integer> list3 = new ArrayList<>(List.of(101,102,103));

        //değer değiştirme
        list3.set(2,105);
        System.out.println(list3);

        System.out.println("****************");
        // iki list arasındaki ortak ve farklı elemanlar

       /* list1.removeAll(list2);//A fark  B dir mat karşılığı
        System.out.println(list1);

        */
        //retainAll kesişen elemanları list1 içinde bırakır
        /*list1.retainAll(list2);
        System.out.println(list1);

         */


    }
}
