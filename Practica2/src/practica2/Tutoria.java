
package practica2;
import java.util.Scanner;

public class Tutoria extends Coordinadores{

    String tutorias;
    public String getTutorias() {
        return tutorias;
    }

    public void setTutorias(String tutorias) {
        this.tutorias = tutorias;
    }

    @Override  //indica que se modifica un metodo heredado
    public void leer()
{
    Scanner escaneo=new Scanner(System.in);
    super.leer(); //llama el metodo leer en prectica2
    System.out.println("Tutorias: ");
    tutorias = escaneo.nextLine(); //se lee la tutoria     
}      
    
    
}
