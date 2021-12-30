package gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _06_ArrayExample {
    public static void main(String[] args) {
        //5 sayı girin ve en büyüğünü yazdırın.
        Scanner scanner=new Scanner(System.in);
        int[] nums=new  int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("sayı gir");
            nums[i]=scanner.nextInt();

        }
        Arrays.sort(nums);//bunun yerine for döngüsü ve if sartı ile en büyük sayıyı buluyorduk
        //sort() metodu bunu tek satırda bizim yerimize yaptı. Diziyi küçükten büyüğe sıraladı
        int enb=nums[nums.length-1];//dizinin index değerleri 0 dan başlar.uzunluk sayma ise 1 den başlar.
        System.out.println("enb : "+enb);
    }
}
