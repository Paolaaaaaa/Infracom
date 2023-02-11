package Taller_3;

public class Persona extends Thread{
    private Pasarela pasarela;
    private int id;


    @Override
    public void run() {
        entrarPasarela();
        caminar();
        salir();
    }


    public Persona (Pasarela pasarela, int id){
        this.pasarela = pasarela;
        this.id = id;
    }
    public void entrarPasarela(){

    }

    public void caminar(){

    }
    public void salir(){
        
    }
    
}
