package Taller_1;

public class Ejemplo4 implements Runnable {


    private int n;
    public Ejemplo4 (int i ){
        System.out.println("Implementando la clase runnable");
        this.n = i;

    }
    public void run ()
    {
        System.out.println("El valor incial es: "+ this.n);

    }


    public static void main(String[] args) {

        Thread t = new Thread(new Ejemplo4(1));
        t.start();
        
    }
}
