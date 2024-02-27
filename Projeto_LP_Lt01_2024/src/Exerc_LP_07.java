/*
 * Receba os valores do comprimento, largura e altura de um paralelepípedo.
Calcule e mostre seu volume.   (Volume = Área da base x Altura)
                               (Área da base = Comprimento x Largura)
 */

import javax.swing.JOptionPane;

public class Exerc_LP_07 {
	public static void main (String args []) {
		int comp, larg, alt;
		double volume, base;
		
		comp=Integer.parseInt(JOptionPane.showInputDialog("Digite a comprimento: "));
		larg=Integer.parseInt(JOptionPane.showInputDialog("Digite o altura: "));
		alt =Integer.parseInt(JOptionPane.showInputDialog("Digite a largura: "));
		
		base = comp * larg;
		volume= base * alt;
		
		JOptionPane.showMessageDialog(null, "O volume do paralelepípedo é: "+volume);
	}

}
