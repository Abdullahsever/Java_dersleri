package gün21;

public class _04MethodsExample {
    public static void main(String[] args) {
        /*
         Girilen yeni bir password un kurallara uygunluğunu kontrol eden bir metot yazin.
                  kurallar :
                  1) en az 8 karakter olmalı
                  2) içinde pass kelimesi olmamalı
                  3) en fazla 12 karakter olmalı.
         */
        System.out.println(password("ahmet123"));
    }
    public static  boolean password(String sifre){

      /*if (sifre.length()>=8 && sifre.length()<=12 && !(sifre.contains("pass"))){

        return true;
      }
      else {
          return false;
      }

       */
        return sifre.length()>=8 && sifre.length()<=12 && !(sifre.contains("pass"));

    }
}
