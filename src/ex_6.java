import java.util.Scanner;
public class ex_6 {
    public static void main(String[] args) {
        double salario, decimoTerceiro, salarioAnual, adicionalFerias, impostoDeRenda;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu salário Mensal:\n");
        salario = input.nextDouble();

        decimoTerceiro = salario / 12 * 12;
        System.out.println("Seu Décimo Terceiro é:\n " + decimoTerceiro);

        adicionalFerias = salario / 3;
        System.out.println("Seu adicional de féria é:\n" + adicionalFerias);

        salarioAnual = salario * 12 + adicionalFerias + decimoTerceiro;
        System.out.println("Seu salário Anual é:\n" + salarioAnual);
        if (salarioAnual <= 60000) {
            impostoDeRenda = 0;
            System.out.println("Isento de Imposto de Renda!\n");
        }
        else if (salarioAnual > 60000 && salarioAnual < 75000) {
        impostoDeRenda = salario * 0.05;
        System.out.println("Seu imposto de Renda é:\n " + impostoDeRenda);

        } else if (salarioAnual > 75000 && salarioAnual < 100000) {
            impostoDeRenda = salario * 0.10;
            System.out.println("Seu imposto de Renda é:\n " + impostoDeRenda);

        } else if (salarioAnual > 100000 && salarioAnual < 150000) {
            impostoDeRenda = salario * 0.16;
            System.out.println("Seu imposto de Renda é:\n " + impostoDeRenda);

        } else {
            impostoDeRenda = salario * 0.24;
            System.out.println("Seu imposto de Renda é:\n " + impostoDeRenda);
        }
        double salarioSemDesconto = salario + impostoDeRenda;
        System.out.println("Seu salario sem desconto mensal do IR seria:\n " + salarioSemDesconto);
    }
}