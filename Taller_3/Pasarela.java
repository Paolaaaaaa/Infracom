package Taller_3;

public class Pasarela {


    private int cntpersonas;
    private int direccion;// 0 nadie 1 izquierda 2 derecha
    public Pasarela(int cntpersonas, int direccion) {
        this.cntpersonas = cntpersonas;
        this.direccion = direccion;
    }

    public synchronized void entrarPasarela(int direccionp){
        while (direccionp != this.direccion){
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        this.cntpersonas++;
        notify();

        
        
    }




    


    
}
