package gün26.task1;

public class Otomobil {
    String renk;
    double motorHacmi;
    int kacKapı,modelYılı;

    String marka;

    public void arabaMarkaVeModel(String marka,int modelYılı){
        System.out.println("arabanın markası "+ marka+ " "+ "arabanın model yılı "+ modelYılı);
    }

    public void arabaOzellikler(String marka, int kacKapı,int modelYılı,String renk){
        System.out.println(marka+" "+modelYılı+" "+kacKapı+" "+renk);
    }

}
