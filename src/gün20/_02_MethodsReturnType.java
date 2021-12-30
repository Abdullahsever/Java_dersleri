package gün20;

import java.util.Scanner;

public class _02_MethodsReturnType {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 5 tane meyve girmesini isteyin.
        Bu meyvelerden kaç tanesinde e harfi  oldğunu bulan bir metod yazın
         */
        Scanner scanner=new Scanner(System.in);
        String[] meyveler=new String[5];
        for (int i = 0; i < meyveler.length ; i++) {
            System.out.println("meyve ismi");
            meyveler[i]=scanner.nextLine();
        }
        int kaçtanesindeEVar=kacTanesindeEVar(meyveler);
        System.out.println("meyve isimleri içinde "+ kaçtanesindeEVar+" tane e var");

    }
    public static int kacTanesindeEVar(String[] array){
        int eMiktarı=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("e")){
                eMiktarı++;
            }

        }
        return eMiktarı;
    }
}
