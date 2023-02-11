package Taller3_1;

public class Pasarela {
    private int personasCaminandoDerIzq;
    private int    personasCaminandoIzqDer;

    



    public Pasarela(int personasCaminandoDerIzq, int personasCaminandoIzqDer) {
        this.personasCaminandoDerIzq = personasCaminandoDerIzq;
        this.personasCaminandoIzqDer = personasCaminandoIzqDer;
    }





    public synchronized void entrar(int id, int direccion) {
        if (direccion == 1) {
        System.out .println("Entra la persona " + id + " en dirección: " + direccion +  "===>");
         while (personasCaminandoDerIzq > 0) { 
        try {
        System.out.println("La persona " + id + " en dirección: ===> se durmtó");
        wait();
     } catch (InterruptedException e) {
     }
    }

        personasCaminandoIzqDer++;
        System.out.println("Personas caminando: " + personasCaminandoIzqDer);
}else { // derecha a izquierda
        System.out.println("Entra la persona " + id + " en dirección: " + direccion + "<-----") ;
        while (personasCaminandoIzqDer > 0) { // hay personas caminando en sentido contrario
        try {
        System.out .println( "La persona " + id + " en dirección se durmió");
        wait();
        } catch (InterruptedException e) {}
    }
        // Sí no hay personas caminando en sentido contrario, o al despertar personasCaminandoDer120+4;
        System.out.println("Personas caminando: " + personasCaminandoDerIzq);
}
}


public synchronized void caminar() {
    try {
        wait(100);
        System.out.println("Caminando ......");

    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
public synchronized void salir(int id, int direccion) {
    
    if (direccion == 0)
    {
        this.personasCaminandoIzqDer--;
        if(this.personasCaminandoIzqDer==0){
            notifyAll();
            System.out.println("Salí:      "+id);

        }

    }
    if(direccion==1){
        this.personasCaminandoDerIzq--;
        if(this.personasCaminandoDerIzq==0){
            notifyAll();
            System.out.println("Salí:      "+id);
        }

    }
}






}
