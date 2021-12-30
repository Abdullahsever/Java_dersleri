package gün22;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> isimler=new ArrayList<>(Arrays.asList("Mehmet", "Abdullah","Cihat"));
        //Listeye direk veri eklemenin yolu Arrays.asList() tir.
        System.out.println("isimler ="+ isimler);
        //liste eleman eklemenin 2.yolu
        ArrayList<String> dersler=new ArrayList<>(){
            {
            add("Matematik");
            add("Türkçe");
            add("Fizik");
        }

        };
     isimler.addAll(dersler);
        System.out.println("isimler ="+ isimler);

        isimler.removeAll(dersler);//dersler listesini isimler listesinden siler
        System.out.println("isimler= "+ isimler);

        if (isimler.contains("Mehmet")) //contains() metodu listenin tamamını kontrol edebilir
            System.out.println("Mehmet liste içinde var");

    }
}
