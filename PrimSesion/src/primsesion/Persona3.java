package primsesion;

public class Persona3 {
    
String Nombre3;
String Apellido3;

public String nombre_completo3()
    {
    String nombre_completo3;    
    nombre_completo3 = Nombre3 + Apellido3;
    return nombre_completo3;  
    }

    public String getNombre3() {
        return Nombre3;
    }

    public void setNombre3(String Nombre3) {
        this.Nombre3 = Nombre3;
    }

    public String getApellido3() {
        return Apellido3;
    }

    public void setApellido3(String Apellido3) {
        this.Apellido3 = Apellido3;
    }
    
}
