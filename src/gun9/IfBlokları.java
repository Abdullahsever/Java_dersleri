package gun9;

public class IfBlokları {
    public static void main(String[] args) {
        String str="If blokları";

        boolean b =str.equals("e");
        boolean c= str.equalsIgnoreCase(" ");
        boolean bb=str.isEmpty();
        boolean a= str.startsWith("e");
        boolean aa=str.endsWith("e");
        boolean cc=str.contains("c");

        int sayi1=4;
        int sayi2=5;

        boolean sayiBoolean1= sayi1==sayi2;
        boolean sayiBoolean2= sayi1!=sayi2;
        boolean sayiBoolean3= sayi1>sayi2;
        boolean sayiBoolean4= sayi1<sayi2;
        boolean sayiBoolean5= sayi1>=sayi2;
        boolean sayiBoolean6= sayi1<=sayi2;

        if (sayi1==sayi2){
            System.out.println("iki sayı eşittir");//Parantez içindeki ifadenin cevabu true ise,if süslü parantez
            //içi çalışır
        }
        else{
            System.out.println("Sayılar eşit değildir");//cevap false ise ssüslü parantezleri arası çalışır
        }

        if (str.endsWith("e")){
            System.out.println("cümle e ile bitiyor");//eşitlik kontrolü sadece sayılar arasında yapılır, string ile yapılmaz
            //eğer string eşitliği kontrol edilecekse == yerine equals() yada equalsIgnoreCase() kullanılır
        }
        else{
            System.out.println("cümle e ile bitmiyor");
        }


    }

}
