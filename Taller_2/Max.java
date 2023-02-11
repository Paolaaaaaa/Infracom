package Taller_2;

public class Max {
    private int max;

    public Max( ){
        this.max= 0;
    }

    public  synchronized void  newMax(int num){
        this.max = num;
        System.out.println("El nuevo maximo es "+num);

    }

    public synchronized int maxMax ()
    {
        return this.max;
    }
    
}
