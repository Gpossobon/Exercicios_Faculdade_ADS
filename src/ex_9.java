import java.util.Scanner;

public class ex_9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int positivo1, positivo2, positivo3;
        int primeiro = 0, segundo = 0, terceiro =0;

        System.out.println("Informe o primeiro valor positivo:\n ");
        positivo1 = ler.nextInt();
        System.out.println("Informe o segundo valor positivo:\n ");
        positivo2 = ler.nextInt();
        System.out.println("Informe o terceiro valor positivo:\n");
        positivo3 = ler.nextInt();

        if (positivo1 < positivo2 && positivo1 < positivo3 && positivo2 < positivo3) {
            primeiro = positivo1;
            segundo = positivo2;
            terceiro = positivo3;
            System.out.println("A ordem de numeros crescentes é:\n" + primeiro + segundo + terceiro);
        }if (positivo2 < positivo1 && positivo2 < positivo3 && positivo1 < positivo3) {
            primeiro = positivo1;
            segundo = positivo2;
            terceiro = positivo3;
            System.out.println("A ordem de numeros crescente é:\n" + primeiro + segundo + terceiro );
        }if (positivo3 < positivo1 && positivo3 < positivo2 && positivo1 < positivo2) {
            primeiro = positivo1;
            segundo = positivo2;
            terceiro = positivo3;
            System.out.println("A ordem de numeros crescente é:\n" + primeiro  + segundo + terceiro);
        }
        }
        }

