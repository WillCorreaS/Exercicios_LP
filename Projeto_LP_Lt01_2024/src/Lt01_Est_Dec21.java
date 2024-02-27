
import javax.swing.JOptionPane;

/*
Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
Mostre a mensagem de acordo com a média:
a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”.
 */
public class Lt01_Est_Dec21 {
    public static void main(String[] args) {
        Double n1, n2, n3, n4, media;
        
        n1=Double.parseDouble(JOptionPane.showInputDialog("Valor da N1: "));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Valor da N2: "));
        n3=Double.parseDouble(JOptionPane.showInputDialog("Valor da N3: "));
        n4=Double.parseDouble(JOptionPane.showInputDialog("Valor da N4: "));
        
        media=(n1+n2+n3+n4)/4;
        
        if (media >= 6){
            JOptionPane.showMessageDialog(null, "APROVADO\nSua nota final foi: "+ media+"\n   PARABÉNS!");
        } else if (media >= 3 || media < 6){
            JOptionPane.showMessageDialog(null, "EXAME\nSua nota final foi: "+ media+"\n   PRECISA ESTUDAR MAIS!");
        }else if (media < 3){
            JOptionPane.showMessageDialog(null, "RETIDO\nSua nota final foi: "+ media+"\n   MAIS SORTE NA PRÓXIMA!");
        }
    }
    
}
