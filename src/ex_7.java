import java.util.Scanner;
public class ex_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        double resultado;
        int operacao;
        System.out.println(" Digite:\n 1 para somar\n 2 para Subtrair\n 3 para Multiplicar\n 4 para Dividir\n 5 para Sair");
        System.out.println("Escolha a operação:");
        operacao = ler.nextInt();

        if (operacao == 5){
            System.out.println("Saindo do programa");

        }else {
            System.out.println("Digite o primeiro valor:");
            numero1 = ler.nextDouble();

            System.out.println("Digite o segundo valor:");
            numero2 = ler.nextDouble();

        }if (operacao == 1){
            resultado = numero1 + numero2;
            System.out.println("O valor da soma é:\n" + resultado);
        }else if (operacao == 2){
            resultado = numero1 - numero2;
            System.out.println("O valor da subtração é:\n" + resultado);
        }else if (operacao == 3){
            resultado = numero1 * numero2;
            System.out.println("O valor da multiplicação é:\n" + resultado);
        }else if (operacao == 4){
            resultado = numero1 / numero2;
            System.out.println("O valor da divisão é:\n" + resultado);
        }

    }
}
