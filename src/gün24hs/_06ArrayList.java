package gün24hs;

import java.util.ArrayList;
import java.util.Collections;

public class _06ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>(){{
            for (int i = 0; i <20 ; i++) {
                int num=(int) (Math.random()*10);
                add(num);

            }
        }};
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
        System.out.println("max"+Collections.max(list1));
        System.out.println("min"+Collections.min(list1));
        Collections.swap(list1,1,4);//1 .ve 4. elemanları yer değiştirir
        System.out.println(list1);



    }
}
