package gun15Cmrtsi;

public class _05WhileLoop2 {
    public static void main(String[] args) {
        int i= 0;
        while(i<5){
            System.out.println(i);
            i++;
        }
        System.out.println("--------------------");
        i=0;
        while (i<5){
            if(i==3)
                break;  // sart sağlanırsa loop biter
            System.out.println(i);
            i++;
        }

        System.out.println("---------------");
        i=0;
        while (i<5){
            if (i==3){
                i++;
                continue;   //şart sağlanırsa sonraki tura geçecek
            }

            System.out.println(i);
            i++;
        }
    }
}
