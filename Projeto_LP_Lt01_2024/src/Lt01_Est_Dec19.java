
import javax.swing.*;

/*
Receba 2 valores reais. Calcule e mostre o maior deles
 */
public class Lt01_Est_Dec19 {
    public static void main (String args []){
        int num1, num2, maior;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1° número: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2° número: "));
        
        if (num1 > num2){
            maior=num1;
        }
        else{
            maior=num2;
        }
        
        JOptionPane.showMessageDialog(null, "O maior valor dentre eles é: "+maior);
    }
    
}
