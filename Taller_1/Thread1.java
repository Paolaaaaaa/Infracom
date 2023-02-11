package Taller_1;

public class Thread1 extends Thread  


{
    public void run (){
        System.out.println("Extendiendo de la clase Thread");


    }

    public static void main(String[] args) {
        Thread1 t = new Thread1();
        t.start();
    }


    
}
