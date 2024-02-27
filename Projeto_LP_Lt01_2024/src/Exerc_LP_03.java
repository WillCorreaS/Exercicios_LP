/**
 * @Aluno: Wilian Correa - FATEC ZL
 * Receba a base e a altura de um triângulo. Calcule e mostre a sua área. (area= base*alt/2)
 */
import javax.swing.JOptionPane;

public class Exerc_LP_03 {
    public static void main (String args []){
        int base, alt, area;
        
        base=Integer.parseInt(JOptionPane.showInputDialog("Diagite o valor da base do triângulo: "));
        alt=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do triângulo: "));
        
        area= (base * alt)/2;
        
        JOptionPane.showMessageDialog(null, "A área do triângulo é: "+ area);
    }
}
