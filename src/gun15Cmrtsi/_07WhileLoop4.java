package gun15Cmrtsi;

public class _07WhileLoop4 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            int j = 0;
            while (j < 5) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
