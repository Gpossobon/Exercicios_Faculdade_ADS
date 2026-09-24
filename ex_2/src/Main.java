import java.util.Scanner;    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double idade, altura;
        System.out.println("Digite sua idade:");
        idade = ler.nextDouble();
        System.out.println("Digite sua altura:");
        altura = ler.nextDouble();

        if (idade >= 10 || altura >= 1) {
            System.out.println("Voce pode andar na montanha russa");
        }
            else if (idade < 10 || altura < 1) {
                System.out.println("Voce nao pode andar na montanha russa");

            }
        }
    }
