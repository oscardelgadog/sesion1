package calculadorappo;


public class Calculadorat {
//DECLARO VARIABLES DE MEMORIA
    operaciones oper, oper2, resfin;
    
    public Calculadorat()//constructor
    {
    oper =new operaciones();
    oper2 =new operaciones();
    resfin =new operaciones();
    }
         public String opercalc(String num, String num2, String op)
    {
        String res="";
        Double result=0.0;
        Double pi=3.1415926536;       
         if(op.equals("-")){  
            result=Double.parseDouble(num)-Double.parseDouble(num2);
        }
         if(op.equals("+")){
            result=Double.parseDouble(num)+Double.parseDouble(num2);
        }       
        if(op.equals("*")){
            result=Double.parseDouble(num)*Double.parseDouble(num2);
        }        
        if(op.equals("/")){
            result=Double.parseDouble(num)/Double.parseDouble(num2);
        }
        if(op.equals("A_tri")){
            result=Double.parseDouble(num)*Double.parseDouble(num2)/2;
        }
        if(op.equals("A_cir")){
            result=pi*Math.pow(Double.parseDouble(num), 2);
        }
        if(op.equals("A_cua")){
            result=Math.pow(Double.parseDouble(num), 2);
        }
        if(op.equals("A_rec")){
            result=Double.parseDouble(num)*Double.parseDouble(num2);
        }
        res=result.toString();
    return res;
    }
    
    
    public static void main(String[] args) {
     Calculadora cal=new Calculadora();
     cal.setVisible(true);
        // TODO code application logic here
    }
             
}
