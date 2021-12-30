package gün24hs;

import java.util.ArrayList;
import java.util.List;

public class _03Arraylist3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(7, 8, 9, 10, 11, 12));
        ArrayList<Integer> list3 = new ArrayList<>(List.of(101,102,103));
        //eleman ekleme
        list1.add(10);
        list2.add(3, 14);
        //elemana ulaşma
        System.out.println(list1.get(1));
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " , "); //random access

        }
        //contains, 1 sayısı list1 içinde var mı?
        System.out.println(list1.contains(1));
        //addAll(list veya setleri ekler)
        list3.addAll(list1);
        System.out.println(list3);



    }
}
