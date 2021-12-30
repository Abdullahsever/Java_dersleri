package gün20;

import java.util.Scanner;

public class _03_MethodsReturnType {
    public static void main(String[] args) {
        /*
       Kullanıcıdan 2 sehir,3 ulke, 3 isim ve 4 meyve girmesini isteyin.Bunlardan kaç tanesinde e harfi olduğunu
        bulun
         */
        int meyve=kacTanesindeEVar("Meyve girin",4);
        System.out.println("meyveler içinde "+meyve+" kadar e var");
        int isim=kacTanesindeEVar("isim girin",3);
        System.out.println("meyveler içinde "+isim+" kadar e var");
        int sehir=kacTanesindeEVar("sehir girin",2);
        System.out.println("meyveler içinde "+isim+" kadar e var");
        int  ulke=kacTanesindeEVar("ülke girin",3);
        System.out.println("ülkeler içinde "+ulke+" kadar e var");

    }
    public static int kacTanesindeEVar(String str,int kacTane){
        Scanner scanner=new Scanner(System.in );
        String[] array=new String[kacTane];
        int kacTanesindeE=0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(str);
            array[i]=scanner.nextLine();
            if (array[i].contains("e")){
                kacTanesindeE++;
            }

        }
        return kacTanesindeE;
    }
}
