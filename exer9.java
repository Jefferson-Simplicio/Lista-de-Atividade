/*
* Média com OptionPane
*/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class exer9 {
    public static void main(String[] args) {
        float n1, n2, media;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a Nota1: ");
        n1 = ler.nextFloat();
        System.out.print("Digite a Nota2: ");
        n2 = ler.nextFloat();
        media = (n1 + n2) / 2f;
        JOptionPane.showMessageDialog(null, "Média: " + media);
    }
}
