package gün25;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_MapExample {
    public static void main(String[] args) {
        // Kullanıcıya
        // 1-Ekleme
        // 2-Listeleme
        // 3-Arama
        // 4-Düzeltme
        // 5-Çıkış
        // Seçeneklerini vererek username (key),password, userType (Müdür, çalışan) dan oluşan bir Map tanımlayınız.
        // Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
        // Mainde sadece Seçenekler ve metodların çağrılması olsun.
        Scanner scanner=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);

        Map<String,Map<String,String>> users=new HashMap<>();

        int islem;
        do {
            menu();
            System.out.println("işlem girin ");
            islem=scanner.nextInt();
            switch (islem){
                case 1: ekleme(users);break;
                case 2:listeleme(users);break;
                case 3:
                    System.out.println("username girin ");
                    String username=sc.nextLine();
                    arama(users,username);break;
                case 4:
                    System.out.println("username girin ");
                    username=sc.nextLine();
                    duzeltme(users,username);break;
            }
        }while (islem<5);

    }public static void duzeltme(Map<String,Map<String ,String>> users,String username){
        Scanner scanner=new Scanner(System.in);
        Map<String,String> mapset=new HashMap<>();

        System.out.println("yeni rol girin");
        String rol=scanner.nextLine();

        System.out.println("yeni password girin ");
        String password=scanner.nextLine();

        mapset.put(rol,password);
        users.put(username,mapset);


    }

    public static void arama(Map<String,Map<String ,String>> users, String username){
        System.out.println(users.get(username));
    }

    public static void listeleme(Map<String,Map<String ,String>> user){
        for (Map.Entry<String,Map<String,String>> mapEntry: user.entrySet()){
            System.out.println(mapEntry.getKey()+mapEntry.getValue());
        }


    }

    public static void ekleme(Map<String,Map<String,String>> users){
        Scanner scanner=new Scanner(System.in);
        Map<String,String> kullanıcı=new HashMap<>();

        System.out.println("kullanıcı adı girin");
        String name=scanner.nextLine();

        System.out.println("password girin ");
        String password=scanner.nextLine();

        System.out.println("kullanıcı rolü yazın ");
        String rol=scanner.nextLine();

        kullanıcı.put(rol,password);
        users.put(name,kullanıcı);
    }
    public static void menu(){
        System.out.println("1-Ekleme");
        System.out.println("2-Listeleme");
        System.out.println("3-Arama");
        System.out.println("4-Düzeltme");
        System.out.println("5-Çıkış");
    }
}
