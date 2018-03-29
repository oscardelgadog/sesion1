
public class Perro extends Mamifero{

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
  
    String colorPelo;
    
    public void ladrar()
    {
        System.out.println("Guau ");
    }
}
