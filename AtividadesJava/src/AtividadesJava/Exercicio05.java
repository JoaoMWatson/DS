package AtividadesJava;
import javax.swing.*;

/*
*Considere o seguinte codigo(codigo)
*Depois da execução do codigo, qual sera o valor da variavel i, j, k?
*/
public class Exercicio05 {
    public static void main(String[] args){
        int i = 5, j, k;
        j = --i;
        k = i ++;
        i+=10;
        
        JOptionPane.showMessageDialog(null, "Os valores:\n"
                + "i = "+i+"\nj = "+j+"\nk = "+k);
    }
}
