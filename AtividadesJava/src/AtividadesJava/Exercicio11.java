package AtividadesJava;
import javax.swing.*;

/*
Desenvolva um algoritmo usuario cadastra senha, digitar 2 variaveis reais
calcula divisão entre as duas e pede a senha dnv se tiver correta mostra o resultado
se não encerra o programa
*/

public class Exercicio11 {
    
    public static void main(String[] args){
        int num1 = 0, num2 = 0, resultado = 0;
        String confirmacao, aux, senha = null;
        boolean valida;
        
        try{
            senha = JOptionPane.showInputDialog(null, "Bem vindo!!\n"
                    + "Favor, digitar uma senha para cadastro: ");
            
        }catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null, "Nenhum valor inserido");
            System.exit(0);
        }  
        
        try{
            aux = JOptionPane.showInputDialog(null, "Por favor, digite o primeiro numero");
            aux = aux.replace(",", ".");
            num1 = Integer.parseInt(aux);
            
            aux = JOptionPane.showInputDialog(null, "Por favor, digite o segundo numero");
            aux = aux.replace(",", ".");
            num2 = Integer.parseInt(aux);
            
            
            confirmacao = JOptionPane.showInputDialog(null, "Favor, digitar novamente a senha "
                    + "para confirmação");
            
            resultado = num1/num2;
            
            if(confirmacao == null ? senha == null : confirmacao.equals(senha)){
                if(num2 == 0){
                    JOptionPane.showMessageDialog(null, "Impossivel dividir por 0");
                    System.exit(0);
                }else{
                    JOptionPane.showMessageDialog(null, "O resultado da divisão é:\n"
                            +num1+" / "+num2+" = "+resultado);
                } 
            }else{
                JOptionPane.showMessageDialog(null, "Desculpe\n"
                        + "Senhas diferentes inseridas");
            }
            
            
        }catch(ArithmeticException error){
            JOptionPane.showMessageDialog(null, "Valor invalido inserido");
            
        }catch(NullPointerException error){
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nossos sistemas!");
            
        }catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null, "Valor invalido inserido");
            
        }
    }
}

