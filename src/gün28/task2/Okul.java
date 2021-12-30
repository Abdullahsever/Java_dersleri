package gün28.task2;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();

        ogr1.name="";
        ogr1.number=100;

        ogr1.konus();
        ogr1.adınıSoyle();

        Ogrenci ogr2=new Ogrenci();
        ogr2.name="Veli";
        ogr2.number=200;
        ogr2.konus();
        ogr2.adınıSoyle();

    }
}
