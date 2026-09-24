import java.util.Scanner;

public class rep_ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int contador;
        double nota, acumulador, media;
        nota = 0;
        acumulador = 0;
        contador = 0;
        while (contador < 3) {
            System.out.println("\nNota: ");
            nota = ler.nextDouble();

            acumulador = acumulador + nota;
            contador = contador + 1;
        }
            media = acumulador / contador;
            System.out.println("Media: " + media);
        if (media >= 6) {
                System.out.println("Aprovado");

            } else {
                System.out.println("Reprovado");
            }

        }
    }
