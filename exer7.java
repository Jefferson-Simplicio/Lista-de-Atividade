import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Double Kilo, libra;
        Double Libracv = 2.205;
        int decisao;
        Scanner scan = new Scanner(System.in);
        System.out.println("---------Menu--------");
        System.out.println("1.Converter Libras");
        System.out.println("2.Converter Kilos");
        decisao = scan.nextInt();
        if (decisao == 1) {
            System.out.print("Informe um valor em KG: ");
            Kilo = scan.nextDouble();
            libra = Kilo * Libracv;
            System.out.println("Seu valor total em libras é: " + libra + "lb");
        }
        if (decisao == 2){
            System.out.print("Informe um valor em Libras: ");
            libra = scan.nextDouble();
            Kilo = libra/Libracv;
            System.out.println("Seu valor total em libras é: " + Kilo + "KG"); 
        }
    }
}
