package gun14;

public class _06NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == 3) {
                    int carpma = i * j;
                    System.out.println(i + " x " + j + " = " + carpma);
                    break;
                }

            }
            System.out.println();
        }


    }
}


