import javax.swing.*;
/*
 * Receba 2 números reais. Calcule e mostre a diferença desses valores.
 */
public class Exerc_LP_10 {
	public static void main (String args []) {
		double n1, n2, dif;
		
		n1=Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° valor: "));
		n2=Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° valor: "));
		
		if (n1<n2) {
			dif=n1-n2;
			JOptionPane.showMessageDialog(null, "A diferença dos dois valores é: "+dif);			
				   } 
		else {
			dif=n2-n1;
			JOptionPane.showMessageDialog(null, "A diferença dos dois valores é: "+dif);
		}
	}

}
