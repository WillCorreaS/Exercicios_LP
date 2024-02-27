/*
 * Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre
a hipotenusa.
 */

import javax.swing.JOptionPane;

public class Exerc_LP_15 {
	public static void main(String[] args) {
		Double cat1, cat2, hip;
		
		cat1=Double.parseDouble(JOptionPane.showInputDialog("Informe valor do 1° cateto: "));
		cat2=Double.parseDouble(JOptionPane.showInputDialog("Informe valor do 2° cateto: "));
		
		hip=(Math.pow(cat1, 2)) + (Math.pow(cat2, 2));
		hip=Math.sqrt(hip);
		
		JOptionPane.showInputDialog("O valor da hipotenusa é: "+hip);
	}
}
