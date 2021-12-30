package gun16;

public class _02_Array {
    public static void main(String[] args) {

        String[] strArray=new String[6];//1.tanımlama şekli
        String[] array={"hello","merhaba","hallo"};//2.tanımlama şekli

        strArray[0]="";
        strArray[2]=" ";
        strArray[4]="Hello";
        strArray[5]="I love Java";
        for (int i = 0; i < strArray.length; i++) {
            /*
            String indekslere değer atamaz isek defaul olarak null değeri çıktısı verir.
             */

            System.out.println(strArray[i]);


        }
    }

}
