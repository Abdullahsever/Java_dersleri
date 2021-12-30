package gün20;

public class _01_OverloadMethod {
    public static void main(String[] args) {
        /*
        öyle bir toplama metodu yazın ki kullanıcı 2,3 ve 4 sayının toplamını bu metodla yapabilsin
         */
        toplama(23,14);
        toplama(45,65,60);
        toplama(12,52,36,41);
        /*
        aynı isimde aynı işi yapan ama parametre sayısı farklı olan metodlara overload metod denir
         */
    }
    public static void toplama(int sayı1,int sayı2){
        int toplam=sayı1+sayı2;
        System.out.println("toplam= "+toplam);
    }public static void toplama(int sayı1,int sayı2,int sayyı3){
        int toplam=sayı1+sayı2+sayyı3;
        System.out.println("toplam= "+toplam);
    }
    public static void toplama(int sayı1,int sayı2,int sayı3,int sayı4){
        int toplam=sayı1+sayı2+sayı3+sayı4;
        System.out.println("toplam= "+toplam);}

}
