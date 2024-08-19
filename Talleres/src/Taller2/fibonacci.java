package Talleres.src.Taller2;

public class fibonacci {
    private int ant;
    private int sig;
    private int fib;
    
    

    public String fibochaBasico(int n) 
    {
        long inicioTiempo = System.nanoTime();

        ant = 0;
        sig = 1;
        System.out.println("f(0)"+"="+ant);
        System.out.println("f(1)"+"="+sig);
        for (int i = 2; i <= n; i++)
        {
            fib = (ant) + (sig) ;
            ant = sig;
            sig = fib;

            System.out.println("f("+i+")"+"="+fib);
        } 
        long finalTiempo = System.nanoTime();
        long tiempoTotal = finalTiempo - inicioTiempo;
        System.err.println("El tiempo en nanosgundos fue: " + tiempoTotal);
        return "Ha sido exitoso";
    }

    public String fibonaOpt (int n)
    {
        long inicioTiempo = System.nanoTime();
       
        for(int ant = 0, sig = 1, i = 0; i <= n; i++)
        {
            System.out.println("f("+i+")"+"="+ ant);
            sig = ant + (ant = sig);
        }
        long finalTiempo = System.nanoTime();
        long tiempoTotal = finalTiempo - inicioTiempo;
        System.err.println("El tiempo en nanosgundos fue: " + tiempoTotal);
        return "Ha sido exitoso";
    }


}
