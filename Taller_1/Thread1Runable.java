package Taller_1;

public class Thread1Runable implements Runnable{


    public void run (){
        System.out.println("Imlementando la interfaz runnable");
    }
    public static void main(String[] args) {

        Thread t = new Thread(new Thread1Runable());
        t.start();
        
    }


    
}
