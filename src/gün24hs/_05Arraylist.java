package gün24hs;

import java.util.ArrayList;
import java.util.Arrays;

public class _05Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(7, 8, 9, 10, 11, 12, 13));
        ArrayList<Integer> list3 = new ArrayList<>(list1);

        list3.retainAll(list2);
        list1.addAll(list2);
        list1.removeAll(list3);
        System.out.println(list1);



        }
    }

