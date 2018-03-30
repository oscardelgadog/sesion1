import javax.swing.JOptionPane;
import java.util.Scanner;
public class Formulario_Taller extends javax.swing.JFrame {
//declaro variables para todo
    String dato, dato2, opera;
   
    public Formulario_Taller() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pos_neg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Txt_uno = new javax.swing.JTextField();
        Txt_Out = new javax.swing.JTextField();
        Asc_Des_Null = new javax.swing.JButton();
        Par_impar = new javax.swing.JButton();
        May_men_ig = new javax.swing.JButton();
        Dias_sem = new javax.swing.JButton();
        Vocal_cons = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_dos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Txt_tres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Num_ord = new javax.swing.JButton();
        Num_pri = new javax.swing.JButton();
        Num_pares = new javax.swing.JButton();
        Fibo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        Pos_neg.setBackground(new java.awt.Color(153, 153, 0));
        Pos_neg.setForeground(new java.awt.Color(255, 255, 255));
        Pos_neg.setText("positivo o negativo");
        Pos_neg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos_negActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("TALLER PROGRAMACIÓN ORIENTADA A OBJETOS");

        Asc_Des_Null.setBackground(new java.awt.Color(153, 153, 0));
        Asc_Des_Null.setForeground(new java.awt.Color(255, 255, 255));
        Asc_Des_Null.setText("ascendente, descendente o nulo");
        Asc_Des_Null.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asc_Des_NullActionPerformed(evt);
            }
        });

        Par_impar.setBackground(new java.awt.Color(153, 153, 0));
        Par_impar.setForeground(new java.awt.Color(255, 255, 255));
        Par_impar.setText("Par o impar");
        Par_impar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Par_imparActionPerformed(evt);
            }
        });

        May_men_ig.setBackground(new java.awt.Color(153, 153, 0));
        May_men_ig.setForeground(new java.awt.Color(255, 255, 255));
        May_men_ig.setText("mayor, menor o igual a 100");
        May_men_ig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                May_men_igActionPerformed(evt);
            }
        });

        Dias_sem.setBackground(new java.awt.Color(153, 153, 0));
        Dias_sem.setForeground(new java.awt.Color(255, 255, 255));
        Dias_sem.setText("Identificar día de la Semana");
        Dias_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dias_semActionPerformed(evt);
            }
        });

        Vocal_cons.setBackground(new java.awt.Color(153, 153, 0));
        Vocal_cons.setForeground(new java.awt.Color(255, 255, 255));
        Vocal_cons.setText("Vocal o consonante");
        Vocal_cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vocal_consActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor 1");

        jLabel3.setText("Resultado");

        jLabel4.setText("Valor 2");

        jLabel5.setText("Valor 3");

        Num_ord.setBackground(new java.awt.Color(153, 153, 0));
        Num_ord.setForeground(new java.awt.Color(255, 255, 255));
        Num_ord.setText("2 números >< ordenar");
        Num_ord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_ordActionPerformed(evt);
            }
        });

        Num_pri.setBackground(new java.awt.Color(153, 153, 0));
        Num_pri.setForeground(new java.awt.Color(255, 255, 255));
        Num_pri.setText("Número primo o no");
        Num_pri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_priActionPerformed(evt);
            }
        });

        Num_pares.setBackground(new java.awt.Color(153, 153, 0));
        Num_pares.setForeground(new java.awt.Color(255, 255, 255));
        Num_pares.setText("Números pares");
        Num_pares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_paresActionPerformed(evt);
            }
        });

        Fibo.setBackground(new java.awt.Color(153, 153, 0));
        Fibo.setForeground(new java.awt.Color(255, 255, 255));
        Fibo.setText("Metodo FIBONACCI");
        Fibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Txt_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(Txt_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Txt_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel2)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel4)
                                .addGap(102, 102, 102)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Txt_Out)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Num_pares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Num_pri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Num_ord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Vocal_cons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dias_sem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Par_impar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Asc_Des_Null, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pos_neg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(May_men_ig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pos_neg)
                        .addGap(33, 33, 33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Asc_Des_Null)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Par_impar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(May_men_ig)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dias_sem)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Vocal_cons)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Num_ord))
                    .addComponent(Txt_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Num_pri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Num_pares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fibo)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pos_negActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos_negActionPerformed
        //validamos que el numero cero sea nulo y se evalua el numero positivo y negativo
        Double num;
        String datoe;    
        int numero;
        num=Double.parseDouble(Txt_uno.getText());
        //num=Txt_uno.getText();
            if (num==0)
            {
                System.out.println("Nulo");
                Txt_Out.setText("Nulo");
            }
                else
            {
                if(num>0)
                {
                System.out.println("El numero "+num+" es positivo");
                Txt_Out.setText("El numero "+num+" es positivo");
                }
                else
                if(num<0)
                {
                System.out.println("El numero "+num+" es negativo");
                Txt_Out.setText("El numero "+num+" es negativo");
                }
                 
            }
    }//GEN-LAST:event_Pos_negActionPerformed

    private void Asc_Des_NullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asc_Des_NullActionPerformed
