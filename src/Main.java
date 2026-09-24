
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double joao, maria, zezinho;
        System.out.println("Digite a idade de Joao");
        joao = ler.nextDouble();
        System.out.println("Digite a idade de Maria");
        maria = ler.nextDouble();
        System.out.println("Digite a idade de zezinho");
        zezinho = ler.nextDouble();

        if (joao < 0 || joao > 18 || maria < 0 || maria > 18 || zezinho < 0 || zezinho > 18) {
            System.out.println("Idade digitada invalida.");
        }
        if (joao == maria && maria == zezinho) {
            System.out.println("Todos tem a mesma idade.");
        }
        if (joao != maria && joao != zezinho && maria != zezinho) {
            if (joao > maria && joao > zezinho) {
                System.out.println("JOAO é o mais velho e todas as idades sao diferentes");
            } else if (maria > joao && maria > zezinho) {
                System.out.println("Maria é a mais velha e todas idades sao diferentes");
            } else {
                System.out.println("Zezinho é o mais velho e todas as idades sao diferentes");
            }
        }
            if (joao == maria && zezinho > maria && joao < zezinho) {
                System.out.println("joao e maria tem as mesma idade, zezinho e o mais velho");
            }
            if (joao == maria && maria > zezinho && joao > zezinho) {
                System.out.println("joao e maria tem as mesma idade, zezinho e o mais novo");
            }
            if (joao == zezinho && maria > zezinho && joao < maria) {
                System.out.println("joao e zezinho tem as mesma idade, Maria e a mais velha");

            }if (joao == zezinho && maria < zezinho && maria < joao) {
                System.out.println("joao e zezinho tem as mesma idade, Maria e a mais nova");
            }if (joao < zezinho && maria == zezinho && joao < maria) {
                System.out.println("Maria e zezinho tem as mesma idade, Joao e o mais novo");
            }if (joao > zezinho && maria == zezinho && joao > maria) {
                System.out.println("Maria e zezinho tem as mesma idade, Joao e o mais velho");
            }
            }
        }