/**
 *Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
 * @Aluno: Wilian Correa - FATEC ZL
 */
import javax.swing.JOptionPane;


public class Exerc_LP_01 {
    public static void main (String args []){
        int lado, area;
        
        lado=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de um dos lados do Quadrado: "));
        area= lado * lado;
        JOptionPane.showMessageDialog(null, "A área do quadrado é: "+ area);
        //System.out.println("A área do quadrado é: "+ area);
    }
}
