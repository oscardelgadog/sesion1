package primsesion;
//herencia
public class Estudiante extends Persona{ 
    String Codigo;
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    //polimorfismo
    @Override
    public String nombre_completo(){
    String nombre_completo;
    nombre_completo = Nombre + " " + Apellido + " " + Codigo;
    return nombre_completo;
    
    }
}

    
        

