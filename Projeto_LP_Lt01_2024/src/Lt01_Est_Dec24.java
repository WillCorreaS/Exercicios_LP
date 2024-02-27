import javax.swing.*;
/*
Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 */
public class Lt01_Est_Dec24 {
    public static void main (String args []){
        int n1, n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo valor: "));
        
        System.err.println(n1%2+"\n"+n1%3+"\n"+n2%2+"\n"+n2%3);
        
    }
}
