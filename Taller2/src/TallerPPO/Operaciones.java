
package TallerPPO;

public class Operaciones {
Captura valu, vald, valt, resfin;

public Operaciones() //constructor
{
    valu =new Captura();
    vald =new Captura();
    valt =new Captura();
    resfin =new Captura();
}


    public String calc_prim(String num)
{
    String ru="", res;
    Double result;
           result=Double.parseDouble(num);
        if (result==0)
            {
                System.out.println("Nulo");
                ru="Nulo";
            }
                else          
                if(result>0)
                {
                System.out.println("El numero "+result+" es positivo  ok");
                ru="El numero "+result+" es positivo  ok";
                }
                else
                if(result<0)
                {
                System.out.println("El numero "+result+" es negativo  no ok");
                ru="El numero "+result+" es negativo  no ok";
                }
                res=String.valueOf(ru);
                return res;                
}
    
    public String calc_ascdesnu(String num,String num2, String num3)
{
    String ru="", res;
    Double result, result2,result3,alto,medio,bajo;
    result=Double.parseDouble(num);    
    result2=Double.parseDouble(num2); 
    result3=Double.parseDouble(num3); 
                if(result>result2 && result>result3){
                System.out.println("Los numeros son descendentes: ");
                ru="Los numeros son descendentes: ";
                    alto=result;
                }
                else
                if(result2>result && result2>result3){
                System.out.println("Los numeros son mezclados: "); 
                ru="Los numeros son mezclados: ";
                    alto=result2;
                }
                else
                alto=result3;
                if(result<result2 && result<result3){
                System.out.println("Los numeros son ascendentes: "); 
                ru="Los numeros son ascendentes: ";
                    bajo=result;
                }
                else
                if(result2<result && result2<result3){
                System.out.println("Los numeros son mezclados: ");   
                ru="Los numeros son mezclados: ";
                    bajo=result2;
                }
                else{
                bajo=result3;
                }
                res=String.valueOf(ru);
                return res;
}
        public String calc_primo(String num)
{
    String ru="", res;
    Double result;
    result=Double.parseDouble(num);
            if (result==0)
            {
                System.out.println("Nulo");
                ru="Nulo";
            }
                else
            {
                if(result%2==0)
                {
                System.out.println("El numero "+result+" es par");
                ru="El numero "+result+" es par";
                }
                else
                {
                System.out.println("El numero "+result+" es impar");
                ru="El numero "+result+" es impar";        
                }
            }
            res=String.valueOf(ru);
            return res; 
}


    public String calc_maymenig(String num)
    {
    String ru="", res;
    Double result;
    result=Double.parseDouble(num);
        if (result==0)
        {
            System.out.println("Cero");
            ru="Cero";
        }
        else
        {
            if(result==100)
            {
                System.out.println("El numero "+result+" es igual a 100");
                ru="El numero "+result+" es igual a 100";
            }
            else
            if(result>100)
            {
                System.out.println("El numero "+result+" es mayor a 100");
                ru="El numero "+result+" es mayor a 100";
            }
            else
            {
                System.out.println("El numero "+result+" es menor a 100");
                ru="El numero "+result+" es menor a 100";
            }
        }    
            res=String.valueOf(ru);
            return res;         
    }
    
    public String calc_diasem(String num)
    {
    String ru="", res;
    Double result;
    result=Double.parseDouble(num);
        if (result==0)
        {
            System.out.println("Cero");
            ru="Cero";
        }
        else
        {
            if (result==1)
            {
                System.out.println("El día "+result+": corresponde al Lúmes ");
                ru="El día "+result+": corresponde al Lúmes";
            }
            else
            if(result==2)
            {
                System.out.println("El día "+result+": corresponde al Martes ");
                ru="El día "+result+": corresponde al Martes ";
            }
            else
            if(result==3)
            {
                System.out.println("El día "+result+": corresponde al Miercoles ");
                ru="El día "+result+": corresponde al Miercoles ";
            }
            else
            if(result==4)
            {
                System.out.println("El día "+result+": corresponde al Jueves ");
                ru="El día "+result+": corresponde al Jueves ";
            }
            else
            if(result==5)
            {
                System.out.println("El día "+result+": corresponde al Viernes ");
                ru="El día "+result+": corresponde al Viernes ";
            }
            else
            if(result==6)
            {
                System.out.println("El día "+result+": corresponde al Sábado ");
                ru="El día "+result+": corresponde al Sábado ";
            }
            else
            if(result==7)
            {
                System.out.println("El día "+result+": corresponde al Domingo ");
                ru="El día "+result+": corresponde al Domingo ";
            }
            else
            if(result>7)
            {
                System.out.println("El día "+result+": no corresponde a ningún día ");
                ru="El día "+result+": no corresponde a ningún día ";
            }
            else
            if(result<1)
            {
                System.out.println("El día "+result+": no corresponde a ningún día ");
                ru="El día "+result+": no corresponde a ningún día ";
            }
        }
            res=String.valueOf(ru);
            return res;
    }
    public String calc_voccons(String num)
    {
    String ru="", res;
    Double result;    
    if (num.equals("a")||num.equals("e")||num.equals("i")||num.equals("o")||num.equals("u")||num.equals("A")||num.equals("E")||num.equals("I")||num.equals("O")||num.equals("U"))
        {
            System.out.println(num+": es vocal ");
            ru=num+": es vocal ";
        }
        else
        {
            System.out.println(num+": es consonante ");
            ru=num+": es consonante ";
        }
    res=String.valueOf(ru);
    return res;
    }
 
    public String calc_ordnum(String num,String num2)
{
    String ru="", res;
    Double result, result2,temp,temp2;
    result=Double.parseDouble(num);
    result2=Double.parseDouble(num2);
        if (result==0 || result2==0)
        {
            System.out.println("Cero");
            ru="Cero";
        }
        else
        {
            if (result>result2)
            {
                temp2=result;
                temp=result2;
                System.out.println("El número menor "+temp+" y el número mayor es "+temp2);
                ru="El número menor "+temp+" y el número mayor es "+temp2;
            }
            else
            {
                System.out.println("El número menor "+result+" y el número mayor es "+result2);
                ru="El número menor "+result+" y el número mayor es "+result2;
            }
        }    
    res=String.valueOf(ru);
    return res;
}
    
    public String calc_primos(String num)
{
    String ru="", res;
    Double result;
    int i, a=0;
    result=Double.parseDouble(num); 
    
    for(i=1;i<=result;i++){
            if(result % i==0)
            {
                a++;
            }
        }
        if(a != 2)
        {
            System.out.println("El número "+result+" No Es primo");
            ru="El número "+result+" No Es primo";
        }
        else
        {
            System.out.println("El número "+result+"  Es primo");
            ru="El número "+result+"  Es primo";
        }
    
    res=String.valueOf(ru);
    return res;    
}    
    
}