import java.util.Scanner;

public class vetores_ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] nota1 = new double[5];
        double[] nota2 = new double[5];
        double[] nota3 = new double[5];
        LerNotas (ler, nota1, nota2, nota3);
        double[] medias = calcularMedia(nota1, nota2, nota3);
        mediaTotal(medias);
        ler.close();
    }

    public static void LerNotas (Scanner ler,double[] nota1,double[] nota2,double[] nota3) {
        int i = 0;
        while (i < 5) {
            System.out.println("Aluno nº" + (i + 1) + "\n");
            System.out.println("Informe a 1ª nota do aluno:\n");
            nota1[i] = ler.nextDouble();
            System.out.println("Informe a  2ª nota do aluno:\n");
            nota2[i] = ler.nextDouble();
            System.out.println("Informe a 3ª nota do aluno:\n");
            nota3[i] = ler.nextDouble();
            i++;
        }
    }public static double[] calcularMedia (double[] nota1, double[] nota2, double[] nota3){
        int i = 0;
        double[] medias =  new double[5];
        while (i < 5){
            double media = (nota1[i] + nota2[i] + nota3[i]) / 3;
            medias[i] = media;
            medias[i] = Math.round(media * 100.0) / 100.0;
        System.out.println("A média do aluno " +(i+1)+ " é:\n" + medias[i]);
        i++;}
        return medias;
    }
    public static void mediaTotal (double[] medias){
        double soma = 0;
        int i = 0;
        while (i < medias.length){
            soma += medias[i];
            i++;
        }
         double somaTotal = soma / medias.length;
        somaTotal = Math.round(somaTotal * 100.0) / 100.0;
        System.out.println("A média geral da tuma é:\n" + somaTotal);
    }
}
