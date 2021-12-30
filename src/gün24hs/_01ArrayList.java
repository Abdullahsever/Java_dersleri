package gün24hs;

import java.util.ArrayList;

public class _01ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list10=new ArrayList<>();  //int--> wrapper class Integer
        list10.add(1);
        list10.add(2);
        list10.add(1,3);

        System.out.println(list10); //toString(); işlemi yapar

    }

}
