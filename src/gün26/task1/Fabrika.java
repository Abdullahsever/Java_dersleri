package gün26.task1;

public class Fabrika {
    public static void main(String[] args) {
        Otomobil otomobil1=new Otomobil();
        otomobil1.renk="kırmızı";
        otomobil1.kacKapı=4;
        otomobil1.marka="BMW";
        otomobil1.modelYılı=2020;

        otomobil1.arabaMarkaVeModel(otomobil1.marka, otomobil1.modelYılı);

        Otomobil otomobil2=new Otomobil();

        otomobil2.renk="mavi";
        otomobil2.marka="Mercedes";
        otomobil2.kacKapı=4;
        otomobil2.modelYılı=2021;
        otomobil2.arabaOzellikler(otomobil1.marka, otomobil2.kacKapı, otomobil2.modelYılı, otomobil2.renk );

        Otobüs otobüs=new Otobüs();

        otobüs.marka="Mercedes";
        otobüs.modelYili=2022;
        otobüs.renk="mavi";
        otobüs.motorHacmi=5000;
        System.out.println(otobüs.marka);





    }
}
