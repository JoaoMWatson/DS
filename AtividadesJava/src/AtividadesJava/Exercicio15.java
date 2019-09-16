package AtividadesJava;
import javax.swing.*;

public class Exercicio15 {
    public static void main(String[] args){
        int escolha = 0, calorias = 0;
        String aux;
        
        try{
            aux = JOptionPane.showInputDialog(null, "Bem vindo!!\n"
                    + "Qual será o seu prato principal:\n"
                    + "[1] Vegetariano\n"
                    + "[2] Peixe\n"
                    + "[3] Frango\n"
                    + "[4] Carne\n");
            escolha = Integer.parseInt(aux);
            
            switch(escolha){
                case 1:calorias += 180;
                    break;
                case 2:calorias += 230;
                    break;
                case 3:calorias += 250;
                    break;
                case 4:calorias += 350;
                    break;
                default: JOptionPane.showMessageDialog(null, "Opção inexistente");
            }
            
            aux = JOptionPane.showInputDialog(null, "Escolha a sobremesa:\n"
                    + "[1] Abacaxi\n"
                    + "[2] Sorvete diet\n"
                    + "[3] Mouse diet\n"
                    + "[4] Mouse chocolate\n");
            escolha = Integer.parseInt(aux);
            
            switch(escolha){
                case 1:calorias += 75;
                    break;
                case 2:calorias += 110;
                    break;
                case 3:calorias += 170;
                    break;
                case 4:calorias += 200;
                    break;
                default: JOptionPane.showMessageDialog(null, "Opção inexistente");
            }
            
            aux = JOptionPane.showInputDialog(null, "Escolha a bebida:\n"
                    + "[1] Chá\n"
                    + "[2] Suco de laranja\n"
                    + "[3] Suco de melão\n"
                    + "[4] Refri diet\n");
            escolha = Integer.parseInt(aux);
            
            switch(escolha){
                case 1:calorias += 20;
                    break;
                case 2:calorias += 70;
                    break;
                case 3:calorias += 100;
                    break;
                case 4:calorias += 65;
                    break;
                default: JOptionPane.showMessageDialog(null, "Opção inexistente");
            }
            
            JOptionPane.showMessageDialog(null, "A sua refeição teve o total de\n"
                    +calorias+" calorias");
            
        }catch(NullPointerException error){
            JOptionPane.showMessageDialog(null, "Obrigdo por utilizar nosso programa");
        }catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null, "Opção invalida");
        }
    }
}