//incompleto
        String cad;
     Double num,numa,numb,numc,alto,medio,bajo;
     int i;
             numa=Double.parseDouble(Txt_uno.getText());
             numb=Double.parseDouble(Txt_dos.getText());
             numc=Double.parseDouble(Txt_tres.getText());
             
                if(numa>numb && numa>numc){
                System.out.println("Los numeros son descendentes: ");
                Txt_Out.setText("Los numeros son descendentes: ");
                    alto=numa;
                    
                }
                else
                if(numb>numa && numb>numc){
                System.out.println("Los numeros son mezclados: ");
                Txt_Out.setText("Los numeros son mezclados: ");    
                    alto=numb;
                }
                else
                alto=numc;

                if(numa<numb && numa<numc){
                System.out.println("Los numeros son ascendentes: ");
                Txt_Out.setText("Los numeros son ascendentes: ");    
                    bajo=numa;
                }
                else
                if(numb<numa && numb<numc){
                System.out.println("Los numeros son mezclados: ");
                Txt_Out.setText("Los numeros son mezclados: ");    
                    bajo=numb;
                }
                else{
                bajo=numc;
                }
                //medio=(numa+numb+numc)-(alto+bajo); ordena los numeros
                //System.out.println("");
               // Txt_Out.setText("");
                //System.out.println("El ascendente de los numeros ingresados es: ");
                //System.out.println(bajo+" "+medio+" "+alto);
               // Txt_Out.setText("El ascendente de los numeros ingresados es: "+bajo+" "+medio+" "+alto);

        // TODO add your handling code here:
    }//GEN-LAST:event_Asc_Des_NullActionPerformed

    private void Par_imparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Par_imparActionPerformed
        //tomo par e impar o nulo
        Double num;
        String datoe;    
        num=Double.parseDouble(Txt_uno.getText());
            if (num==0)
            {
                System.out.println("Nulo");
                Txt_Out.setText("Nulo");
            }
                else
            {
                if(num%2==0)
                {
                System.out.println("El numero "+num+" es par");
                Txt_Out.setText("El numero "+num+" es par");
                }
                else
                {
                System.out.println("El numero "+num+" es impar");
                Txt_Out.setText("El numero "+num+" es impar");
                }
                    
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_Par_imparActionPerformed

    private void May_men_igActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_May_men_igActionPerformed
//mayor menor o igual que cien
        Double num;
        String datoe;    
        num=Double.parseDouble(Txt_uno.getText());
            if (num==0)
            {
                System.out.println("Cero");
                Txt_Out.setText("Cero");
            }
                else
            {
                if(num==100)
                {
                System.out.println("El numero "+num+" es igual a 100");
                Txt_Out.setText("El numero "+num+" es igual a 100");
                }
                else
                if(num>100)
                {
                System.out.println("El numero "+num+" es mayor a 100");
                Txt_Out.setText("El numero "+num+" es mayor a 100");
                }
                else
                {
                System.out.println("El numero "+num+" es menor a 100");
                Txt_Out.setText("El numero "+num+" es menor a 100");
                }
                    
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_May_men_igActionPerformed

    private void Dias_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dias_semActionPerformed
//identificar días de la semana
        Double num;
        String datoe;    
        num=Double.parseDouble(Txt_uno.getText());
        if (num==0)
            {
                System.out.println("Cero");
                Txt_Out.setText("Cero");
            }
        else
        {
        if (num==1)
            {
                System.out.println("El día "+num+": corresponde al Lúmes ");
                Txt_Out.setText("El día "+num+": corresponde al Lúmes");
            }
                else
                if(num==2)
                {
                System.out.println("El día "+num+": corresponde al Martes ");
                Txt_Out.setText("El día "+num+": corresponde al Martes ");
                }
                else          
                if(num==3)
                {
                System.out.println("El día "+num+": corresponde al Miercoles ");
                Txt_Out.setText("El día "+num+": corresponde al Miercoles ");
                }        
                else
                if(num==4)
                {
                System.out.println("El día "+num+": corresponde al Jueves ");
                Txt_Out.setText("El día "+num+": corresponde al Jueves ");
                }
                else
                if(num==5)
                {
                System.out.println("El día "+num+": corresponde al Viernes ");
                Txt_Out.setText("El día "+num+": corresponde al Viernes ");
                }
                else
                if(num==6)
                {
                System.out.println("El día "+num+": corresponde al Sábado ");
                Txt_Out.setText("El día "+num+": corresponde al Sábado ");
                }
                else
                if(num==7)
                {
                System.out.println("El día "+num+": corresponde al Domingo ");
                Txt_Out.setText("El día "+num+": corresponde al Domingo ");
                }
                else
                if(num>7)
                {
                System.out.println("El día "+num+": no corresponde a ningún día ");
                Txt_Out.setText("El día "+num+": no corresponde a ningún día ");
                }
                else
                if(num<7)
                {
                System.out.println("El día "+num+": no corresponde a ningún día ");
                Txt_Out.setText("El día "+num+": no corresponde a ningún día ");
                }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Dias_semActionPerformed

    private void Vocal_consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vocal_consActionPerformed
//vocal o consonante 
String letra;
letra=Txt_uno.getText();
if (Txt_uno.getText().equals("a")||Txt_uno.getText().equals("e")||Txt_uno.getText().equals("i")||Txt_uno.getText().equals("o")||Txt_uno.getText().equals("u")||Txt_uno.getText().equals("A")||Txt_uno.getText().equals("E")||Txt_uno.getText().equals("I")||Txt_uno.getText().equals("O")||Txt_uno.getText().equals("U"))
    {
    System.out.println(letra+": es vocal ");
    Txt_Out.setText(letra+": es vocal ");
    }
        else
    {
        System.out.println(letra+": es consonante ");
        Txt_Out.setText(letra+": consonante ");
    }
      
         
//char caracter = cadena.charAt(Txt_uno.getText());
//if(letra.length()=='a'||letra.length()=='e'||letra.length()=='i'||letra.length()=='o'||letra.length()=='u'||letra.length()=='A'||letra.length()=='E'||letra.length()=='I'||letra.length()=='O'||letra.length()=='U')
//{
//    System.out.println(letra+": es vocal ");
//    Txt_Out.setText(letra+": es vocal ");
//}
//else

 //   System.out.println(letra+": es consonante ");
  //  Txt_Out.setText(letra+": consonante ");
        // TODO add your handling code here:
    }//GEN-LAST:event_Vocal_consActionPerformed

    private void Num_ordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_ordActionPerformed
        Double num, num2,res,res2;
        String datoe;    
        num=Double.parseDouble(Txt_uno.getText());
        num2=Double.parseDouble(Txt_dos.getText());
        if (num==0 || num2==0)
            {
                System.out.println("Cero");
                Txt_Out.setText("Cero");
            }
        else
        {
        if (num>num2)
            {
                res2=num;
                res=num2;
                System.out.println("El número menor "+res+" y el número mayor es "+res2);
                Txt_Out.setText("El número menor "+res+" y el número mayor es "+res2);
            }
        else
        {
            System.out.println("El número menor "+num+" y el número mayor es "+num2);
            Txt_Out.setText("El número menor "+num+" y el número mayor es "+num2);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Num_ordActionPerformed

    private void Num_priActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_priActionPerformed
Double num;
int i,a=0;
num=Double.parseDouble(Txt_uno.getText());
    for(i=1;i<=num;i++){
        if(num % i==0)
        {
            a++;
        }
        }
    if(a != 2)
    {
        System.out.println("El número "+num+" No Es primo");
        Txt_Out.setText("El número "+num+" No Es primo");
    }
    else
    {
        System.out.println("El número "+num+"  Es primo");
        Txt_Out.setText("El número "+num+"  Es primo");
    }


        // TODO add your handling code here:
    }//GEN-LAST:event_Num_priActionPerformed

    private void Num_paresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_paresActionPerformed
    Double num, canti;
    String cant;
    int i;
        cant = JOptionPane.showInputDialog(null,"Cuantos números desea ingresar: ");
        canti=Double.parseDouble(cant);
           for (i=1; i<=canti; i++){
           if(i%2 == 0){
            Txt_Out.setText(Txt_Out.getText()+ "  " +  i); //concatena todos los datos pares  
            System.out.println(Txt_Out.getText()+ "  " +  i);
                        }     
            }
         //este  codigo sirve para contar los pares
         /*int cant, num, pares=0, impares=0;  
         System.out.print("Cuantos numeros desea ingresar: ");
         Scanner scanner = new Scanner(System.in);
         cant = scanner.nextInt();
         for(int i=1; i<=cant; i++){
             System.out.print("Ingresar numero " + i + " de " + cant + ":  ");
             num =  (new Scanner(System.in)).nextInt();
             if(num%2 == 0)
                  pares++;
             else
                  impares++;             
         }
         //Txt_Out.setText(eti_uno.getText()+ "  " +  m);
         System.out.println("\nCantidad de numeros pares: " + pares);
         System.out.println("Cantidad de numeros impares: " + impares);  
        */
        
        



        // TODO add your handling code here:
    }//GEN-LAST:event_Num_paresActionPerformed

    private void FiboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiboActionPerformed
   Double num, canti;
    String cant;
    int i,numfibo,numfibo2;
        cant = JOptionPane.showInputDialog(null,"Cuantos números desea en el ciclo FIBONACCI: ");
        canti=Double.parseDouble(cant);
        numfibo=1;
        numfibo2=1;
           if (canti==0)
           {
            Txt_Out.setText(Txt_Out.getText()+ "Ingrese un número mayor que uno  " );  
            System.out.println(Txt_Out.getText()+ "Ingrese un número mayor que uno  ");
           }
           else{
           Txt_Out.setText("");//limpiar
           for (i=1; i<=canti; i++){
            if(i>=1){
            numfibo2=numfibo+numfibo2;
            numfibo=numfibo2-numfibo;
            Txt_Out.setText(Txt_Out.getText()+ "  " + numfibo2 + " "); 
            System.out.println(Txt_Out.getText()+ "  " + numfibo2 + " ");
                        }     
           }
           }
         
// TODO add your handling code here:
    }//GEN-LAST:event_FiboActionPerformed

   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario_Taller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Taller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Taller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Taller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Taller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Asc_Des_Null;
    private javax.swing.JButton Dias_sem;
    private javax.swing.JButton Fibo;
    private javax.swing.JButton May_men_ig;
    private javax.swing.JButton Num_ord;
    private javax.swing.JButton Num_pares;
    private javax.swing.JButton Num_pri;
    private javax.swing.JButton Par_impar;
    private javax.swing.JButton Pos_neg;
    private javax.swing.JTextField Txt_Out;
    private javax.swing.JTextField Txt_dos;
    private javax.swing.JTextField Txt_tres;
    private javax.swing.JTextField Txt_uno;
    private javax.swing.JButton Vocal_cons;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
