import java.util.HashMap;
import java.util.Map;

public class tekrar2 {
    public static void main(String[] args) {

        Map<String,Integer>mapset=new HashMap();
        mapset.put("Ahmet",65);
        mapset.put("Mehmet",55);
        mapset.put("Fatma",55);
        mapset.put("Ceren",75);//sol taraf key,sağ taraf value
        System.out.println(mapset);
        System.out.println("Ahmet "+mapset.get("Ahmet"));
        System.out.println("keyset "+ mapset.keySet());
        System.out.println("value "+mapset.values());
        for (var name: mapset.keySet()) {
            System.out.println(name);

        }
        for (var değer: mapset.values()) {
            System.out.println(değer);
        }
        for(var keyveValues: mapset.entrySet()){
            System.out.println(keyveValues.getKey());
            System.out.println(keyveValues.getValue());
        }
        boolean buKeyVarMı=mapset.containsKey("abdullah");
        boolean buValueVarMı=mapset.containsValue("56");
        System.out.println("key var mı?"+buKeyVarMı);
        System.out.println("value var mı?"+buValueVarMı);
        mapset.remove("Ahmet");
        System.out.println(mapset);
        mapset.clear();
        System.out.println(mapset);

        Map<String,String> bilgiler1 = new HashMap<>();
        bilgiler1.put("email","mehmet@gmail.com");
        bilgiler1.put("tel","+903212234");
        bilgiler1.put("adres","köln");
        bilgiler1.put("cinsiyet","erkek");

        Map<String,String> bilgiler2 = new HashMap<>();
        bilgiler2.put("email","abdullah@gmail.com");
        bilgiler2.put("tel","+903212234");
        bilgiler2.put("adres","ankara");
        bilgiler2.put("cinsiyet","erkek");

        Map<String,Map<String,String>> kisiBilgileri= new HashMap<>();
        kisiBilgileri.put("Aziz", bilgiler1);
        System.out.println(kisiBilgileri);
        System.out.println(kisiBilgileri.get("Aziz"));
        System.out.println(kisiBilgileri.get("Aziz").get("email"));




    }
}
