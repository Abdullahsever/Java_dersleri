package gün28.task2;

public class Dog {

    //instance vars, new ile oluşturulanlar
    String name;
    String cins;
    int yas;

    //class vars, bir tanedir ,nesnede oluşturulmazlar.
    static int count;

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="lassi";
        d1.cins="doberman";
        d1.yas=3;
        d1.havla();
        yaz(d1.name);
        yaz("java");

        Dog d2=new Dog();
        d2.name="lassi";
        d2.cins="doberman";
        d2.yas=3;
        d2.havla();
        yaz(d2);

        System.out.println("----------------");
    }

    public void havla(){
        {
            System.out.println("ben "+name);
        }

    }
    public static void yaz(String str){
        System.out.println(str);
    }
    public  static void yaz(Dog dog){
        System.out.println(dog.name);
    }
}
