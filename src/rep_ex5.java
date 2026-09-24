import java.util.Scanner;

public class rep_ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, nulo = 0, branco = 0, quantVotos = 0;
        double votos;
        int contador = 1;
        int acumulador1 = 0;
        int acumulador2 = 0;
        int acumulador3 = 0;
        int acumulador4 = 0;
        int acumulador5 = 0;
        int acumulador6 = 0;

        System.out.println("Informe a quantidade de votos que irei receber.");
        quantVotos = ler.nextInt();
        while (contador <= quantVotos) {
            System.out.println("Informe 1 para votar na Thaina");
            System.out.println("Informe 2 para votar na Eliane");
            System.out.println("Informe 3 para votar na Laura");
            System.out.println("Informe 4 para votar na Luana");
            System.out.println("Informe 5 para votar em branco");
            System.out.println("Informe qualquer outro numero para votar nulo");
            votos = ler.nextDouble();
            if (votos == 1) {
                acumulador1++;
                candidato1 = acumulador1;
                System.out.println("\nVocê votou na General Thaina da boina da morte");
            }
            if (votos == 2) {
                acumulador2++;
                candidato2 = acumulador2;
                System.out.println("\nVocê votou Na Eliane, a Artesã do além");
            }
            if (votos == 3) {
                acumulador3++;
                candidato3 = acumulador3;
                System.out.println("\nvocê votou Na Princesa sapo, Laurinha do pantanal");
            }
            if (votos == 4) {
                acumulador4++;
                candidato4 = acumulador4;
                System.out.println("\nVocê votou na Luana, sacerdotisa do templo Cupiando");
            }
            if (votos == 5) {
                acumulador5++;
                branco = acumulador5;
                System.out.println("\nVocê votou em branco, seu burro");
            }if ( votos > 6 || votos < 0) {
                    acumulador6++;
                    nulo = acumulador6;
                    System.out.println("\nVocê votou nulo, vai estudar");
                }

                System.out.println("\nVoto Computado! Próximo eleitor\n");
                contador++;
            }
            System.out.println("\nQuantidade total de eleitores atingida! A quantidade de votos por candidato é:\n");
            System.out.println("Candidato Thaina recebeu: " + candidato1 + " Votos");
            System.out.println("Candidato Eliane recebeu: " + candidato2 + " Votos");
            System.out.println("candidato Laura recebeu: " + candidato3 + " Votos");
            System.out.println("candidato  Luana recebeu: " + candidato4 + " Votos");
            System.out.println("Quntidade de votos em branco:" + branco + " Votos");
            System.out.println("Quantidade de votos Nulos:" + nulo + " Votos");
        }
    }