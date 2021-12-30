import java.util.Scanner;

public class _denemee {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        int secim;
        menüYaz();

        do {
            System.out.println("işlem seçin ");
            secim=scanner.nextInt();
            islemler(secim);
        }while (secim<6);


    }
    public  static void menüYaz(){
        System.out.println("****Menü****");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");
        System.out.println("5-Faktöriyel");
        System.out.println("6-Çıkış");
    }public static void islemler(int islem){
        Scanner scanner=new Scanner(System.in);
        int num1,num2;
        switch (islem){
            case 1:
                System.out.println("1.sayı gir");
                num1=scanner.nextInt();
                System.out.println("2.sayıyı gir");
                num2=scanner.nextInt();
                int toplam=num1+num2;
                System.out.println(toplam);
                break;
            case 2:
                System.out.println("1.sayı gir");
                num1=scanner.nextInt();
                System.out.println("2.sayıyı gir");
                num2=scanner.nextInt();
                 int çıkarma=num1-num2;
                System.out.println(çıkarma);
                 break;
            case 3:
                System.out.println("1.sayı gir");
                num1=scanner.nextInt();
                System.out.println("2.sayıyı gir");
                num2=scanner.nextInt();
                int çarpma=num1*num2;
                System.out.println(çarpma);
                break;
            case 4:
                System.out.println("1.sayı gir");
                num1=scanner.nextInt();
                System.out.println("2.sayıyı gir");
                num2=scanner.nextInt();
                if (num2==0){
                    System.out.println("sıfır tanımsız yapar");
                }
                else {
                int bölme=num1*num2;
                    System.out.println(bölme);}


                break;
            case 5:
                int faktöriyel=1;
                System.out.println("sayı gir");
                num1=scanner.nextInt();
                for (int i = 1; i <= num1; i++) {
                    faktöriyel*=i;

                }
                System.out.println(faktöriyel);

                break;

        }


}



}
