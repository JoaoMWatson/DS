package PacoteJava;

import javax.swing.*;

public class Entrada {

    // Escolhe a Operação
    public static int Entrada() {
        String aux = "";
        int escolha = 0;
        try {
            aux = JOptionPane.showInputDialog(null, "1 - Soma; "
                    + "\n2 - Subtração;"
                    + "\n3 - Multiplicação;"
                    + "\n4 - Divisão;");
            escolha = Integer.parseInt(aux);
        } catch (NullPointerException error3) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar meu programa!");
        }
        return escolha;
    }

    public static void Resposta() {
        double numero1 = 0, numero2 = 0, saida = 0;
        String aux = "";
        int escolha = 0;

        // Recebe os valores do usuario
        try {
            aux = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
            aux = aux.replace(",", ".");
            numero1 = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");
            aux = aux.replace(",", ".");
            numero2 = Double.parseDouble(aux);
        } catch (NumberFormatException erro1) {
            JOptionPane.showMessageDialog(null, "Você digitou um valor invalido!");
            System.exit(0);
        } catch (NullPointerException error3) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar meu programa!");
        }

        // Calcula e mostra
        escolha = Entrada.Entrada();

        try {
            switch (escolha) {
                case 1:
                    saida = Operacoes.somar(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "Valores digitados:"
                            + numero1 + " e " + numero2 + "\n"
                            + "Operador selecionado:\nSoma" + "\n"
                            + "A soma de" + numero1 + "+" + numero2 + " = " + saida);
                    break;

                case 2:
                    saida = Operacoes.subtrair(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "Valores digitados:"
                            + numero1 + " e " + numero2 + "\n"
                            + "Operador selecionado:\nSubtração" + "\n"
                            + "A subtração de" + numero1 + "-" + numero2 + " = " + saida);

                    break;

                case 3:
                    saida = Operacoes.multiplicar(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "Valores digitados:"
                            + numero1 + " e " + numero2 + "\n"
                            + "Operador selecionado:\nMultiplicação" + "\n"
                            + "A Multilicação de" + numero1 + "x" + numero2 + " = " + saida);
                    break;

                case 4:
                    if (numero2 == 0) {
                        JOptionPane.showMessageDialog(null, "Impossivel dividir por 0");
                        Entrada.Entrada();
                    }
                    if (numero1 == 0 && numero2 == 0) {
                        JOptionPane.showMessageDialog(null, "Impossivel dividir 0 por 0");
                    } else {
                        saida = Operacoes.dividir(numero1, numero2);
                        JOptionPane.showMessageDialog(null, "Valores digitados:"
                                + numero1 + " e " + numero2 + "\n"
                                + "Operador selecionado:\nDivisão" + "\n"
                                + "A divisão de" + numero1 + "/" + numero2 + " = " + saida);
                        break;
                    }

                default:
                    JOptionPane.showMessageDialog(null, "Operação Invalida");
                    Entrada.Entrada();
            }
        } catch (ArithmeticException error2) {
            JOptionPane.showMessageDialog(null, "Impossivel dividir por zero!");
        }
    }

    public static void main(String[] args) {
        Responder.Resposta();
    }

}
