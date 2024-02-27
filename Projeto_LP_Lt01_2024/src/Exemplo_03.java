/**
 *Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
 * @Aluno: Wilian Correa - FATEC ZL
 * // Calcular a soma entre dois valores
 */

import javax.swing.JOptionPane;
public class Exemplo_03 {
    public static void main (String arg []){
        int num1, num2, soma;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
        
        soma = num1+num2;
        
        JOptionPane.showMessageDialog(null,"Esta é a soma dos dois números: "+ soma);
    }
}
