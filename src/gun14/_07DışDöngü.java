package gun14;

public class _07DışDöngü {
    public static void main(String[] args) {
        DisDongu:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == 3) {
                    int carpma = i * j;
                    System.out.println(i + " x " + j + " = " + carpma);
                    break DisDongu;

                }

            }
            System.out.println();

        }
    }
    }



