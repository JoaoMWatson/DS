package PacoteJava;

import javax.swing.*;

public class Exercicio0706 {
    public static void main(String[] args) {    
        String aux = "";
        double salario = 0, aliquota = 0, desconto = 0, liquido = 0;
        
       try{
        aux = JOptionPane.showInputDialog(null, "De o seu salario: ");
        aux = aux.replace(",", ".");
        salario = Double.parseDouble(aux);
        
        
       }catch(NullPointerException error1){
           JOptionPane.showMessageDialog(null, "Valor inserido invalido");
           
       }catch(NumberFormatException error2){
           JOptionPane.showMessageDialog(null, "Valor inserido invalido!");
       }
       
        if (salario <= 465.00) {
            JOptionPane.showMessageDialog(null, "O seu salario não recebera deconto");
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