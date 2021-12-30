package gün29.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Insan {
    String ad;
    ArrayList<String> akrabalar=new ArrayList<>();
    int yas;
    static int count;
    public void verAta(String ad,int yas){

        this.ad=ad;
        this.yas=yas;
        Insan.count++;
    }

    public void adınısoyle(){
        System.out.println("adım "+ ad);
    }

    public void akrabaAta(String...akrabaİsimleri){
       // akrabalar=new ArrayList<>(); buraya da yazılabilir.başta new ile bir ArrayList  oluşturmamız lazım.

       /*
        for (int i = 0; i < akrabaİsimleri.length; i++) {      //buda olabilir
        akrabalar.add(akrabaİsimleri[i]);        }

        */


        for (String s : akrabaİsimleri) {
            akrabalar.add(s);
        }
    }
    public void akrabanıSoyle(){
        System.out.println(akrabalar);
    }





}
class Main{

    public static void main(String[] args) {

            Insan i1=new Insan();
            i1.verAta("Ahmet",18);
            i1.akrabaAta("veli", "fatih","kemal");
            Insan i2=new Insan();
            i2.verAta("Mehmet", 25);
            i2.akrabaAta("Hasan","murat","ayşe");
            i1.adınısoyle();
            i1.akrabanıSoyle();
            i2.adınısoyle();
            i2.akrabanıSoyle();
            insanSayısı();



    }public static void insanSayısı(){
        System.out.println(Insan.count);
    }
}
