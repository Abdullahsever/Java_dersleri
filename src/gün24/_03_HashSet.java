package gün24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _03_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(3, 4, 5));
        HashSet<Integer> hashSet2 = new HashSet<>(Arrays.asList(5, 6, 7, 8));

        //Bu iki hash seti birleştiren bir metod yazalım
        System.out.println("birleştirilmiş hali=" + birleştir(hashSet1, hashSet2));

        //Bu iki hash setin farkını bulalım
        System.out.println(birleştir(hashSet1,hashSet2));//iki hashseti birleştirme
        System.out.println(fark(hashSet1,hashSet2));//iki hashSet in farkı

        //ortakelemanları bulan metod
        System.out.println(ortakElemanlar(hashSet1,hashSet2));
    }

    public static HashSet<Integer> birleştir(HashSet<Integer> hashSet1, HashSet<Integer> hashSet2) {
        HashSet<Integer> birlesikSet = new HashSet<>();
        birlesikSet.addAll(hashSet1);//önce 1.seti ekledi
        birlesikSet.addAll(hashSet2);//sonra 2. seti ekledi
        return birlesikSet;


    }
    public static HashSet<Integer> fark(HashSet<Integer> integers, HashSet<Integer> set){
        HashSet<Integer> farkSet=new HashSet<>(integers);
        farkSet.removeAll(set);//farkset değişkenine hashSet1 i eklemiiştik üst satırda

        return farkSet;
     }
     public static HashSet<Integer> ortakElemanlar(HashSet<Integer> integers,HashSet<Integer> set){
        HashSet<Integer> ortakSet=new HashSet<>(integers);
        ortakSet.retainAll(set);
        return ortakSet;                                    
     }
}
