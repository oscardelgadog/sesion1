package primsesion;

public class Persona2 {
String Nombre2;
String Apellido2;

public String nombre_completo2()
    {
    String nombre_completo2;    
    nombre_completo2 = Nombre2 + Apellido2;
    return nombre_completo2;  
    }

    public String getNombre2() {
        return Nombre2;
    }

    public void setNombre2(String Nombre2) {
        this.Nombre2 = Nombre2;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }
}