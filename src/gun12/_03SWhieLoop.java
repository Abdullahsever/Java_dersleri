package gun12;

import java.util.Scanner;

public class _03SWhieLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayı girin");
        int num=scanner.nextInt();
         while (num>0){
             if (num%2==1){
                 System.out.print(num+" ");
             }
             num--; // num=num-1 || num-=1
         }


    }
}
