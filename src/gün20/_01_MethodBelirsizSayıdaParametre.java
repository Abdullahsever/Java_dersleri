package gün20;

public class _01_MethodBelirsizSayıdaParametre {
    public static void main(String[] args) {
        /*
        Toplama metodu yazın, ama kaç sayı olacağı bilinmiyor
         */
        toplama(23,22,15);
        toplama(21,22);
        toplama(14,12,13,16);
        toplama(85,36,41,25,89,74,12,36,74,123,63);
    }
    public static void toplama(int...sayılar){
        //int... sayılar=> dizi mantığında çalışır.Kaç tane verdiğimizin bir  önemi yok.
        //2 veya 100 sayı içinde aynı işi yapar
        int toplam=0;
        for (int i = 0; i < sayılar.length; i++) {
            toplam+=sayılar[i];

        }
        System.out.println("toplam = "+toplam);
    }
}
