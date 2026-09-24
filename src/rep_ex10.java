import java.util.Scanner;

public class rep_ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, socios = 0, rendaMensal;
        int m = 0, f = 0;
        double mensalidade1, mensalidade2, mensalidade3;
        double cont1 = 0, cont2 = 0, cont3 = 0;
        while (socios < 3) {
            System.out.println("Informe a idade do sócio");
            idade = ler.nextInt();
            System.out.println("Informe m para masculino e f para feminino");
            String sexo = ler.next();
            if (sexo.equalsIgnoreCase("m")) {
                m++;
            }else if (sexo.equalsIgnoreCase("f")) {
                f++;
                socios++;
            }else {
                System.out.println("Sexo inválido! Os dados deste sócio " +
                        "não foram computados. Digite novamente.");
                continue;
            }System.out.println("Informe a renda mensal do sócio:");
            rendaMensal = ler.nextInt();
            if (rendaMensal > 1000 && idade > 18 && idade < 65 && sexo.equalsIgnoreCase("m")) {
                mensalidade1 = cont1++;


            }

            }
        }
    }
