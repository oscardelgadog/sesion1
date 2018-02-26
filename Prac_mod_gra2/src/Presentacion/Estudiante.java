package Presentacion;


public class Estudiante extends Persona 
    {
     public Estudiante() {
        System.out.print("Se ejecuta el constructor  ");
    }
    // fin constructor
    
    String Correo;
    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
//constructor con parametros
    public Estudiante(String Correo) {
        this.Correo = Correo;
    }

    @Override
    
    //Destructor
    protected void finalize() throws Throwable {
      System.out.print("Destructor ejecutado");
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    
    
    
    }
 //fin constructor con parametros   
    //polimorfismo
    
       public String Dato_Completo()
    {
        String Datos_Completo = "";
        Datos_Completo = Nombre_Completo() + "   " + getCorreo() ;
        
        return Datos_Completo;
    }
}
