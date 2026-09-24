import java.util.Scanner;

public class rep_ex8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario = 0, mediaSalario = 0, maiorSalario = 0;
        double salarioDuzentos = 0;
        int filhos = 0;
        double mediaFilhos = 0;
        int contador = 0;
        double armazenador = 0, armazenadorFilhos = 0, armazenadorMaior =0;
        while (salario >= 0) {
            System.out.println("Informe o valor do seu salário:\n");
            salario = ler.nextDouble();

            if (salario < 0)
                System.out.println("Programa encerrado");

            else

                System.out.println("Informe quantos filhos você tem:\n");
            filhos = ler.nextInt();
            contador++;
            armazenador = salario + armazenador;
            mediaSalario = armazenador / contador;
            System.out.println("A média de salário de todos é: " + mediaSalario);
            armazenadorFilhos = armazenadorFilhos + filhos;
            mediaFilhos = armazenadorFilhos / contador;
            System.out.println("A média de filhos por família é: " + mediaFilhos);
            armazenadorMaior = salario;
            if (salario > armazenadorMaior){
                armazenadorMaior = salario;
            }
            System.out.println("O maior salário foi: " + armazenadorMaior);
            if (salario <= 200 ){
                salarioDuzentos++;
                System.out.println("A quantidade de salários até 200 reais é: " + salarioDuzentos);
            }
        }
    }
}