import java.util.Scanner;

public class ex_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;
        double calculo;
        calculo = 0;
        System.out.println("Digite a primeira nota: ");
        nota1 = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = ler.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = ler.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = ler.nextDouble();

        System.out.println("Informe 1 para calcular a média Aritmetica\n:");
        System.out.println("Informe 2 para calcular a média Harmônica\n");
        System.out.println("Informe 3 para calcular a média Ponderada\n");

        calculo = ler.nextDouble();
        if (calculo == 0) {
            System.out.println("Número invalido");
        }
        if (calculo > 3) {
            System.out.println("Numero invalido");

        } else if (calculo == 1) {
            calculo = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("A média aritmética é: " + calculo);
            if (calculo >= 6) {
                System.out.println("Aluno aprovado!");
            } else
                System.out.println("Aluno reprovado!");
        } else if (calculo == 2) {
            calculo = (1.0 / nota1) + (1.0 / nota2) + (1.0 / nota3) + (1.0 / nota4);
            double mediaHarmonica = 4.0 / calculo;
            System.out.println("A média Harmônica é: " + mediaHarmonica);
            if (mediaHarmonica >= 6) {
                System.out.println("Aluno aprovado");
            } else
                System.out.println("Aluno reprovado");

        } else if (calculo == 3) {
            double peso1, peso2, peso3, peso4;
            System.out.println("Informe o peso da Nota 1");
            peso1 = ler.nextDouble();
            System.out.println("Informe o peso da Nota 2");
            peso2 = ler.nextDouble();
            System.out.println("Informe o peso da Nota 3");
            peso3 = ler.nextDouble();
            System.out.println("Informe o peso da Nota 4");
            peso4 = ler.nextDouble();

            calculo = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) + (nota4 * peso4);
            double somaPesos = peso1 + peso2 + peso3 + peso4;
            media = calculo / somaPesos;
            System.out.println("A média Ponderada é:\n" + media);
            if (media >= 6) {
                System.out.println("Aluno aprovado");
            } else
                System.out.println("Aluno reprovado");
        }
    }
}

