package Talleres.src.Taller2;
import java.util.Scanner;

public class aplicacion {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        fibonacci fb = new fibonacci();


        System.out.println("Ingrese el numero de iteraciones que desee: ");
        int n = sc.nextInt();

        System.out.println("Metodo Basico");
        System.out.println(fb.fibochaBasico(n))
        ;

        System.out.println("Metodo Optimizado");
        System.out.println(fb.fibonaOpt(n));

        sc.close();
    }
}
