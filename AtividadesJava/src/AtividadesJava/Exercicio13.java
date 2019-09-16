package AtividadesJava;
import javax.swing.*;

public class Exercicio13 {
    public static void main(String[] args){
        int idade = 0, count = 0;
        String aux;
        
        try{
            for(int i = 0;i == 20;i++){
            aux = JOptionPane.showInputDialog(null, "Bem vindo!!\n"
                    + "Por favor, digite sua idade: ");
            idade = Integer.parseInt(aux);
            
            if(idade >= 18){
                count += 1;
                }
            }
            JOptionPane.showMessageDialog(null, "Resultado:\n"
                    + "De 20 pessoas "+count+" são maiores de idade");
        }catch(NullPointerException error){
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso programa!!");
        }catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null, "Valor invalido inserido");
        }
    }
}
