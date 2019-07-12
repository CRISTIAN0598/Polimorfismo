
package polimorfismo;

public class Rana extends Animales
        
{
    
     public Rana(String nombre, int tamanio,int numeroOjos,String tipo)
    {
        super (nombre,tamanio,numeroOjos,tipo);
        
        
    }
     public String moverse ()
    {
        String movimiento = " , salta rapidamente";
        return movimiento;
        
    }
      public String tamañoanimal()
    {
        String tamanio = ", y mide 20 cm";
        return tamanio;
        
    }
}





