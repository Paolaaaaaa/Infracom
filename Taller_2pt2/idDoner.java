package Taller_2pt2;

public class idDoner {

    private static int idactual;

    public idDoner(){
        this.idactual=0;

    }



    public  synchronized int asignInt ()
    {
        this.idactual+=1;
        return idactual;

    }
    
}
