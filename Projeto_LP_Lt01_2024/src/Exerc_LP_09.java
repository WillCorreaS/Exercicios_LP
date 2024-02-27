import javax.swing.*;

/*
 * Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 */
public class Exerc_LP_09 {
	public static void main (String args []) {
		int n1, n2, quad1, quad2;
		
		n1=Integer.parseInt(JOptionPane.showInputDialog("Digite 0 1° valor: "));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° valor: "));
		
		quad1=((n1-1)*(n1+1))+1;
		quad2=((n2-1)*(n2+1))+1;
		
		JOptionPane.showMessageDialog(null, "A soma dos quadrados é: \n1°: "+quad1+"\n2°: "+quad2);
		
	}

}

