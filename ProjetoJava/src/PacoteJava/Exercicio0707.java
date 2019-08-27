package PacoteJava;

import javax.swing.*;

// if(variavel.equals(" ")) retorna boolean

public class Exercicio0707 {
    static double peso = 0, altura = 0, imc = 0;
    static String aux = "";
    
    public static void leitura(){
        
        aux = JOptionPane.showInputDialog(null, "De o seu peso: ");
        peso = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "De o seu altura: ");
        altura = Double.parseDouble(aux);   
        }
    
    public static void main(String[] args){
        try{
            leitura();
            }
            catch(NumberFormatException error1){
                JOptionPane.showMessageDialog(null, 
                        "Você digitou um valor invalido!"
                                + "\nFavor, inserir apenas numeros");
                leitura();
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
