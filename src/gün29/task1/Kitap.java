package gün29.task1;

public class Kitap {

    String ad;
    int sayfasayısı, basımyılı;
    public void bilgileriniYaz(){
        System.out.println(ad+" "+ sayfasayısı+ " "+ basımyılı);
    }

}
class Main{
    public static void main(String[] args) {
        Kitap k1=new Kitap();
        k1.ad="Mesnevi";
        k1.sayfasayısı=500;
        k1.basımyılı=1320;

        Kitap k2=new Kitap();
        k2.ad="Ulusların Düşüşü";
        k2.sayfasayısı=320;
        k2.basımyılı=2013;

        k1.bilgileriniYaz();
        k2.bilgileriniYaz();
        KitapAdı(k1);
    }
    public static void KitapAdı(Kitap k){
        System.out.println(k.ad);
    }

}
