package gün24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _08_HashSet8 {
    public static void main(String[] args) {

        //Her biri tüm veri tipleri için kullanılabilir. Integer ,String, Double...
        //hashset kendi algoritmesına göre veriye en hızlı ulaşacağı sekilde sıralıyor
        HashSet<Integer> integerHashSet=new HashSet<>();

        //LinkedHashset, ekleme sırasına göre sıralar
        LinkedHashSet<Integer> linkedHashSet =new LinkedHashSet<>();

        //String için alfabe sırasına göre sıralar
        TreeSet<String> treeSet=new TreeSet<>();

        //Integer için küçükten büyüğe doğru sıralar
        TreeSet<Integer> integerTreeSet=new TreeSet<>();
    }
}
