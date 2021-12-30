package gün29.task3;

public class Main {
    public static void main(String[] args) {
        Insan i1=new Insan();
        i1.VeriAta("ali",25);

        Insan i2=new Insan();
        i2.VeriAta("Hasan",30);

        Insan i3=new Insan();
        i3.VeriAta("Ayşe", 45);

        Insan dede=new Insan();
        dede.VeriAta("Dede",80);

        i1.babaAta(i2);
        i1.anneAta(i3);

        i2.babaAta(dede);

        i1.senKimsin();
        i1.babaKim();
        i1.anneKim();
        i1.baba.babaKim();
        i2.babaKim();
    }
}
