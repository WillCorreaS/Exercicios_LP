/*
 * Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
quantos anos terá daqui a 17 anos.
 */
import javax.swing.JOptionPane;

public class Exerc_LP_12 {
	public static void main(String[] args) {
		int anoNasc, anoAtual, idadeFut;
		
		anoNasc=Integer.parseInt(JOptionPane.showInputDialog("Informe seu ano de Nascimento: "));
		anoAtual=Integer.parseInt(JOptionPane.showInputDialog("Informe seu ano atual: "));
		
		idadeFut=(anoAtual-anoNasc)+17;
		
		JOptionPane.showInputDialog("Sua idade daqui à 17 anos será: "+idadeFut);
		
	}
}
