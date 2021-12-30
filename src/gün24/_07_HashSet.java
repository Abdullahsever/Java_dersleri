package gün24;

import java.util.ArrayList;
import java.util.HashSet;

public class _07_HashSet {
    public static void main(String[] args) {
        HashSet<Object> objectsHashSet=new HashSet<>();
        ArrayList<Object> objectArrayList=new ArrayList<>();//list de de kullanılır
        //Object[] array=new Object[5]; //dizidede olabilir

        objectsHashSet.add(34);
        objectsHashSet.add("mehmet");
        objectsHashSet.add(true);
        objectsHashSet.add(3.14);
        System.out.println("objectHashSet "+objectsHashSet);

    }
}
