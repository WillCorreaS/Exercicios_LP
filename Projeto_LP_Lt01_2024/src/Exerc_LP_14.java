/*
 * Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo (a1+a2-180)
 */

import javax.swing.JOptionPane;

public class Exerc_LP_14 {
	public static void main(String[] args) {
		int ang1, ang2, ang3;
		
		ang1=Integer.parseInt(JOptionPane.showInputDialog("Informe valor do 1° ângulo: "));
		ang2=Integer.parseInt(JOptionPane.showInputDialog("Informe valor do 2° ângulo: "));
		
		ang3=180 - (ang1+ang2);
		
		JOptionPane.showMessageDialog(null, "O valor do 3° ângulo é: "+ang3);
	}
}
