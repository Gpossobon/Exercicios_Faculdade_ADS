import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numeroA, numeroB, resultado;
        System.out.println("Digite o primeiro numero: ");
        numeroA = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        numeroB = ler.nextInt();
        resultado = numeroA / numeroB;
        System.out.println("resultado da divisâo:" + resultado);

        int resto = numeroA % numeroB;
        System.out.println(" O resto é:" + resto);
        if (resto == 0) {
            System.out.println("Numero divisivel");
        }
            if (resto == 1) {
                System.out.println("Numero impar");
            } else {
                System.out.println("Numero par ");
            }

        }

    }

