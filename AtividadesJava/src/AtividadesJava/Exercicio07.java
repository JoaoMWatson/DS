package AtividadesJava;
import javax.swing.*;

/*
Em epocas de pouco dinheiro, os comerciantes estão procurando aumentar suas vendas
oferecendo descontos. Desenvolva um sistema em java ao qual o usuario possa entrar
com o valor de um produto e imprima o novo valor tendo em vista que o desconto foi de 9%
*/

public class Exercicio07 {
    public static void main(String[] args){
        double valorProduto = 0, desconto = 0, valorFinal = 0;
        String aux;
        
        
        aux = JOptionPane.showInputDialog(null, "Bem Vindo!\n"
                + "Favor entrar com o valor do produto: ");
        aux = aux.replace(",", ".");
        valorProduto = Double.parseDouble(aux);
        
        desconto = (valorProduto*9)/100;
        valorFinal = valorProduto - desconto;
        
        JOptionPane.showMessageDialog(null, "O desconto que o senhor(a) ganhou foi de: "
                + "\nR$"+desconto
                + "\nO produto foi de R$:"+valorProduto+"Para R$:"+valorFinal);
        JOptionPane.showMessageDialog(null, "Obrigado por usar nossos serviços");
    }
}
