/*
*Soma dos valores de um trapézio, HIPOTENUSA
*/
import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        float h, b, B, area;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor da altura do trapézio(cm²): ");
        h = ler.nextFloat();
        System.out.println("Informe o valor da menor base do trapézio(cm²):");
        b = ler.nextFloat();
        System.out.println("Informe o valor da maior base do trapézio(cm²): ");
        B = ler.nextFloat();
        area = (h * (b + B)) / 2;
        
    }

}
