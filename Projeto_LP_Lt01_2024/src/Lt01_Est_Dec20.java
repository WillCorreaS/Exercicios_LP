
import javax.swing.JOptionPane;

/*
Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso
exista, calcule e mostre 
calcular DELTA (Δ = b2 – 4ac)
calcular raizes (x = – b ± √delta / 2*a)
 */
public class Lt01_Est_Dec20 {
    public static void main(String[] args) {
        Double a, b, c, delta, raiz1 = null, raiz2;
        
        a=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
        b=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
        c=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));
        
        delta= (Math.pow(b, 2)) - ((4 * a) * (c));
        
                if (delta < 0){
                    JOptionPane.showMessageDialog(null, "As raizes são inexistentes: \nEste é o valor de Δ= "+delta);
                }
                else {
        raiz1= -b + (Math.sqrt(delta)) / (2*a);
        raiz2= -b - (Math.sqrt(delta)) / (2*a);
        
        //System.out.println (delta);

        JOptionPane.showMessageDialog(null, "A raiz positiva é: X1 "+raiz1 + "\nA raiz negativa é: X2 "+raiz2);
                }
                    


    }
    
}
