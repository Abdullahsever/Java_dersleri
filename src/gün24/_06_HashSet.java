package gün24;

import java.util.Arrays;
import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        /*
        0-10 arası random sayılarla 10 elemaanlı bir Hashseti doldurun
         */
        HashSet<Integer> doldurma=new HashSet<>();

        while (doldurma.size()<10){
            int num=(int) (Math.random()*10);
            doldurma.add(num);

        }
        System.out.println("randomSet ="+doldurma);

        //oluşturduğumuz bu seti bir diziye aktarın
       Integer[] array=new Integer[doldurma.size()];

       //1.yol
        int index=0;
        for (Integer num:doldurma) {
            array[index]=num;//Hashset içinden gelen bir numarayı arrayın bir indexine atıyor
            index++;

        }
        System.out.println("1. yol "+Arrays.toString(array));
        //2.yol
        Integer[] array2=doldurma.toArray(new Integer[doldurma.size()]);
        System.out.println("2. yol"+Arrays.toString(array2));

        }



    }

