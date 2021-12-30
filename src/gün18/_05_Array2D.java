package gün18;


public class _05_Array2D {
    public static void main(String[] args) {

        /*
        {{"15$","56€","33$"},{"67$","78€"},{"100€"}}
        bu sekilde bir fiyat tablonuz var. dolar olanlari 3 ile,
        euro olan fiyatlari 5 ile carpip toplam fiyati bulun.
         */

        String[][] fiyatlar =  {{"15$","56€","33$"},{"67$","78€"},{"100€"}};
        // toplamda 3 satir var 1. satirda 3 sütun
        // 2. satirda 2 sütun. 3. satirda 1 sütun

        int toplam = 0; // toplam degiskeni disarida oldugu icin if else icerisindeki islemlerin toplam sonucunu alir
        String fiyat = "";

        for (int satır = 0; satır < fiyatlar.length; satır++) {
            for (int sütun = 0; sütun < fiyatlar[satır].length; sütun++) {

                if (fiyatlar[satır][sütun].contains("$")){
                    fiyat=fiyatlar[satır][sütun].replaceAll("\\$","");
                    toplam+=Integer.parseInt(fiyat)*3;
                }else {
                    fiyat=fiyatlar[satır][sütun].replaceAll("€","");
                    toplam+=Integer.parseInt(fiyat)*5;
                }
            }
        }
        System.out.println("toplam = " + toplam);


    }
}





