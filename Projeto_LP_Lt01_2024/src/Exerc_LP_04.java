/**
 * @Aluno: Wilian Correa - FATEC ZL
 * Receba a temperatura em graus Celsius. Calcule e mostre a sua
 * temperatura convertida em fahrenheit F = (9*C+160) /5.
 */
import javax.swing.JOptionPane;
public class Exerc_LP_04 {
    public static void main (String args []){
        Double grauC, grauF;
        
        grauC=Double.parseDouble(JOptionPane.showInputDialog("Digite a teperatura em C°: "));
        
        grauF=((9*grauC)+160) / 5;
        
        JOptionPane.showMessageDialog(null, "A temperatura convrtida em graus Fahrenheit é: "+grauF+"F°");
    }
}
