import javax.swing.JOptionPane;

import static java.lang.Double.*;

public class Aula_Engenharia {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("***Olá " + nome + ".***\n " +
                    "Escolha Sua Opção\n" +
                    "1 - Dobrar Salário:\n" +
                    "2 - Calcular 1/3 das Férias:\n" +
                    "3 - Calculo Adiantamento:\n" +
                    "4 - Calcular Hora Extra:\n" +
                    "0 - Sair!\n"));
            switch (opcao) {
                case 1:
                    dobrarSalario();
                    break;
                case 2:
                    calcularFerias();
                    break;
                case 3:
                    calcularAdiantamento();
                    break;
                case 4:
                    calcularHoraExtra();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Até logo\n" + nome);
                    break;
            }
        }
        while (opcao != 0);
    }
        static void dobrarSalario () {
            double valorSalario;
            double res;
            valorSalario = parseDouble(JOptionPane.showInputDialog("Informe o seu salário:"));
            res = valorSalario * 2;
            String resultadoFormatado = String.format("%.2f", res);
            JOptionPane.showMessageDialog(null, "O Dobro do Salário é:\n "
                    + resultadoFormatado);
        }

        static void calcularFerias () {
            double ferias;
            double salario = 0;
            salario = parseDouble(JOptionPane.showInputDialog("Informe o seu salário:"));
            ferias = salario / 3;
            String resultadoFormatado = String.format("%.2f", ferias);

            JOptionPane.showMessageDialog(null, "O seu valor a mais de férias"
                    + " é:\n" + resultadoFormatado);
        }

        static void calcularAdiantamento () {
            double adiantamento;
            double salario;
            double resultado;
            salario = parseDouble(JOptionPane.showInputDialog("Informe o seu salário:"));
            adiantamento = parseDouble(JOptionPane.showInputDialog("Informe o seu adiantamento:"));
            resultado = salario - adiantamento;
            String resultadoFormatado = String.format("%.2f", resultado);
            JOptionPane.showMessageDialog(null, "O seu salário, menos o" +
                    " adiantamento é\n:"
                    + resultadoFormatado);

        }
        static void calcularHoraExtra () {
            double salario;
            double valorHora;
            double horaExtra;
            double resultado;
            salario = parseDouble(JOptionPane.showInputDialog("Informe o seu salário:"));
            valorHora = (salario / 220) * 1.5;
            horaExtra = parseDouble(JOptionPane.showInputDialog("Informe A quantidade de" +
                    " horas extra:"));
            resultado = valorHora * horaExtra;
            String resultadoFormatado = String.format("%.2f", resultado);
            JOptionPane.showMessageDialog(null, "As suas horas extras, " +
                    "deram o valor de:\n "
                    + resultadoFormatado);

        }
    }

