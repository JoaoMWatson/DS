package PacoteJava;
import javax.swing.*;

public class Feira {
    public static void main(String[] args){
        String fruta;
        Integer escolha;
        String aux = JOptionPane.showInputDialog(null, "Escolha: "
                + "\n 1 - Abacaxi\n "
                + "2 - Abacate\n "
                + "3 - Abobora\n "
                + "4 - Chocolate\n "
                + "5 - Coco\n "
                + "6 - Laranja\n "
                + "7 - Morango\n "
                + "8 - Tangerina");
            escolha = Integer.parseInt(aux);
            
            switch(escolha) {
                case 1: fruta = "Abacaxi";break;
                case 2: fruta = "Abacate";break;
                case 3: fruta = "Abobora";break;
                case 4: fruta = "Chocolate";break;
                case 5: fruta = "Coco";break;
                case 6: fruta = "Laranja";break;
                case 7: fruta = "Morango";break;
                case 8: fruta = "Tangerina";break;
                default: fruta = "Inexistente!";break;
            }
        JOptionPane.showMessageDialog(null, "A fruta que vc escolheu é a "+fruta);
    }
}
