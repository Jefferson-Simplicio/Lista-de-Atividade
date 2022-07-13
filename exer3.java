package ExerciciosJava;

public class exe3 {
    public static void main(String[] args) {
        boolean sit;
        int i = 0;
        if (1 > 2) {

        } else {
            sit = false;
            System.out.println("a.(1 > 2) // " + sit);
        }
        if (8 == 8) {
            sit = true;
            System.out.println("b.(8 == 8) // " + sit);
        }
        if ((12 - 5) > 6) {
            sit = true;
            System.out.println("c.(12 - 5) > 6) // " + sit);
        }
        if ((0 < 3) && (8 < 9)) {
            sit = true;
            System.out.println("d.(0 < 3) && ( 8 < 9) // " + sit);
        }
        if ((i++) > i) {

        } else {
            sit = false;
            System.out.println("e.(i++)>i // " + sit);
        }
        if (((10 * 90 / 50) - 2) == 16) {
            sit = true;
            System.out.println("f.(10*90/50) -2 == 16 // " + sit);
        }
    }
}
