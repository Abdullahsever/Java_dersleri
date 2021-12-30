package deneme;


import java.util.Scanner;

public class _tekrar {

  public static void main(String[] args) {
      /*
        ögrencilerin vize ve final notlarini girebilecegi
        bir program yazin. Kac ögrenci olacagini da alin
         */
    Scanner scanner=new Scanner(System.in);
    System.out.println("kaç öğrenci");
    int öğrsayısı=scanner.nextInt();
    int[][] notlartablosu=new int[öğrsayısı][2];
    for (int i = 0; i < notlartablosu.length; i++) {
      for (int j = 0; j < notlartablosu[i].length; j++) {

        if (j==0){
          System.out.println(i+1+" .öğrenci"+ " vizede "+notlartablosu[i][j]);
          notlartablosu[i][j]=scanner.nextInt();
        }else {
          System.out.println(i+1+" .öğrenci"+ " finalde"+notlartablosu[i][j]);
          notlartablosu[i][j]=scanner.nextInt();
        }
        System.out.println();
      }

    }
    for (int i = 0; i < notlartablosu.length; i++) {
      for (int j = 0; j < notlartablosu[i].length; j++) {

        if (j==0){
          System.out.println(i+1+" .öğrenci"+ " vizede "+notlartablosu[i][j]);

        }else {
          System.out.println(i+1+" .öğrenci"+ " finalde"+notlartablosu[i][j]);

        }
        System.out.println();
      }

    }

    }


}

