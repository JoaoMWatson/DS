package PacoteJava;

import javax.swing.*;

public class Exercicio0706 {
    public static void main(String[] args) {    
        String aux = "";
        double salario = 0, aliquota = 0, desconto = 0, liquido = 0;
       
        aux = JOptionPane.showInputDialog(null, "De o seu salario: ");
        salario = Float.parseFloat(aux);

        if (salario <= 465.00) {
            JOptionPane.showMessageDialog(null, "Salario invalido");
            System.exit(0);
        } else {
            if (salario <= 965.67) {
                aliquota = 8; 
                desconto = salario * aliquota / 100;
            } if (salario >= 965.68) {
                aliquota = 9;
                desconto = salario * aliquota / 100;
            } if (salario >= 1609.46) {
                aliquota = 11;
                desconto = salario *aliquota / 100;
            }
        }
        if (aliquota > 354.67) {
            aliquota = 354.67;

        } else {
            liquido = salario-desconto;
        }
        JOptionPane.showMessageDialog(null,"O seu alario inicial é de: "+ salario + ". A aliquota aplicada ao mesmo foi de: "
        +aliquota+"\nAo total foram descontados R$"+desconto+"\nValor liquido total R$"+liquido);
    }
}