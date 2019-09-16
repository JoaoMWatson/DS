package AtividadesJava;

import javax.swing.*;

/*
 A prefeitura de São Paulo abriu uma linha de credito para os funcionarios municipais.
 *O valor maximo da prestação não podera ultrapassar 30% do salario bruto. Criar
 *um aplicativo que permitira entrar com o salario bruto e o valor da prestação e 
 *informar se o empréstimo pode ou não ser concedido
 */
public class Exercicio02 {

    public static boolean aprovar(double salario, double prestacao) {
        double maxPorcent = 0;

        maxPorcent = (salario * 30) / 100;

        if (prestacao < maxPorcent) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        double salario = 0, prestacao = 0;
        String aux;
        boolean aprovador;

        try {
            aux = JOptionPane.showInputDialog(null, "Bem vindo!!\n"
                    + "Por favor, entre com o seu salario: ");
            aux = aux.replace(",", ".");
            salario = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Por favor, entre com o valor desejado para credito: ");
            aux = aux.replace(",", ".");
            prestacao = Double.parseDouble(aux);

            aprovador = aprovar(salario, prestacao);

            if (aprovador) {
                JOptionPane.showMessageDialog(null, "Parabens, credito aprovado!!\n"
                        + "Valor do credito: " + prestacao);
            } else {
                JOptionPane.showMessageDialog(null, "Desculpa, seu credito não foi aprovado.\n"
                        + "O valor desejado ultrapassa o limite de 30% do seu salario bruto.");
            }
        } catch (NumberFormatException erro1) {
            JOptionPane.showMessageDialog(null, "Valor invalido ou inexistente");
        } catch (NullPointerException error1) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso programa!!");
        }
    }
}
