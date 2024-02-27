/**
 *Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
 * @Aluno: Wilian Correa - FATEC ZL
 */
import javax.swing.JOptionPane;

public class Exemplo_02 {
        public static void main (String args []){
        int num1, num2;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite primeira idade: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda idade: "));
        
        JOptionPane.showMessageDialog(null, "Maria tem "+num1 +" anos e João tem "+num2+" anos.");
    }
    
}
