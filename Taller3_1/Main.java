package Taller3_1;

public class Main {
    public static void main(String[] args) {


        Pasarela pass = new Pasarela(0, 0);

        for (int i = 0; i < 10; i++) {
            Persona pers= new Persona(pass, i);
            pers.start();
            
        }
        
    }
    
}
