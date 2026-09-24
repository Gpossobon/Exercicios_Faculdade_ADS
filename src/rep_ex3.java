import java.util.Scanner;

public class rep_ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numero, contador, acumulador;
        contador = 0;
        acumulador = 0;
        while (contador < 3) {

            System.out.println("\nInforme um número:");
            {numero = ler.nextDouble();
                if (numero % 2 == 0) {
                    acumulador++;
                }
                contador++;
            }
        }
        System.out.println("A quantidade final de números pares é: " + acumulador);
    }
}