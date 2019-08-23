package PacoteJava;

import javax.swing.*;

public class Exercicio0707 {
    public static void main(String[] args){
        double peso = 0, altura = 0, imc = 0;
        String aux = "";
        try{
        aux = JOptionPane.showInputDialog(null, "De o seu peso: ");
        peso = Float.parseFloat(aux);
        
        aux = JOptionPane.showInputDialog(null, "De o seu altura: ");
        altura = Float.parseFloat(aux);
        }catch(NumberFormatException error1){
            JOptionPane.showMessageDialog(null, 
                    "Você digitou um valor invalido");
        }
        if(altura > 0.1 && peso > 0.5){
            try{
                imc = peso / (altura * altura);
                
                if(imc < 18.5){
                    JOptionPane.showMessageDialog(null, "Excesso de Magreza");
                }
                else if(imc >= 18.6){
                    JOptionPane.showMessageDialog(null, "Peso normal");
                }
                else if(imc >= 25.1){
                    JOptionPane.showMessageDialog(null, "Excesso de Peso");
                }
                else if(imc >= 30.1){
                    JOptionPane.showMessageDialog(null, "Obesidade (Grau I)");
                }
                else if(imc >= 35){
                    JOptionPane.showMessageDialog(null, "Obesidade (Grau II)");
                }
                else if(imc >= 41){
                    JOptionPane.showMessageDialog(null, "Obesidade (Grau III)");
                }
                
            }catch(NullPointerException error2){
                JOptionPane.showMessageDialog(null, "Resultado invalido");
           }
        }
    }
        
}
