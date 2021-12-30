package gun5;

public class StringMetodlar5 {
    public static void main(String[] args) {
        String text = "Java dünyasina hosgeldiniz";
        String ayrac = "dünya";
         int indexAyrac = text.indexOf(ayrac);
         String ilkBolum = text.substring(0,indexAyrac);
        System.out.println(ilkBolum+ " ," + ilkBolum.length());
        int indexAyrac2 = indexAyrac + ayrac.length();
        String ikinciBolum = text.substring((indexAyrac2));
        System.out.println(ikinciBolum+ ","+ikinciBolum.length());

    }

}
