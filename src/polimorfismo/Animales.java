
package polimorfismo;


public class Animales 
{
    private String nombre;
    private int tamanio;
    private int numeroOjos;
    private String tipo;
    
    public Animales (String nombre, int tamanio,int numeroOjos,String tipo)
    {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.numeroOjos = numeroOjos;
        this.tipo = tipo;
    }

    public String tamañoanimal()
    {
         String tamanio = "por defecto mide 30 cm";
         return tamanio;
    }
   public String moverse ()
   {
       String movimiento = " , por defecto se mueve despacio";
       return movimiento;
   }
    public String getNombre() {
        return nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public int getNumeroOjos() {
        return numeroOjos;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
}




