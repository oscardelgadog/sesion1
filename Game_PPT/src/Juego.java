public class Juego {
     Jugador jugador1 ,jugador2; 

    public Juego() {
        jugador1 = new Jugador();
        jugador2 = new Jugador();   
    }
    
    
    public String Evaluar(String num, String num2){
        String res="";
        System.out.println(num + num2);
            if((num.equals("Piedra") && num2.equals("Piedra")) 
                        || (num.equals("Papel") && num2.equals("Papel")) 
                        || (num.equals("Tijera") && num2.equals("Tijera"))) 
            { 
                res="empate";
                System.out.println("\nempate\n"); 
            } 
            else 
            { 
                if((num.equals("Piedra") && num2.equals("Papel")) 
                        || (num.equals("Papel") && num2.equals("Tijera")) 
                        || (num.equals("Tijera") && num2.equals("Piedra"))) 
                        
                {
                    res="\nganaste jugador dos\n"+num2;
                    System.out.println("\nganaste jugador dos\n"+num2); 
                } 
                else 
                { 
                    res="\nganaste jugador uno\n"+num;
                    System.out.println("\nganaste jugador uno\n"+num); 
                } 
            }
            return  res;
            }      
    }