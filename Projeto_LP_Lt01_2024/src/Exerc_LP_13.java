/*
 * Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
durará esse alimento sabendo que a pessoa consome 50g ao dia.
 */
import javax.swing.*;

public class Exerc_LP_13 {
	public static void main(String[] args) {
		Double kgAlimen, totalDias;
		
		kgAlimen=Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de alimentos em kilo: "));
		
		totalDias= kgAlimen/0.50;
		
		JOptionPane.showMessageDialog(null, "Seu alimento irá durar por "+totalDias+" dias.");
	}
}
