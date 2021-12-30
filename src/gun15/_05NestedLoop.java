package gun15;

public class _05NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            for (int j=1; j<=10; j++){
                int carpma = i * j;
                System.out.println(i+" x "+j+" = "+carpma);
            }
            System.out.println();
    }
}
}
