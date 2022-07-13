public class exer4 {

    public static void main(String[] args) {
        int i;
        int somaimp = 0;
        long par = 1; 
    for (i = 0; i <= 30; i++){
        if ( i % 2 == 1) {
            somaimp += i; 
        } else{
            if (i > 0) 
               par *= i;            
        }
    }
    System.out.println("Soma dos números impares: "+somaimp);
    System.out.println("Multiplicação dos números pares: " + par);
}
}