package gün21;

public class _02MethodExample {
    public static void main(String[] args) {
        /*
        FAktöriyel hesaplayan bir metod yazın
         */
        faktöriyel(12);
        faktöriyel(10);
        faktöriyel(7);
    }public static void faktöriyel(int num){
        double faktöriyel=1;
        for (int i = 1; i <=num ; i++) {
            faktöriyel*=i;


        }
        System.out.println("faktöriyel = "+ faktöriyel);
    }
}
