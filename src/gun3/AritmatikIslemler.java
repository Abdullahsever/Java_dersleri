package gun3;

public class AritmatikIslemler {
    public static void main(String[] args) {
       /* int elma1=3;
        int elma2=2;
        System.out.println("Toplam elmam "+(elma1+elma2)+" kg kadar");
         int ev = 200000;
         int aylikOdeme = 1200;
        System.out.println("Toplam ödemem gereken ay sayısı: "+(ev/aylikOdeme));
        int partiEvi = 20;
        int gidenKola = 12;
        int icilenKola = 3;
        int toplam = partiEvi+gidenKola-icilenKola;
        System.out.println("Evde Toplam "+toplam+" şişe kola var.");*/
        int koyHane = 300;
        int tasınanHane = 50;
        int KoyeGelen = 110;
        int toplam = koyHane-tasınanHane+KoyeGelen;
        boolean nedir = koyHane>toplam;
        System.out.println(toplam);
        System.out.println(nedir);

    }
}
