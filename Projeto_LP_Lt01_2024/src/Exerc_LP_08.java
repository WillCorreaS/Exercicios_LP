/*
 * Receba o valor de um depósito em poupança. Calcule e mostre o valor
após 1 mês de aplicação sabendo que rende 1,3% a. m
 */

import javax.swing.JOptionPane;

public class Exerc_LP_08 {
	public static void main(String args []) {
		double dep, depAtual;
		
		dep=Double.parseDouble(JOptionPane.showInputDialog("Digite valor do deposito: "));
		
		depAtual= dep * 1.3;
		
		JOptionPane.showMessageDialog(null, "O valor do deposito após 1 mês é: "+depAtual);
		
		
		
	}
}
