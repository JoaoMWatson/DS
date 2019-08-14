package DS;

import javax.swing.*;

public class Exercicio0706 {
    public static void calcular(String[] args) {    
        String aux = "";
        float salario = 0, aliquota = 0, desconto = 0, liquido = 0;
       
        aux = JOptionPane.showInputDialog(null, "De o seu salario: ");
        salario = Float.parseFloat(aux);

        if (salario <= 465.00) {
            JOptionPane.showMessageDialog(null, "Salario invalido");
            System.exit(0);
        } else {
            if (salario <= 965.67) {
                aliquota = 8; 
                desconto = aliquota / 100 - salario;
            } else if (salario >= 965.68) {
                aliquota = salario * 9 / 100;
            } else if (salario >= 1609.46) {
                aliquota = salario * 11 / 100;
            }
        }
        if (aliquota > 354.67) {
            aliquota = 354.67f;

        } else {
            liquido = desconto - salario;
        }
        JOptionPane.showMessageDialog(null,"O seu alario inicial é de: "+ salario + "A aliquota aplicada ao mesmo foi de: "
        +aliquota+"\nAo total foram descontados: R$"+desconto+"\nValor liquido total: R$"+liquido);
    }
}