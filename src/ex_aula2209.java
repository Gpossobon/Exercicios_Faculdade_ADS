import java.util.Scanner;

public class ex_aula2209 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero = 0, expoente = 0, contador1 = 0, contador2 = 0, resultado = 1;
        int resMulti = 0;
        double somaTotal = 0;
        System.out.println("Informe um numero:");
        numero = ler.nextInt();
        System.out.println("Informe o expoente:");
        expoente = ler.nextInt();

        while (contador1 < expoente) {
            contador2 = 0;
            resMulti = 0;
            while (contador2 < numero) {
                resMulti = resMulti + resultado;
                contador2++;}
            resultado = resMulti;
            contador1++;}

        System.out.println("resultado: " + resultado);

    }
}