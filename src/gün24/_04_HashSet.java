package gün24;

import java.util.Arrays;
import java.util.HashSet;

public class _04_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(3, 4, 5));
        HashSet<Integer> hashSet2 = new HashSet<>(Arrays.asList(5, 6, 7, 8));

        //Bu iki hash seti birleştiren bir metod yazalım
        HashSet<Integer> birlesikSet = new HashSet<>();
        birlesikSet.addAll(hashSet1);//önce 1.seti ekledi
        birlesikSet.addAll(hashSet2);//sonra 2. seti ekledi
        System.out.println("birleşikset "+birlesikSet);

        //Bu iki hash setin farkını bulalım
        HashSet<Integer> farkSet=new HashSet<>(hashSet1);
        farkSet.removeAll(hashSet1);//farkset değişkenine hashSet1 i eklemiiştik üst satırda
        System.out.println("farkset "+farkSet);
        // yada hashSet1.removeAll(hashSet2); ama bu yaptığımız zaman  hashSet1 içindeki 5 artık kaldırılır.aşağıdaki diğer işlemlr için


        //ortakelemanları bulan metod
        HashSet<Integer> ortakSet=new HashSet<>(hashSet1);
        ortakSet.retainAll(hashSet2);
        System.out.println("ortakSet "+ortakSet);
    }

}
