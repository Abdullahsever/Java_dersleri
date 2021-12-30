package gun15Cmrtsi;

public class _01SwitchCase1 {
    public static void main(String[] args) {
        int gun1=(int)(Math.random()*7)+1;
        System.out.println("random sayı: "+gun1);
        switch (gun1){
            case 1:
            System.out.println("p.tesi");
            break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;

        }


    }
}
