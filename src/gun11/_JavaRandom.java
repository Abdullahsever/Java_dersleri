package gun11;

public class _JavaRandom {
    public static void main(String[] args) {
        double randomSayi1= Math.random();
        //0-1 arası rastgele bir sayi üretir. 1 dahil değil
        System.out.println("randomSayi1 = "+randomSayi1);
        int randomSayi2=(int) (Math.random()*10);
        //0 ile 10 arasında rastgele sayı üretmek için. 0 ile 10 arasında  random bir sayı oluşturur. 10 dahil değil
        System.out.println("randomSayi2 = "+randomSayi2);
        int min=3;
        int max=7;

        int randomSayi3=(int)(Math.random()*((max-min)+1))+min;
        System.out.println("randomSayi3 = "+randomSayi3);
        /*max ve min sayıları verip o aralıkta random sayı oluşturmak için bu formül kullanılır

        min --> 0*(...)min => 3
        max --> (0,99*(5))+min => 7 gibi
         */

    }
}
