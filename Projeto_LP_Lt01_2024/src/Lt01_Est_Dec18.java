
import javax.swing.JOptionPane;

/*
Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do
maior pelo menos valor
 */
public class Lt01_Est_Dec18 {
    public static void main (String args []){
        int num1, num2,dif;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1° número: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2° número: "));
        
        if (num1 > num2){
            dif=num1-num2;
         }
        else{
            dif=num2-num1;
        }
        JOptionPane.showMessageDialog(null, "A diferença entre os dois número é: "+dif);
    }
}
    
