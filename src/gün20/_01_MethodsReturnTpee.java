package gün20;

public class _01_MethodsReturnTpee {
    public static void main(String[] args) {
        /*
        iki sayının toplamını bulan method yazın
         */
        int toplam=toplamReturn(23,65);//return la işleme koyduk
        System.out.println(toplam);
        toplam();//bu void olan

    }
    public static void toplam(){ // parametresiz metot
        int sayi1 = 34;
        int sayi2 = 45;
        int toplam = sayi1+sayi2;
        System.out.println(toplam);
    }
    public static void toplamBul(int sayi1, int sayi2){ // parametreli metot
        int toplam = sayi1+sayi2;
        System.out.println("toplam = " + toplam);
    }
    public static int toplamReturn(int sayı1,int sayı2){//return type ,void karşılığı olmayan bir değer demek
        //işlemler için return yapmamız lazım
        int toplam=sayı1+sayı2;
        return toplam;
    }
    public static int toplamReturnParametresiz(){
        int sayı1=45;
        int sayı2=56;
        int toplam=sayı1+sayı2;
        return  toplam;
    }
}
