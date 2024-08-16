package Talleres.src.Taller2;
import java.util.Scanner;

public class aplicacion {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        fibonacci fb = new fibonacci();

        System.out.println(fb.fibochaBasico(7));




        sc.close();
    }
}
