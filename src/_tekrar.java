import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class _tekrar {
    public static void main(String[] args) {
   int num=1;//tek değişken ,değer tutar
   int[] nums=new int[5];//5 elemanlı bir dizidir.5eleman tutabilir
   int[][] array=new int[5][5];//5*5 lik bir eleman tutabilir
   ArrayList<Integer>list=new ArrayList<>();//tek boyutlu bir liste
        HashSet<Integer> hashsset=new HashSet<>();//hashset tek boyutlu bir aynı olmayan verileri tutar.
        hashsset.add(12);
        hashsset.add(14);
        hashsset.add(13);
        hashsset.add(13);
        hashsset.add(13);
        System.out.println(hashsset);
        HashSet<String> arabalar=new HashSet<>();
        arabalar.add("BMW");
        arabalar.add("VOLVO");
        arabalar.add("AUDİ");
        arabalar.add("VOLVO");
        System.out.println(arabalar);
        TreeSet<String> sırala=new TreeSet<>(arabalar);
        System.out.println(sırala);
        for (var sıralama:sırala) {
            System.out.println(sırala);//2.yazdırma şekli
            HashSet<Integer> doldurma=new HashSet<>();
            while(doldurma.size()<10){
                int sayı=(int) (Math.random()*10);
                doldurma.add(sayı);
            }
            System.out.println(doldurma);

        }
    }
}
