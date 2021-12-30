package gun16;

import java.util.Scanner;

public class _04_Array {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 5 tane isim girmesini isteyin.
        bu isimlerden uzunluğu 6 dan büyük kaç isim olduğunu görün
         */
        Scanner scanner=new Scanner(System.in);

        String[] array = new String[5];

        int miktar=0;
        for (int i = 0; i < array.length; i++) {//array.length  burda dizinin kaç elemanlı olduğunu belirtir-->5
            System.out.println("isim girin ");
            array[i]= scanner.nextLine();
            if(array[i].length()>6){//array[i].length() dizinin o indeksindeki elemanın uzunluğu
                miktar++;
            }


        }
        System.out.println("miktar= "+ miktar);


    }

}
