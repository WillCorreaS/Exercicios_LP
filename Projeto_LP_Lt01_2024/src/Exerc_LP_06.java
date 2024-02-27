/*
 * Receba os valores em x e y. Efetua a troca de seus valores e mostre seus
conteúdos.
 */

import javax.swing.JOptionPane;

public class Exerc_LP_06 {
	public static void main (String args []) {
		int x, y, i=0;
		
		x=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
		y=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y: "));
		
		i=x;
		x=y;
		y=i;
		
		JOptionPane.showMessageDialog(null, "Os valores trocados são:\n"+"X: "+x+"\nY: "+y);
	}
}
