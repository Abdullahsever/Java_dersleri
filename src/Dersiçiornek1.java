import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Dersiçiornek1 {
    public static void main(String[] args) {
        // aaabbbfffgggtttddd bu sekilde yazilmis bir kelimeyi düzenleyecek
        // bir metot yazin.
        //  ciktisi bu sekilde olacaktir ->
        //  3a3b3f3g3t3d bu soruyu HashSet kullanarak cözmeye calisin.
        kontrol("aaabbbfffgggttttdddd");

    }public static void kontrol(String str){
        String [] array=str.split("");
        TreeSet<String> treeSet=new TreeSet<>(Arrays.asList(array));
        String yeni="";
        for (String harfler : treeSet) {
            yeni+=sayma(str,harfler)+harfler;

        }
        System.out.println(yeni);
    }
    public static int sayma(String str,String harf){
        int miktar = 0;
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if (harf.equals(s))
                miktar++;
        }
        return miktar;
    }
}
