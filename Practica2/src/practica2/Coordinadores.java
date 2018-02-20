package practica2;

import java.util.Scanner;

public class Coordinadores{
    
String id;
String Nombres;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void leer()
{
    Scanner escaneo=new Scanner(System.in);
        System.out.println("Digite su coordinador ID: ");
        id = escaneo.nextLine();
        System.out.println("Digite sus Nombres: ");
        Nombres = escaneo.nextLine();     
} 
    
}
