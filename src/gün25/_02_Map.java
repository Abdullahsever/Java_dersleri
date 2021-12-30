package gün25;

import java.util.HashMap;
import java.util.Map;

public class _02_Map {
    public static void main(String[] args) {
        Map<String,String>bilgiler=new HashMap<>();
        bilgiler.put("email","mehmet@gmailç");
        bilgiler.put("phone","905214963");
        bilgiler.put("adres","köln");
        bilgiler.put("cinsiyet","erkek");

        Map<String,String>bilgiler2=new HashMap<>();
        bilgiler2.put("email","abdullah@gmailç");
        bilgiler2.put("phone","905214963");
        bilgiler2.put("adres","ankara");
        bilgiler2.put("cinsiyet","erkek");

        Map<String,Map<String,String>> kisiBilgiler= new HashMap<>();
        kisiBilgiler.put("mehmet",bilgiler);
        kisiBilgiler.put("abdullah",bilgiler2);

        System.out.println(kisiBilgiler);
        System.out.println(kisiBilgiler.get("mehmet"));
        System.out.println(kisiBilgiler.get("mehmet").get("email"));
        System.out.println(kisiBilgiler.get("abdullah"));
        System.out.println(kisiBilgiler.get("abdullah").get("adres"));



    }
}
