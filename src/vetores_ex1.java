import java.util.Scanner;

public class vetores_ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] nota = new double[15];
        notas (ler, nota);
        media(nota);
        ler.close();
    }

    public static void notas (Scanner ler,double[] notas){
        int i = 0;
        while (i < 15){
            System.out.println("Informe a " + (i +1 ) +"ª nota do aluno:\n");
            notas[i] = ler.nextInt();
            i++;
        }
    }
    public static void media (double[] nota){
        double soma = 0;
        int i = 0;
        while (i < 15){
            soma = soma + nota[i];
            i++;
        }
        double media = soma / 15;
        System.out.println("A média é: " + media);
    }


}
