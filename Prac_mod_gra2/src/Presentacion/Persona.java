package Presentacion;

public class Persona {
String Nombre;
String Apellido;

public String nombre_completo()
    {
    String nombre_completo;    
    nombre_completo = Nombre + Apellido;
    return nombre_completo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public String Nombre_Completo()
    {
        String Nombre_Completo = "";
        Nombre_Completo =  getNombre() + "   " + getApellido();
        
        return Nombre_Completo;
    }
}
