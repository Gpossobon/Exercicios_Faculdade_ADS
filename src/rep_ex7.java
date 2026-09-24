import java.util.Scanner;

public class rep_ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double info, altura, sexo;
        double maiorAltura = 0, menorAltura = 0, mediaAltura = 0, mediaMulheres = 0;
        double armazenamento = 0;
        double armazenamentoMulheres = 0;
        int m = 0, f = 0;
        info = 0;
        while (info < 3) {
            System.out.println("\nDigite uma altura:");
            altura = ler.nextDouble();
            System.out.println("\nSexo: Digite 1 para M ou 2 para F:");
            sexo = ler.nextDouble();
            System.out.println("Registrado!");
            armazenamento = armazenamento + altura;
            if (info == 0) {
                maiorAltura = altura;
                menorAltura = altura;
            } else {
                if (altura < menorAltura) {
                    menorAltura = altura;
                } else if (altura > maiorAltura) {
                    maiorAltura = altura;
                }
            }
            if (sexo == 1) {
                m++;
            }
            if (sexo == 2) {
                f++;
                armazenamentoMulheres = armazenamentoMulheres + altura;
            }
            info++;
            mediaAltura = armazenamento / info;
            mediaMulheres = armazenamentoMulheres / f;
        }

        System.out.println("A maior altura é: " + maiorAltura);
        System.out.println("A menor altura é: " + menorAltura);
        System.out.println("A média de altura das mulheres é:" + mediaMulheres);
        System.out.println("A média de altura da turma é:" + mediaAltura);

    }
}