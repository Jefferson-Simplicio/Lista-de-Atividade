package ExerciciosJava;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        float h, b, B, area;
        int areaA;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor da altura do trapézio(cm²): ");
        h = ler.nextFloat();
        System.out.println("Informe o valor da menor base do trapézio(cm²):");
        b = ler.nextFloat();
        System.out.println("Informe o valor da maior base do trapézio(cm²): ");
        B = ler.nextFloat();
        area = (h * (b + B)) / 2;
        areaA = Math.round(area) * 100 / 100;
        System.out.println("A área do trapézio é de " + area + " cm²");
        System.out.println("A área do trapézio arredondada é de" + areaA + " cm²");
    }

}
