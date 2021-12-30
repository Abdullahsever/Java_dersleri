package gün24hs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _07Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(61,63,30,5,100,92,50,33));

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i)>list.get(j)){
                    Collections.swap(list,i,j);

            }
            }

        }
        System.out.println(list);



    }
}
