package primsesion;

public class PrimSesion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //Mostrar texto en pantalla por consola
     String text;
     text="Hola compañeros";
     System.out.println(text);
        
     //Operadores Matematicos
     //primera forma
     int var1, var2, sum;
     var1=3;
     var2=2;
     sum=var1+var2;
     System.out.println("LA SUMA ES: " + sum);
     
     //Segunda forma simplificada
     int num, num2;
     num=5;
     num2=4;
     num+=num2;
     System.err.println("La segunda suma es: "+num);
     
        //objetos
        Persona uno=new Persona();
        uno.setNombre("Oscar ");
        uno.setApellido("Delgado ");
        System.err.println(uno.getNombre());
        System.out.println(uno.nombre_completo());
        
        Persona2 dos=new Persona2();
        dos.setNombre2("Luis ");
        dos.setApellido2("Durán");
        System.err.println(dos.getNombre2());
        System.out.println(dos.nombre_completo2());

        Persona3 tres=new Persona3();
        tres.setNombre3("Fernando ");
        tres.setApellido3("Delgado");
        System.err.println(tres.getNombre3());
        System.out.println(tres.nombre_completo3());  
        
            //herencia
           
            Estudiante estudianteuno=new Estudiante();
            estudianteuno.setNombre("Luis Enrique ");
            estudianteuno.setApellido("Delgado Durán ");
            estudianteuno.setCodigo("19168860 ");
            System.out.println(estudianteuno.nombre_completo());
            System.err.println(estudianteuno.getCodigo());

    }
    
}
