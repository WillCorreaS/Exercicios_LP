/*
 * Receba o raio de uma circunferência. Calcule e mostre o comprimento da
circunferência.C = 2 * π * r

 */

import javax.swing.JOptionPane;

public class Exerc_LP_11 {
	public static void main(String[] args) {
		Double comp, raio;
		
		raio=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do raio da circunferência: "));
		comp=2*Math.PI*raio;
		
		JOptionPane.showMessageDialog(null, "Digite o valor do raio da circunferência: "+comp);
	}

}
