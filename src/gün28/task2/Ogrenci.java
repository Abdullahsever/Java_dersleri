package gün28.task2;

public class Ogrenci {
    // öğrenci bilgileri vardır

    String name;
    int number;

    //statik tanımlanmayan tüm variable ve metodlar nesneye aittir.

    public  void konus(){
        System.out.println("konuşuyorum");
    }
    public void adınıSoyle(){
        System.out.println("adım: "+name+ " , numaram:"+ number);
    }
}
