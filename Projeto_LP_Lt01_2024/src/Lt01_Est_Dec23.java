
import javax.swing.*;

/*
Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não
necessariamente em ordem. Mostre os 4 números em ordem crescente.

 */
public class Lt01_Est_Dec23 {
    public static void main(String[] args) {
        int n1,n2,n3=0,n4=0;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor maior que o 1°: "));
        n3=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor maior que o 2°: "));
        n4=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor aleatório: "));
        
        if (n4 == n3 || n4 == n2 || n4 == n1)
        {
           JOptionPane.showMessageDialog(null,"Digite um valor válido!");                    
        }
        
        if (n4<n1){
            JOptionPane.showMessageDialog(null,n4+" "+n1+" "+n2+" "+n3);            
        } else if (n4 > n1 && n4 < n2){
            JOptionPane.showMessageDialog(null,n1+" "+n4+" "+n2+" "+n3);
        }else if (n4 > n2 && n4 < n3){
            JOptionPane.showMessageDialog(null,n1+" "+n2+" "+n4+" "+n3);
        }else{
            JOptionPane.showMessageDialog(null,n1+" "+n2+" "+n3+" "+n4);
        }
    }
}
        


