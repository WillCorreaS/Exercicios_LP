/*
 * Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
de desconto e o número de descendentes. Calcule o salário que serão as
horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
Líquido. Exiba o salário a receber
 */
import javax.swing.*;

public class Exerc_LP_16 {
		public static void main(String[] args) {
			
			double hTrab=0, valorH=0, percDesc=0, sal, salLiq, salFinal;
			int nDependente=0;
			
			hTrab=Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas: "+hTrab));
			valorH=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor ganho por hora: "+valorH));
			percDesc=Double.parseDouble(JOptionPane.showInputDialog("Informe o persetual de desconto: "+percDesc));
			nDependente=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dependentes: "+nDependente));
			
			double percentual = percDesc / 100.0; 
			sal=hTrab * valorH;
			salLiq=sal-(percentual * sal);
			nDependente=nDependente * 100;
			
			salFinal= salLiq+nDependente;
			
			JOptionPane.showMessageDialog(null,"Seu salário a receber é: R$"+salFinal);
			
			
		}

}
