package Taller3_1;

public class Persona extends Thread {
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
        pasarela.entrar(this.id, this.id%2);
    }

    public void caminar(){
        pasarela.caminar();

    }
    public void salir(){
        pasarela.salir(this.id, this.id%2);

        
    }
    
}
