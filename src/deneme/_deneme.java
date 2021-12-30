package deneme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _deneme {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("cümle girin ");
        String cümle=scanner.nextLine();

        String[] array=cümle.split("");
        ArrayList<String> list=new ArrayList<>();
        System.out.println(reverse(array));
    }
    public static ArrayList<String> reverse(String[]array){
        ArrayList<String>list=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);

        }
        Collections.reverse(list);
        return list;
    }
    public static void yazdırma(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

    }
}
