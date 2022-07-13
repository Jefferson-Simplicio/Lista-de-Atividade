import java.util.Scanner;
public class exer6 {
    public static void main(String[] args) {
        Float sal = 10.25f;
        float hora, total;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Informe a sua quantidade de horas trabalhadas: ");
        hora = Scan.nextFloat();
        total = sal * hora;
        if (total < 50) {
            System.out.println("Atenção, dirija-se à direção do Hotel!");
        }else{
            System.out.println("O seu salário total foi R$"+ total);
        }
 }
    
}