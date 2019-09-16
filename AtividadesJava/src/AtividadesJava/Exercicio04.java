package AtividadesJava;

import javax.swing.*;

/*
 *Sistema que leia uma sequencia de numeros inseridos pelo usuario e realize a soma
 *Encerre a execução quando um numero negativo for inserido
 */
public class Exercicio04 {

    public static void somar(double n1, double n2) {
        double resultado = n1 + n2;

        JOptionPane.showMessageDialog(null, "Resultado:\n"
                + n1 + " + " + n2 + "=" + resultado);
    }

    public static void main(String[] args) {
        double n1 = 0, n2 = 0;
        String aux;

        while (true) {
            try {
                aux = JOptionPane.showInputDialog(null, "Digite o primeiro numero: "
                        + "\nPara sair, digite um numero negativo");
                aux = aux.replace(",", ".");
                n1 = Integer.parseInt(aux);
                if (n1 < 0) {
                    break;
                }

                aux = JOptionPane.showInputDialog(null, "Digite o segundo numero: "
                        + "\nPara sair, digite um numero negativo");
                aux = aux.replace(",", ".");
                n2 = Integer.parseInt(aux);
                if (n2 < 0) {
                    break;
                }

                somar(n1, n2);

            } catch (NullPointerException error1) {
                JOptionPane.showMessageDialog(null, "Para sair, digite um numero negativo, por favor");
            }
        }
        JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso programa!!");
    }
}
