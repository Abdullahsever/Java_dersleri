package gun12;

public class _01_WhileLoop {
    public static void main(String[] args) {
        //ekrana 3 kere Hello Word yazdırın
        int count=0;
        while (count<5) {// parantezlerr içerisindeki şart sağlandığı sürece calısır
            System.out.println("Hello Word");
            count++; // count = count + 1  ile aynı ifade;//bunu yazmazsak sonsuz defa "Hello Word" yazar.
            //Sonsuz döngüye girer.
        }

    }
}
