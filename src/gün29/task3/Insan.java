package gün29.task3;

public class Insan {
    String adı;
    int yas;
    Insan baba;
    Insan anne;

    public  void VeriAta(String adı, int yas){
        this.adı=adı;
        this.yas=yas;
    }
    public void babaAta(Insan insan){
        baba=insan;

    }
    public void anneAta(Insan insan){
        anne=insan;
    }
    public void senKimsin(){
        System.out.println("adım "+adı+" yaşım"+yas);
    }
    public void babaKim(){
        System.out.println("Babamın adı "+ baba.adı+" yaşı "+ baba.yas);
    }
    public  void anneKim(){
        System.out.println("Annemin adı "+anne.adı+" "+ "yaşı "+ anne.yas);
    }

}
