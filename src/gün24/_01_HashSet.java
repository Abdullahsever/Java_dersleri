package gün24;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();//list değişkeni istedğim veri tutabiliyor

        HashSet<Integer> hashset=new HashSet<>();
        //list lerden tek farkı tekrar eden veri tutmaz

        hashset.add(3);
        hashset.add(2);
        hashset.add(5);
        hashset.add(3);

        System.out.println("hashset ="+ hashset);
    }
}
