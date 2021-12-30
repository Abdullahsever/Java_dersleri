package gun17;

import java.util.Arrays;

public class _02ArrayMetodları {
    public static void main(String[] args) {
        //5 elemanlı bir dizi oluşturun ve ekrana yazdırın
        int[] nums={23,45,14,3,5};
        //1.yöntem
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        //2.yöntem
        System.out.println(Arrays.toString(nums));
        //diziyi ekrana yazdırmanın 2. yolu
    }
}
