package gün25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _01_Map {
    public static void main(String[] args) {
        HashSet<Long> tcNo = new HashSet<>();

        tcNo.add(123456789L);
        tcNo.add(1234567899L);

        System.out.println(tcNo);

        Map<String, Integer> ogrnciNotlar = new HashMap<>();

        // sol taraf key denir
        // sağ taraf value denir
        ogrnciNotlar.put("abdullah", 90);
        ogrnciNotlar.put("fatma", 90);
        ogrnciNotlar.put("celil", 89);
        ogrnciNotlar.put("celil", 91);// ilk girilen değerin (keyin) yerine bunu yazar.Aynı isimde keyden birden fazla
        //eklenirse sson eklenen değer olarak kalır.

        //1.yazdırma yolu
        System.out.println(ogrnciNotlar);
        System.out.println("kartvizit.get(\"abdullah\") = " + ogrnciNotlar.get("abdullah"));
        System.out.println("kartvizit.keyset() = " + ogrnciNotlar.keySet()); // keylerin tamamını
        System.out.println("kartvizit.values() = " + ogrnciNotlar.values()); // value ların  tamamını

        //2.yazdırma yolu
        for (String str : ogrnciNotlar.keySet()) { //keyler için  keySet()
            System.out.println(str);// tüm keyleri yazar
        }
        for (Integer i : ogrnciNotlar.values() // value lar için values()
        ) {
            System.out.println(i); // tüm valueleri yazar
        }
        for (Map.Entry<String, Integer> keyVeValues : ogrnciNotlar.entrySet()) { // hem key hem value ları verir
            System.out.println(keyVeValues);
            System.out.println("key "+keyVeValues.getKey());
            System.out.println("value "+keyVeValues.getValue());

        }

        boolean bukeyVarmı=ogrnciNotlar.containsKey("ahmet");
        //containsKey()
        boolean buValueVarmı=ogrnciNotlar.containsValue(89);

        System.out.println("bu key var mı ="+ bukeyVarmı);
        System.out.println("bu value var mı"+ buValueVarmı);

        ogrnciNotlar.remove("mehmet");
        //mehmet keyini siler haliyle bu keyin vauesunu da siler

        ogrnciNotlar.clear(); // bu tüm map i siler. İlk tanımlanmış boş haline döner
    }
}
