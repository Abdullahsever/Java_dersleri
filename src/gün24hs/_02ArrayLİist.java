package gün24hs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02ArrayLİist {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(10);
        list1.add(5);
        list1.add(3);

        System.out.println(list1);
        System.out.println("**********************");

        ArrayList<Integer> list2=new ArrayList<>(){{
            for (int i = 0; i <20 ; i++) {
                int num=(int) (Math.random()*10);
                add(num);

            }
        }};
        System.out.println(list2);
        System.out.println("**********************");
        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(1,3,5,2));
        System.out.println(list3);

        ArrayList<Integer> list4=new ArrayList<>(List.of(10,14,78,100,2));
        System.out.println(list4);

       /* Integer[] arr={1,2,3,4,5,6,7};
        Arrays<Integer> list5=new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println(list5);

        */

    }
}
