package Taller_1;

import java.util.StringTokenizer;
import java.util.concurrent.ThreadLocalRandom;

public class Parte2 extends Thread{
    private final static int INT_MAX =105659;
    private final  static int DIM = 3;
    private static int[][] matriz  = new int[DIM][DIM];
    private int idThread;
    private int fila;

    private int mayorFila = -1;
    private int mayorGlobal = -1;


    public Parte2 (int idThread, int fila){
        this.idThread = idThread;
        this.fila = fila;
    }

    public static void createM (){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=ThreadLocalRandom.current().nextInt(0, INT_MAX);
            }
            
        }
        System.out.println("Matriz: ");
        System.out.println("========================================");

    }


    public static void imprimier_matriz(){

        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                System.out.println(matriz[i][j]+"\t");
            }
            System.out.println();
            
        }

    }


    public void run(){
        for (int i = 0; i < DIM; i++) {
            if (this.mayorFila<this.matriz[this.fila][i]){
                this.mayorFila = this.matriz[this.fila][i];
            }
            
        }
        if (this.mayorFila>mayorGlobal){
            try{
                Thread.sleep(250);
            }catch (InterruptedException e){
                e.printStackTrace();

            }
            this.mayorGlobal = this.mayorFila;

            String warn = String.format("========== Nuevo maximo encontrado ========== \n " + "ID Thread: %d - Maximo local actual: %d - Maximo global:. %d \n" + "\n", this.idThread, this.mayorGlobal, this.mayorFila);
            
            System.out.println(warn);
            
            
            }
            
            
            String msg = String.format("ID Thread: %d - Maximo local actual: %d - Maximo global:. %d", this.idThread, this.mayorFila, this.mayorGlobal);
            
            System.out.println(msg);
            
            }
            
            
            
            public static void main(String[] args) {
            
            
            System.out.println("Busqueda concurrente por una matriz");
            
            
            //Iniciar matriz
            
            Parte2.createM();
            
            System.out.println();
            
            System.out.println("Iniciando la busqueda por la matriz \n");
            
            
            //Iniciar busqueda
            
            Parte2[] bThreads = new Parte2[DIM];
            
            for(int i = 0; i < DIM; i++) {
            
            
            bThreads[i] = new Parte2(i,i);
            
            bThreads[i].start();
            
            }
            
            }
            
            
       
            
        }
            
        


    


    

