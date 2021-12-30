package gun17;

import java.util.Arrays;

public class _03_ArrayMetodları {
    public static void main(String[] args) {
        /*
        5 elemanlı bir dizi oluşurun ve elemanları küçükten büyüge sıralayınız
         */
        int[] nums={23,15,41,20,87,90};
        System.out.println("sort() dan önce =>"+Arrays.toString(nums));
        Arrays.sort(nums);
        //sort() metodu dizinin elemanlarını küçükten büyüğe sıralar.
        System.out.println("sort() dan önce =>"+Arrays.toString(nums));
    }
}
