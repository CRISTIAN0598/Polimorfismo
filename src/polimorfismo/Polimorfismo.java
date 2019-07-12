
package polimorfismo;

public class Polimorfismo 
{

    public static void main(String[] args) 
    {
        
       Animales ave = new Ave("aguila", 50, 2, "rapiña");
       Animales rana = new Rana ("rana", 30, 2, "anfibio");
       Animales pescado= new pez ("cachama", 30, 2, "acuatico");
       
       String nombreanimal = ave.getNombre();
       String movimiento = ave.moverse();
       String tamanio = ave.tamañoanimal();
       
       
      String movimientorana = rana.moverse();
      String nombreanimal1 = rana.getNombre();
      String tamanio1 = rana.tamañoanimal();
      
       
      String movimiento2 = pescado.moverse();
      String nombreanimal2 = pescado.getNombre();
      String tamanio2 = pescado.tamañoanimal();
      
      
        System.out.println("el animal de nombre " + nombreanimal +movimiento +  tamanio);
        System.out.println("el animal de nombre " + nombreanimal1 +movimientorana + tamanio1);
         System.out.println("el animal de nombre " + nombreanimal2 +movimiento2 + tamanio2);

    }
      
        
       
    
}











