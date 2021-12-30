package deneme;

import java.util.ArrayList;

public class _deneme3 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> notlartablosu=new ArrayList<>();
        String[] dersler=new String[3];
        dersler[0]="Almanca";
        dersler[1]="Matematik";
        dersler[2]="İngilizce";

        ArrayList<Integer> almancanotlar=new ArrayList<>();
        almancanotlar.add(55);
        almancanotlar.add(65);
        almancanotlar.add(75);

        ArrayList<Integer> matnotlar=new ArrayList<>();

        matnotlar.add(68);
        matnotlar.add(88);
        matnotlar.add(99);

        ArrayList<Integer> ingnotlar=new ArrayList<>();

        ingnotlar.add(78);
        ingnotlar.add(85);
        ingnotlar.add(77);

        notlartablosu.add(almancanotlar);
        notlartablosu.add(matnotlar);
        notlartablosu.add(ingnotlar);
        for (int i = 0; i < notlartablosu.size(); i++) {
            System.out.println(dersler[i]);
            for (int j = 0; j < notlartablosu.get(i).size(); j++) {
                System.out.println(notlartablosu.get(i).get(j));

            }

        }

    }
}
