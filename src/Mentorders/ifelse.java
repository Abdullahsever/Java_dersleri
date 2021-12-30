package Mentorders;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("notu girin ");
        int not=scanner.nextInt();
        if (not<25) System.out.println("F");
        else if (not>25 && not<45) System.out.println("E");
        else if (not>45 && not<50) System.out.println("D");
        else if (not>50 && not<60) System.out.println("C");
        else if (not>60 && not<80) System.out.println("B");
        else if (not>80) System.out.println("A");

    }
}
