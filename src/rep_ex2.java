import java.util.Scanner;

public class rep_ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int contador = 0;
        double nota1, nota2, nota3, media, mediaTodos, acumulador;
        acumulador = 0;
        while (contador < 2) {

            System.out.println("Informe a primeira nota:");
            nota1 = ler.nextDouble();
            System.out.println("Informe a segunda nota:");
            nota2 = ler.nextDouble();
            System.out.println("Informe a terceira nota:");
            nota3 = ler.nextDouble();

            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A Média é: " + media);

            if (media < 4) {
                System.out.println("Reprovado");
            }
            if (media > 4 && media < 6) {
                System.out.println("Em recuperação");
            } else {
                System.out.println("Aprovado");

            }
            acumulador = acumulador + media;
            contador++;
        }
            mediaTodos =acumulador /  contador;
            System.out.println("A média de todos os alunos é: " + mediaTodos);
        }
    }
