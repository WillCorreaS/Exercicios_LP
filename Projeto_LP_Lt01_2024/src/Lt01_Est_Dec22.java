
import javax.swing.JOptionPane;

/*
Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem
crescente.
 */
public class Lt01_Est_Dec22 {
    public static void main(String[] args) {
        int num1, num2;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite um 1° número: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite um 2° número: "));
        
        if (num1 > num2){
            JOptionPane.showMessageDialog(null, num1+ " e " +num2);
        } else if (num1 < num2) {
            JOptionPane.showMessageDialog(null, num2+ " e " +num1);
        } else{
            JOptionPane.showMessageDialog(null,"Os dois números são iguais.\n"+"                      "+num1);
        }
    }
    
}
