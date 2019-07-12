
package polimorfismo;

public class pez extends Animales
        
{
   public pez (String nombre, int tamanio,int numeroOjos,String tipo)
   {
       super (nombre,tamanio,numeroOjos,tipo);
   }
    
   public String moverse ()
   {
       String movimiento = " nada rapidamente";
       return movimiento;
       
   }
   public String tamañoanimal ()
   {
       String tamanio = " mide 70cm";
       return tamanio;
   }
}




