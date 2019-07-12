

package polimorfismo;

public class Ave extends Animales 
        
{
    public Ave(String nombre, int tamanio,int numeroOjos,String tipo)
    {
        super (nombre,tamanio,numeroOjos,tipo);
        
        
    }
    
    public String moverse ()
    {
        String movimiento = " , vuela rapidamente";
        return movimiento;
        
    }
    public String tamañoanimal()
    {
        String tamanio = ", y mide 60 cm";
        return tamanio;
        
    }
}



