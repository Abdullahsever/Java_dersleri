package gun8;

import java.util.Locale;

public class _03StringMetodlar {
    public static void main(String[] args) {
        String str = " Java Dersleri ";
        String strTrim =str.trim();// trim() metodu string ifadenin basındaki ve sonundaki boşluklarını siler
        System.out.println(strTrim);
        System.out.println(str.length());
        System.out.println(strTrim.length());
        String strToLowerCase=str.toLowerCase(Locale.ROOT);
        //string ifadenin içersindeki tüm büyük harfleri küçük harfe çevirir
        System.out.println(strToLowerCase);

        String strToUpperCase = str.toUpperCase(Locale.ROOT);
        //string ifadenin içersindeki tüm küçük harfleri kbüyük harfe çevirir
        System.out.println(strToUpperCase);
        String strEquals = "java dersleri";
        System.out.println(str.equals(strEquals));
        //iki stringin karakterleri aynı mı değil mi diye bakar.büyük harf küçük harf duyarlıdır.
        System.out.println(str.equalsIgnoreCase(strEquals));
        //iki stringin karakterleri aynı mı değil mi diye bakar.büyük harf küçük harf duyarlısızdır.eşitliğe bakar
        System.out.println(str.contains("java"));
        //String içerisindeki verilen ifadenin olup olmadığını kontrol eder
        //büyük küçük harf, bosluk olup olmaması kısaca herşeyin kontrolünü yapar.




    }
}
