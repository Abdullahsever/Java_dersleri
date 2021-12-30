package gun7;

public class _02StringMetodlar {
    public static void main(String[] args) {
        String str ="java alıştırmalar6";
        String str2="";
        System.out.println(str.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println(str.startsWith("j"));//String ifadenin belirtilen harfle balayıp başlamadığını kontrol eder
        System.out.println(str.startsWith("J"));// Büyük-küçük duyarlılığı vardır.
        System.out.println(str.endsWith("r"));//son harfine bakar.küçük büyük duyarlıdır.
        String strReplaceChar= str.replace('a','s');
        String strReplaceString=str.replace("java","python");
        System.out.println(strReplaceChar);
        System.out.println(strReplaceString);
        String strReplaceFirst= str.replaceFirst("a","*");
        System.out.println(strReplaceFirst);
        String strReplaceAll = str.replaceAll("[a-z]","*");
        System.out.println(strReplaceAll);
        String strReplaceAll2 = str.replaceAll("[^a-z]","*");
        System.out.println(strReplaceAll2);


    }


}
