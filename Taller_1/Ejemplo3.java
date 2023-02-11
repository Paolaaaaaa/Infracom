package Taller_1;

public class Ejemplo3 extends Thread {

    private int n;

    public Ejemplo3 (int i ){
        System.out.println("Extendiendo de la clase thread");
        this.n = i;

    }
    public void run ()
    {
        System.out.println("El valor incial es: "+ this.n);

    }

    public static void main(String[] args) {
        Ejemplo3 t = new Ejemplo3(1);
        t.start();
    }
    
}
