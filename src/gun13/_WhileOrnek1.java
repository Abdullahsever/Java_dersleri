package gun13;

import java.util.Scanner;

public class _WhileOrnek1 {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane kelime girmesini isteyin.
        Bu kelimeler  icerisinde a olan kac tane kelime oldugunu yazdirin.
         */
        Scanner scanner=new Scanner(System.in);
        int kaçTane=0;
        int i=0;
         while (i<5){
             System.out.println("kelime girin");
             String name=scanner.nextLine();

             if (name.contains("a")){
                 kaçTane++;//içinde a olan kelime sayısı
             }
             i++;//döngü için değişken
         }
        System.out.println(kaçTane);


    }
}
