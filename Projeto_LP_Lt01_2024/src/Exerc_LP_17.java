/*
 * Calcule a quantidade de litros gastos em uma viagem, sabendo que o
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 */

import javax.swing.JOptionPane;

public class Exerc_LP_17 {
	public static void main(String[] args) {
		double tempoDePercurso,velocidadeMedia;
		
		tempoDePercurso=Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo de percurso (em horas): "));
		velocidadeMedia=Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade média (em km/h): "));
		
		
        double autonomia = 12.0;
        double litrosGastos = (tempoDePercurso * velocidadeMedia) / autonomia;
		
		
		JOptionPane.showMessageDialog(null,"A quantidade de litros gastos é: " + litrosGastos + " litros");
	}
}
