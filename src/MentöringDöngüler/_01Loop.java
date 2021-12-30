package MentöringDöngüler;

import java.util.Scanner;

public class _01Loop {
    public static void main(String[] args) {
        //Take 10 integers from keyboard using loop and print their average value on the screen.
        Scanner scanner=new Scanner(System.in);
         int top=0;
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". sayı girin ");
            int sayı=scanner.nextInt();
            top+=sayı;
        }

        double ortalama= (top/10);
        System.out.println(ortalama);


    }
}
