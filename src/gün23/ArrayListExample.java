package gün23;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
       /*
        Bir ögretmen icin istedigi kadar not girebilecegi ve notlari girdikten
        sonra ortalamayi gecen ogrenci sayisini bulan bir program yazin.
         */
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        ArrayList<Integer> notlarlistesi=new ArrayList<>();
       String cevap;
       do {
           System.out.println("not girin");
           int not=scanner.nextInt();
           notGirisi(not,notlarlistesi);
           System.out.println("başka not girmek istiyor musun?");
           cevap=scanner1.next();

    }while (cevap.equalsIgnoreCase("evet"));
       ortalamayıGeceneler(notlarlistesi);

    }

    public static void ortalamayıGeceneler(ArrayList<Integer> notlarListesi){
        double ort=0;
        int toplam=0;
        int ortalamayıGecenler=0;
        for (int i = 0; i < notlarListesi.size(); i++) {
            toplam+= notlarListesi.get(i);

        }

        ort=toplam/notlarListesi.size();
        for (int i = 0; i <notlarListesi.size() ; i++) {
            if (notlarListesi.get(i)>ort)
                ortalamayıGecenler++;

        }
        System.out.println("ortalama= "+ ort);
        System.out.println("ortalamayıGecenler = "+ ortalamayıGecenler);
    }
    public static void notGirisi(int not, ArrayList<Integer> notlarListesi){

        notlarListesi.add(not);

    }
}
