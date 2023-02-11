package Taller_2;

import java.util.concurrent.ThreadLocalRandom;

public class Matriz   {
    private final static int INT_MAX =105659;



    private static int[][] matriz ;


    public Matriz (int dim)
    {
        matriz= new int[dim][dim];
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

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]+"\t");
            }
            System.out.println();
            
        }

    }

    public int retDim (){
        return matriz.length;
    }
    public int retVal (int i, int j){
        return matriz[i][j];
    }


    
}
