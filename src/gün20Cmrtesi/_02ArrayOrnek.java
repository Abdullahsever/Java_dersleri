package gün20Cmrtesi;

import java.util.Arrays;

public class _02ArrayOrnek {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};

        //Ekrandan veri alınırsa
        //int min=Integer.MAX_VALUE
        int enk=arr[0];
        int enb=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<enk){
                enk=arr[i];
            }else if (arr[i]>enb){
                enb=arr[i];
            }

        }
        System.out.println("en küçük "+enk+"en büyük "+enb);
        System.out.println(Arrays.toString(new int[]{enk,enb}));

    }
}
