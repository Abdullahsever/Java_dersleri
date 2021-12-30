package gün22;

import java.util.ArrayList;

public class _ArrayList {
    public static void main(String[] args) {
        int[] intdizi=new int[5];//kaç eleman tutacağı belli

        // arraylist kaç tane eleman tutacağını belirtmeye gerek yok
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        //integer tipinde  veri tutar

        ArrayList<String> stringArrayList=new ArrayList<>();
        //String tipinde veri tutar
        ArrayList<Boolean> booleanArrayList=new ArrayList<>();
        //boolen tipinde veri tutar
        ArrayList<Double> doubleArrayList=new ArrayList<>();
        // double tipinde veri tutar

        //Ders kaydedecek bir liste oluşturun
        ArrayList<String>dersler=new ArrayList<>();
         // listeye eleman ekleme
        dersler.add("Matematik");
        dersler.add("Türkçe");
        dersler.add("Almanca");
        dersler.add("Fizik");
        System.out.println(" dersler "+ dersler);//Listelerde Arrays.toString() metoduna gerek yok

        dersler.add(3,"Ingilizce");//direk indekse ekleme.elemanı silmeden 3.eleman olarak atar.listi genişletir.
        System.out.println("dersler =" +dersler);

        String trDersi = dersler.get(1); //liste içerisindeki elemanı index  değerine göre çekme
        System.out.println("trDersi = "+ trDersi);

        dersler.set(1,"kimya");//4.indekse kimya yaz dedik.o indeksdeki ifadeyi siler yerine belirttiğimizi yazar
        System.out.println("kimya fizik yerine ekledikten sonra dersler = "+ dersler);

        int uzunluk=dersler.size();//listenin uzunluğunu verir.Yani eleman sayısını verir.
        System.out.println("uzunluk "+uzunluk);

        boolean listBosMu=dersler.isEmpty();//listenin boş olup olmadığını kontrol eder
        System.out.println("listBosmu= "+ listBosMu);

        dersler.remove("Almanca");
        System.out.println("almanca silindikten sonra dersler = "+dersler);

        dersler.remove(1);
        System.out.println("1.indexteki veri silindikten sonra dersler= "+ dersler);

        int index=dersler.indexOf("Fizik");//verilen değerinin indexini bulmaya yarar
        System.out.println("index "+ index);

        //for döngüsü ile ekrana yazdırma
        for (int i = 0; i < dersler.size(); i++) {
            System.out.println(dersler.get(i)+" ");
        }

        dersler.clear();//Listedeki tüm verileri boşaltır,siler
        //ArrayList<String>dersler=new ArrayList<>(); bu hale gelir
        System.out.println("dersler="+ dersler);

    }
}
