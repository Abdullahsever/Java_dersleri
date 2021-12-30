package gun4;

public class StringMetodlar {
    public static void main(String[] args) {
        String name = "Abdullah";
        char ilkHarf =name.charAt(0);
        char sonHarf = name.charAt(7);
        boolean aynımi = ilkHarf == sonHarf;
        System.out.println(aynımi);

        String  cümle ="Merhaba Dünya";
        String kes   = cümle.substring(0);
        System.out.println(kes);
        String ifade = "Bugün hava kapalı şemsiye almam lazım";
        String soru = ifade.substring(18,37);
        String soru2 = ifade.substring(0,17);
        System.out.println(soru+ ", "+soru2);

        String okul ="Dortmund Technic";
        char ikinci = okul.charAt(1);
        char ucuncu = okul.charAt(2);
        System.out.println("ikinci harfi: "+ikinci+", üçüncü harfi: "+ucuncu);

        char sonharf = name.charAt(name.length()-1);
        System.out.println(sonharf);
    }


}
