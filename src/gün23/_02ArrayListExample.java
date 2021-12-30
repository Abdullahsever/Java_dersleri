package gün23;

import java.util.ArrayList;
import java.util.Scanner;

public class _02ArrayListExample {
    public static void main(String[] args) {
        int num = 5;
        int[] numArray = new int[5];
        int[][] nums = new int[5][5];
        ArrayList<Integer> list = new ArrayList<>();


        String[] array = new String[3];
        array[0] = "Matematik";
        array[1] = "Almanca";
        array[2] = "Fizik";
        ArrayList<ArrayList<Integer>> notlarTablosu = new ArrayList<>();
        ArrayList<Integer> matNotlar = new ArrayList<>();
        matNotlar.add(90);
        matNotlar.add(89);
        matNotlar.add(99);

        ArrayList<Integer> almancaNotlar = new ArrayList<>();

        almancaNotlar.add(66);
        almancaNotlar.add(78);
        almancaNotlar.add(89);

        ArrayList<Integer> fizikNotlar = new ArrayList<>();

        fizikNotlar.add(67);
        fizikNotlar.add(89);
        fizikNotlar.add(90);

        notlarTablosu.add(matNotlar);
        notlarTablosu.add(almancaNotlar);
        notlarTablosu.add(fizikNotlar);

        // tek bir listeyi yazdırma
        for (int i = 0; i < matNotlar.size(); i++) {
            System.out.println(matNotlar.get(i) + " ");
            System.out.println("***************");

        }
        //tüm notları yazdırma
        for (int i = 0; i < notlarTablosu.size(); i++) {
            System.out.println(array[i]);//String dizi
            for (int j = 0; j < notlarTablosu.get(i).size(); j++) {
                System.out.println((i+1)+ ". satrıdaki "+(j+1)+" . not= "+ notlarTablosu.get(i).get(j));

            }

        }
        /*
        Kullanıcının gireceği ders no suna göre ekrana o dersin notlarını yazdıran bir program yazın
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ders no'ları = 0-Mat, 1-Almanca, 2-Fizik olarak seçin ");
        int dersNo =scanner.nextInt();
        dersnotu(notlarTablosu,dersNo);
         /*
        Kullanıcının istedğini dersin ortalamasını bulan programı yazın
         */
        ortalamaBul(notlarTablosu,dersNo);
         /*
        Tüm derslerin ortalamasını bulun
         */
        tümDerslerinOrtalaması(notlarTablosu);

    }
    public static void dersnotu(ArrayList<ArrayList<Integer>>list, int dersNo){
        System.out.println(list.get(dersNo));
    }
      /*
        Kullanıcının istedğini dersin ortalamasını bulan programı yazın
         */
    public  static void ortalamaBul(ArrayList<ArrayList<Integer>>list,int dersNo){
        int toplam=0;
        for (int i = 0; i < list.get(dersNo).size(); i++) {
            toplam+=list.get(dersNo).get(i);//ders no satırı(ilk listi) ifade eder.i ise o satırın sütınlarını ifade eder

        }
        int ortalama=toplam/list.get(dersNo).size();
        System.out.println("ortalama = "+ ortalama);
    }
    public static void tümDerslerinOrtalaması(ArrayList<ArrayList<Integer>>list){
        int toplam=0;
        int notSayısı=0;
        for (int i = 0; i < list.size() ; i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                toplam+=list.get(i).get(j);
                notSayısı++;

            }

        }
       int tümDerslerort= toplam/ notSayısı;

        System.out.println("tüm derslerin ortalaması "+tümDerslerort);
    }
}
