package MentöringDöngüler;

import java.util.Scanner;

public class _03Loo {
    public static void main(String[] args) {
        //Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ).
        // Print average and product of all numbers.

        Scanner scanner=new Scanner(System.in);
        String secim;
        int carpım=1;
        do {
            System.out.println("Bir sayı girin yada çıkmak için q ya basın");
            secim=scanner.nextLine();


            if (!secim.equals("q")){
                int sayı=Integer.parseInt(secim);
                carpım*=sayı;

            }


        }while (!secim.equals("q"));
        System.out.println(carpım);



        /*
        Scanner scanner=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);

        int sayı;
        int carpım=1;
        String yanıt;
        do {
            System.out.println("sayı girin");
            sayı=scanner.nextInt();
            carpım*=sayı;
            System.out.println("çıkmak için q ya basın");
             yanıt=sc.nextLine();


        }while (!yanıt.equalsIgnoreCase("q"));
        System.out.println(carpım);
         */


    }
}
