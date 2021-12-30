package gun16;

public class _01_Array {
    public static void main(String[] args) {
        int[] intArray =new int[5];//1.tanımlma şekli
        int[] array={1,2,45,56,78};//2.tanımlama şeki

        intArray[0]=3;
        intArray[2]=5;
        intArray[4]=-25;
        for (int i = 0; i < intArray.length ; i++) {
            //1 ve 3. indekslere atama yapılmadı.Dizi int olduğu için default sıfır değeri atandı
            System.out.println(intArray[i]);
        }

    }
}
