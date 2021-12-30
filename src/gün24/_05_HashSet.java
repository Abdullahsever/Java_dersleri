package gün24;

import java.util.HashSet;

public class _05_HashSet {
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

        }



    }

