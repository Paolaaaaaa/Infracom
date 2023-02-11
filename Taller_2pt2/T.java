package Taller_2pt2;

public class T extends Thread {
    private int idactual;

    public T (int idactual)
    {
        this.idactual = idactual;
    }
    @Override
    public void run() {
        System.out.println(idactual);
    }



    public static void main(String[] args) {
        idDoner id_nonor = new idDoner();
        for (int i = 0; i < 10; i++) {
            T thread1 = new T(id_nonor.asignInt());
            thread1.start();
            
        }
    }
    
}
