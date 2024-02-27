/**
 * @Aluno: Wilian Correa - FATEC ZL
 * Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 */

import javax.swing.JOptionPane;

public class Exerc_LP_02 {
       public static void main (String args []){
           Double sal, salAtualizado;
           
           sal=Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário atual: "));
           salAtualizado=sal * 1.15;
           
           JOptionPane.showMessageDialog(null, "Seu salário atualizado é: R$"+ salAtualizado);
       }
}
