package gun15;

public class _03_NetstedLoop {
    public static void main(String[] args) {
        for (int satır = 0; satır <5 ; satır++) {
            for (int sütun = 0; sütun <=satır; sütun++) {//herbir sütun için satır sayıı kadar * atar
                //her satırda satırın o anki sayısı kadar yıldız olduğundan sütün <=satır dediğimiz için
                System.out.print("*");

            }

            System.out.println();


        }
    }
}
