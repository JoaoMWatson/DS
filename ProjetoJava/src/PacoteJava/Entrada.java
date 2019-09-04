package PacoteJava;

import javax.swing.*;

public class Entrada {
    
    // Escolhe a Operação
    public static int Entrada() {
        String aux = "";
        int escolha = 0;
        try{
        aux = JOptionPane.showInputDialog(null, "1 - Soma; "
                + "\n2 - Subtração;"
                + "\n3 - Multiplicação;"
                + "\n4 - Divisão;");
        escolha = Integer.parseInt(aux);
        }
        catch(NullPointerException error3){
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar meu programa!");
        }
        return escolha;
    }
    
    public static void Resposta() {
        double entrada1 = 0, entrada2 = 0;
        String aux = "", operacao = "", operador = "";
        int escolha = 0;
        double saida = 0;
        
        // Recebe os valores do usuario
         try {
            aux = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
            aux = aux.replace(",", ".");
            entrada1 = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");
            aux = aux.replace(",", ".");
            entrada2 = Double.parseDouble(aux);
         }
         catch (NumberFormatException erro1) {
            JOptionPane.showMessageDialog(null, "Você digitou um valor invalido!");
            System.exit(0);
        }
        catch(NullPointerException error3){
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar meu programa!");
        }
        
        // Calcula os valores
        escolha = Entrada.Entrada();
         
        try {
            switch (escolha) {
                case 1:
                    saida = Operacoes.somar(entrada1, entrada2);
                    operacao = "Soma";
                    operador = "+";
                    break;
                case 2:
                    saida = Operacoes.subtrair(entrada1, entrada2);
                    operacao = "Subtração";
                    operador = "-";
                    break;
                case 3:
                    saida = Operacoes.multiplicar(entrada1, entrada2);
                    operacao = "Multiplicação";
                    operador = "x";
                    break;
                case 4:
                    if(entrada2 == 0){
                        JOptionPane.showMessageDialog(null, "Impossivel dividir por 0");
                        Entrada.Entrada();
                    }
                    saida = Operacoes.dividir(entrada1, entrada2); 
                    operacao = "Divisão";
                    operador = "/";
                default:
                    JOptionPane.showMessageDialog(null, "Valor invalido");
                    Entrada.Entrada();
            }
        } 
        catch (ArithmeticException error2) {
            JOptionPane.showMessageDialog(null, "Impossivel dividir por zero!");
        }
        
        // Mostra o resultado
        JOptionPane.showMessageDialog(null, "Valores digitados:"
                +entrada1+" e "+entrada2+"\n"
                + "Operador selecionado:\n"+operacao+"\n"
                + "A "+operacao+" de "+entrada1+operador+entrada2+" = "+saida);
    }
    
    public static void main(String[] args){
        Responder.Resposta();
    }
   
}
