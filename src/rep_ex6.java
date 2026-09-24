import java.util.Scanner;

public class rep_ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int variavelN = 0, tabuada = 0;
        int conta;
        int contador = 1;
        while (contador <= 3) {
            System.out.println("Insira o valor da Variavel: ");
            variavelN = ler.nextInt();

            System.out.println(" A tabuada do " + variavelN + " É: ");
            while (tabuada <= 10) {
                conta = variavelN * tabuada;
                contador++;
                tabuada++;
                System.out.println(conta);
            }
        }
    }
}