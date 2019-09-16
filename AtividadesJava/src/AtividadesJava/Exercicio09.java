package AtividadesJava;
import javax.swing.*;

/*
Calcular e apresentar o volume de uma lata de óleo, utilizando a fórmula:
Volume = 3.15159*raio²*altura;
*/

public class Exercicio09 {
    public static void calcularPadrao(double altura, double raio){
        
    }
    
    public static void main(String[] args){
        double raio = 4.5, altura = 16, volume = 0;
        int escolha = 0;
        String aux;
        
        try{
            aux = JOptionPane.showInputDialog(null, "Bem vindo(a)!!"
                    + "\nPara inserir seus proprios valores digite qualquer numero"
                    + "\nCaso queira usar os valores padrões, apenas tecle 'Enter'.\n");
            escolha = Integer.parseInt(aux);
            
            switch(escolha){
                default: aux = JOptionPane.showInputDialog(null, "Digite o raio");
                    aux = aux.replace(",", ".");
                    raio = Double.parseDouble(aux);
                    
                    aux = JOptionPane.showInputDialog(null, "Digite a altura");
                    aux = aux.replace(",", ".");
                    altura = Double.parseDouble(aux);
                    
                    volume = 3.14159*(raio*raio)*altura;
                    
                    JOptionPane.showMessageDialog(null, "O volume de uma lata com medidas de "
                    + "\nRaio = "+raio+" e Altura = "+altura
                    + "\nÉ igual a Volume = "+volume);
            }
            
        }catch(NumberFormatException error){
            volume = 3.14159*(raio*raio)*altura;
            
            JOptionPane.showMessageDialog(null, "O volume de uma lata com medidas padrões de "
                    + "\nRaio = "+raio+" e Altura = "+altura
                    + "\nÉ igual a Volume = "+volume);
            
        }catch(NullPointerException error){
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nossos serviços!");
        }
    }
}
