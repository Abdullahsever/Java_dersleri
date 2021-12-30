package gün19;

public class _01_Methods {
    public static void main(String[] args) {
        int sayı1= 3;
        int sayı2=5;
        findEnb(sayı1,sayı2);

        findEnb(45,67);
    }
    public static void findEnb(int a,int b){
        /*
        int a ve int b ye parametre denir.Metodun kullanıldığı yerde içine verilen değerlerdir.
        Parametre vermenin bir sınırı yoktur.Parametreler aynı tipte olmak zorunda değildir.
        Parametre isimleri ile dışarıdan gelen  verinin isminin aynı olmak  zorunda değildir.
         */
        if(a>b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}
