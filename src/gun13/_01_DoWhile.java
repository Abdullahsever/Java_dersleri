package gun13;

import java.util.Scanner;

public class _01_DoWhile {
    //Kullanıcıdan kelime girmesini isteyin
    //Keime içerisinde  x gectiği zaman program sonlansın
    //While döngüsünde  önce sartı kontrol eder.eğer şart sağlanıyorsa döngü içine girer
    //do-while döngüsünde tek fark önce işlemi yapar sonra while içerisindeki sartın sağlanıp  sağlayıp sağlanmadığına bakar

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String kelime;//do ve while {} içerisindeki değişkenler için ortak tanımlama.kullanmazsak iki ayrı {} tanıyamaz
        do {
            System.out.println("kelime girin");
            kelime=scanner.nextLine();
        }while (!kelime.contains("x"));
        //kelime içersinde x olmadığı sürece devam et
    }

}
