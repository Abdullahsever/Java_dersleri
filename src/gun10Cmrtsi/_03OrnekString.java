package gun10Cmrtsi;

import java.util.Scanner;

public class _03OrnekString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("metin girin ");
        String metin=scanner.nextLine();
        System.out.println(metin.charAt(0));
        System.out.println(metin.charAt(metin.length()-1));
        System.out.println(metin.charAt((metin.length()/2)-1));
        System.out.println(metin.length());
    }
}
