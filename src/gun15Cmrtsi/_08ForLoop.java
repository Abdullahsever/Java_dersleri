package gun15Cmrtsi;

public class _08ForLoop {
    public static void main(String[] args) {
        //döngü sayısı biliniyor ise for kullanılır
        for (int i = 0; i < 5; i++) {
            System.out.println(i +" ");

        }
        System.out.println();
         int i=0;
        for (; i < 5;) {
            System.out.println(i+" ");
            i++;

        }
        System.out.println();
        System.out.println("i "+i);
        //infinite loop(burda if kullanmadığımız da sonsuz döngüye girer)
        for(;;){
            System.out.print("*");
            if (i++>50)
                break;
    }

    }
}
