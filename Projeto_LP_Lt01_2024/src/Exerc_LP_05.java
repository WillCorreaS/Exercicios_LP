import javax.swing.*;

/*
 * Receba os coeficientes A, B e C de uma equação do 2º grau
*(AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a
*equação possue2 raízes). calcular DELTA (Δ = b2 – 4ac)
						  calcular raizes (x = – b ± √delta / 2*a)
 */
public class Exerc_LP_05 {
	public static void main (String  args []) {
		int a, b, c;
		double delta, raiz1, raiz2;
		
		a= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
		b= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
		c= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
		
		delta= (Math.pow(b, 2)) - ((4 * a) - c);
		
		raiz1=b+ (Math.sqrt(delta)) / (2 * a);
		raiz2=b- (Math.sqrt(delta)) / (2 * a);
		
		JOptionPane.showMessageDialog(null, "X1: "+raiz1+"\nX2: "+raiz2);
	}
}
