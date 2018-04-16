import java.io.File;
import java.io.FileWriter;

public class Puntaje {
    Jugador puntaje1;
    public Puntaje()
    {
        puntaje1 = new Jugador();
    }
    
     public String Guardar(String texto)
{
    String rest;
    rest = texto;
   try
{
//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
File archivo=new File("Resultado_puntajes.txt");

//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
FileWriter Puntaje2=new FileWriter(archivo,true);
Puntaje2.write(rest);
Puntaje2.write(" \r\n  ");

//Cerramos la conexion
Puntaje2.close();
}

//Si existe un problema al escribir cae aqui
catch(Exception e)
{
System.out.println("Error al escribir");
}
return rest = "";
}
    
}
