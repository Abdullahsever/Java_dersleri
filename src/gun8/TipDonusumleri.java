package gun8;

public class TipDonusumleri {
    public static void main(String[] args) {
         String str ="1234";
         int intDeger=Integer.parseInt(str);
         //String ifadeyi(sadece sayısal değer olmalı ve boşluk gibi başka karakterler olmamalı) integer a çevirir
        System.out.println(intDeger);
        double doubleDeger=Double.parseDouble(str);
        //String ifadeyi double a çevirir
        System.out.println(doubleDeger);

        double doubleDegisken=12;
        int intDegisken= (int) doubleDegisken;
        float f=(float)  doubleDegisken;
        //büyük değeri küçük değere atamak için
        //esitliğin sağ tarafına kucuk değişkenin tipini parantez içinde yazmak gerekir.
        //double>float>long>int>short>byte
        System.out.println(f);

        int i=1234;
        String strInt=String.valueOf(i);
        //integer birr degişkeni string değişkene cevirir.
        System.out.println(strInt);
        double d = 1234.5;
        String strDouble=String.valueOf(d);
        //double bir değişkeni string değiikene çevirir.
        System.out.println(strDouble);
        System.out.println(strInt);



    }
}
