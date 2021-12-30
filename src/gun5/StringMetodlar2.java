package gun5;

public class StringMetodlar2 {
    public static void main(String[] args) {
        String ilk = "Bugün hava";
        String son = " cok güzel";
        System.out.println(ilk+son);
        String birlesme = ilk.concat( " sıcak bir gündü");
        System.out.println(birlesme);
        System.out.println(birlesme.indexOf("gün"));
        String bahar = "Bugün günlerden Cuma yarın değil";
        System.out.println(bahar.indexOf(" de"));
        System.out.println(bahar.substring(26));
    }
}
