package practica2;
public class Docentes {
String Nombre;
String Nombre2;
String Apellido;
String Apellido2;
String Docencia;
String Edad;
String Sexo;
String Aula;
//inicio getter and setter
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre2() {
        return Nombre2;
    }

    public void setNombre2(String Nombre2) {
        this.Nombre2 = Nombre2;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getDocencia() {
        return Docencia;
    }

    public void setDocencia(String Docencia) {
        this.Docencia = Docencia;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getAula() {
        return Aula;
    }

    public void setAula(String Aula) {
        this.Aula = Aula;
    }
    //fin getter and setter
public String datos_completos2()
    {
    String datos_completos2;    
    datos_completos2 = Nombre + Nombre2 + Apellido + Apellido2 + Docencia + Edad + Sexo + Aula;
    return datos_completos2;
    }    
    
}
