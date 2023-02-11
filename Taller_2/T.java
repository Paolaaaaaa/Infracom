package Taller_2;

public class T extends Thread {

    private int idThread;
    private Matriz matriz;
    private int loc_max;
    private Max maximus ;


    public T (int intIdthread, Matriz amatriz, Max maximum){
        this.idThread= intIdthread;
        this.matriz = amatriz;
        this.loc_max = 0;
        this.maximus = maximum;
    }
    @Override
    public void run() {
        for (int i = 0; i < matriz.retDim(); i++) {
            if (matriz.retVal(idThread, i)>maximus.maxMax())
            maximus.newMax(matriz.retVal(idThread, i)); 
            
        }
        
        
    }

    public synchronized void newMaximus (int num){
        maximus.newMax(num);

    }

   


    public static void main(String[] args) {
        Max maximusGlob = new Max();
        Matriz matriz = new Matriz(4);
        matriz.createM();
        matriz.imprimier_matriz();
        for (int i = 0; i < 4; i++) {
            T threadT = new T(i, matriz,maximusGlob);
            threadT.start();
            
        }


        
    }

    
}

