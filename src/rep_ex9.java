import java.util.Scanner;

public class rep_ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("\nQuantos anos Maria demorará para alcançar luiz?\n");
        double alturaLuiz = 150, crescLuiz = 2;
        double alturaMaria = 110, crescMaria = 3;
        int contador = 0, anos = 0;
        while (alturaLuiz > alturaMaria) {
            alturaLuiz = alturaLuiz + crescLuiz;
            alturaMaria = alturaMaria + crescMaria;
                contador = contador + 1;
                if (alturaLuiz == alturaMaria) {
                    anos = anos + contador;
                    System.out.println("Maria demorará " + anos + " anos para alcançar luiz!");
                }
            }
        }
    }
