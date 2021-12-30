package gun13;

import java.util.Scanner;

public class _06While {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayı girim");
        int enk=scanner.nextInt();
        int i=0;
        while (i<4){
            System.out.println("sayı girin");
            int num=scanner.nextInt();
            if (num<enk){
                enk=num;
            }
            i++;
        }
        System.out.println("enk "+enk);
    }
}
