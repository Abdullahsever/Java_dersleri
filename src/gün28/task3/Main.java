package gün28.task3;

public class Main {
    public static void main(String[] args) {
        Arac arac1 = new Arac();
        arac1.marka = "Bmv";
        arac1.yıl = 2020;

        Arac arac2 = new Arac();
        arac2.marka = "Mercedes";
        arac2.yıl = 2021;

        arac1.calıs();
        arac1.kornabas();
        arac1.stopEt();
        System.out.println("--------");
        arac2.calıs();
        arac2.kornabas();
        arac2.kornabas();
    }
}

class Arac {
    String marka;
    int yıl;

    public void calıs() {
        System.out.println(marka + " " + yıl + " " + "çalıştım");
    }

    public void kornabas() {
        System.out.println(marka + " " + yıl + " " + "korna basstım");
    }

    public void stopEt() {
        System.out.println(marka + " " + yıl + " " + "stop ettim");
    }
}
