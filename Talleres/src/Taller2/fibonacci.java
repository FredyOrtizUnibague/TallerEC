package Talleres.src.Taller2;

public class fibonacci {
    private int ant;
    private int sig;
    private int fib;
    
    

    public int getAnt() 
    {
        return ant;
    }


    public void setAnt(int ant) 
    {
        this.ant = ant;
    }


    public int getSig() 
    {
        return sig;
    }


    public void setSig(int sig) 
    {
        this.sig = sig;
    }


    public int getFib() 
    {
        return fib;
    }


    public void setFib(int fib) 
    {
        this.fib = fib;
    }

    public int fibochaBasico(int n) 
    {
        for (int i = 0; i <= n; i++)
        {
            fib = ant + sig;
            ant = sig;
            sig = fib;
            i++;

            System.out.println("f("+i+")"+fib);
        } 
        return fib;
    }

    public int fibonaOpt (int n)
    {
        if (n <= 1)
        {
            return n;
        }

        for (int i = 0; i <= n; i++ )
        {
            fib = ant + (ant = sig);
        }
        return fib;
    }


}
