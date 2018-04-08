package TallerPPO;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class FormularioT extends javax.swing.JFrame {
//declaro variables para todo
    String dato, dato2, opera;
    Operaciones obj;

    public FormularioT() {
        initComponents();
        //constructor
        obj =new Operaciones();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Asc_Des_Null = new javax.swing.JButton();
        Num_ord = new javax.swing.JButton();
        Par_impar = new javax.swing.JButton();
        Num_pares = new javax.swing.JButton();
        May_men_ig = new javax.swing.JButton();
        Fibo = new javax.swing.JButton();
        Dias_sem = new javax.swing.JButton();
        Num_pri = new javax.swing.JButton();
        Vocal_cons = new javax.swing.JButton();
        Pos_neg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Txt_uno = new javax.swing.JTextField();
        Txt_tres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txt_dos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_Out = new javax.swing.JTextField();
        Asc_Des_Null1 = new javax.swing.JButton();
        Num_ord1 = new javax.swing.JButton();
        Par_impar1 = new javax.swing.JButton();
        Num_pares1 = new javax.swing.JButton();
        May_men_ig1 = new javax.swing.JButton();
        Fibo1 = new javax.swing.JButton();
        Dias_sem1 = new javax.swing.JButton();
        Num_pri1 = new javax.swing.JButton();
        Vocal_cons1 = new javax.swing.JButton();
        Pos_neg1 = new javax.swing.JButton();

        Asc_Des_Null.setBackground(new java.awt.Color(153, 153, 0));
        Asc_Des_Null.setForeground(new java.awt.Color(255, 255, 255));
        Asc_Des_Null.setText("ascendente, descendente o nulo");
        Asc_Des_Null.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asc_Des_NullActionPerformed(evt);
            }
        });

        Num_ord.setBackground(new java.awt.Color(153, 153, 0));
        Num_ord.setForeground(new java.awt.Color(255, 255, 255));
        Num_ord.setText("2 números >< ordenar");
        Num_ord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_ordActionPerformed(evt);
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

        Num_pares.setBackground(new java.awt.Color(153, 153, 0));
        Num_pares.setForeground(new java.awt.Color(255, 255, 255));
        Num_pares.setText("Numeros pares");
        Num_pares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_paresActionPerformed(evt);
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

        Fibo.setBackground(new java.awt.Color(153, 153, 0));
        Fibo.setForeground(new java.awt.Color(255, 255, 255));
        Fibo.setText("Metodo FIBONACCI");
        Fibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiboActionPerformed(evt);
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

        Num_pri.setText("Numero primo o no");
        Num_pri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_priActionPerformed(evt);
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

        Pos_neg.setBackground(new java.awt.Color(153, 153, 0));
        Pos_neg.setForeground(new java.awt.Color(255, 255, 255));
        Pos_neg.setText("positivo o negativo");
        Pos_neg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos_negActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("TALLER PROGRAMACIÓN ORIENTADA A OBJETOS");

        jLabel5.setText("Valor 3");

        jLabel2.setText("Valor 1");

        jLabel4.setText("Valor 2");

        jLabel3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel3.setText("Resultado");

        Asc_Des_Null1.setBackground(new java.awt.Color(153, 153, 0));
        Asc_Des_Null1.setForeground(new java.awt.Color(255, 255, 255));
        Asc_Des_Null1.setText("ascendente, descendente o nulo");
        Asc_Des_Null1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asc_Des_Null1ActionPerformed(evt);
            }
        });

        Num_ord1.setBackground(new java.awt.Color(153, 153, 0));
        Num_ord1.setForeground(new java.awt.Color(255, 255, 255));
        Num_ord1.setText("2 números >< ordenar");
        Num_ord1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_ord1ActionPerformed(evt);
            }
        });

        Par_impar1.setBackground(new java.awt.Color(153, 153, 0));
        Par_impar1.setForeground(new java.awt.Color(255, 255, 255));
        Par_impar1.setText("Par o impar");
        Par_impar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Par_impar1ActionPerformed(evt);
            }
        });

        Num_pares1.setBackground(new java.awt.Color(153, 153, 0));
        Num_pares1.setForeground(new java.awt.Color(255, 255, 255));
        Num_pares1.setText("Numeros pares");
        Num_pares1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_pares1ActionPerformed(evt);
            }
        });

        May_men_ig1.setBackground(new java.awt.Color(153, 153, 0));
        May_men_ig1.setForeground(new java.awt.Color(255, 255, 255));
        May_men_ig1.setText("mayor, menor o igual a 100");
        May_men_ig1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                May_men_ig1ActionPerformed(evt);
            }
        });

        Fibo1.setBackground(new java.awt.Color(153, 153, 0));
        Fibo1.setForeground(new java.awt.Color(255, 255, 255));
        Fibo1.setText("Metodo FIBONACCI");
        Fibo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fibo1ActionPerformed(evt);
            }
        });

        Dias_sem1.setBackground(new java.awt.Color(153, 153, 0));
        Dias_sem1.setForeground(new java.awt.Color(255, 255, 255));
        Dias_sem1.setText("Identificar día de la Semana");
        Dias_sem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dias_sem1ActionPerformed(evt);
            }
        });

        Num_pri1.setBackground(new java.awt.Color(153, 153, 0));
        Num_pri1.setForeground(new java.awt.Color(255, 255, 255));
        Num_pri1.setText("Numero primo o no");
        Num_pri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_pri1ActionPerformed(evt);
            }
        });

        Vocal_cons1.setBackground(new java.awt.Color(153, 153, 0));
        Vocal_cons1.setForeground(new java.awt.Color(255, 255, 255));
        Vocal_cons1.setText("Vocal o consonante");
        Vocal_cons1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vocal_cons1ActionPerformed(evt);
            }
        });

        Pos_neg1.setBackground(new java.awt.Color(153, 153, 0));
        Pos_neg1.setForeground(new java.awt.Color(255, 255, 255));
        Pos_neg1.setText("positivo o negativo");
        Pos_neg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos_neg1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(224, 224, 224))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Txt_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel2)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel4)
                                .addGap(102, 102, 102)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Txt_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Num_pri1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Fibo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Num_pares1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Num_ord1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Vocal_cons1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Dias_sem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Par_impar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Asc_Des_Null1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pos_neg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(May_men_ig1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Txt_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pos_neg1)
                        .addGap(18, 18, 18)
                        .addComponent(Asc_Des_Null1)
                        .addGap(18, 18, 18)
                        .addComponent(Par_impar1)
                        .addGap(17, 17, 17)
                        .addComponent(May_men_ig1)
                        .addGap(18, 18, 18)
                        .addComponent(Dias_sem1)
                        .addGap(18, 18, 18)
                        .addComponent(Vocal_cons1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Num_ord1)
                        .addGap(11, 11, 11)
                        .addComponent(Num_pri1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Num_pares1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fibo1)))
                .addGap(0, 80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Asc_Des_NullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asc_Des_NullActionPerformed
    
    }//GEN-LAST:event_Asc_Des_NullActionPerformed

    private void Num_ordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_ordActionPerformed
        
    }//GEN-LAST:event_Num_ordActionPerformed

    private void Par_imparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Par_imparActionPerformed
       
    }//GEN-LAST:event_Par_imparActionPerformed

    private void Num_paresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_paresActionPerformed
    
    }//GEN-LAST:event_Num_paresActionPerformed

    private void May_men_igActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_May_men_igActionPerformed
        
    }//GEN-LAST:event_May_men_igActionPerformed

    private void FiboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiboActionPerformed
    
    }//GEN-LAST:event_FiboActionPerformed

    private void Dias_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dias_semActionPerformed

    }//GEN-LAST:event_Dias_semActionPerformed

    private void Num_priActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_priActionPerformed
    
    }//GEN-LAST:event_Num_priActionPerformed

    private void Vocal_consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vocal_consActionPerformed
    
    }//GEN-LAST:event_Vocal_consActionPerformed

    private void Pos_negActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos_negActionPerformed
    
    }//GEN-LAST:event_Pos_negActionPerformed

    private void Asc_Des_Null1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asc_Des_Null1ActionPerformed
        //numeros ascendentes o descendentes
        String resultado;
        Txt_Out.setText("");//limpiar
        obj.valu.setDato(Txt_uno.getText());
        JOptionPane.showMessageDialog(null, obj.valu.getDato()+"  Dato uno a evaluar");//valido sei me esta guardando en la caja uno
        obj.vald.setDato2(Txt_dos.getText());
        JOptionPane.showMessageDialog(null, obj.vald.getDato2()+"  Dato dos a evaluar");//valido sei me esta guardando en la caja uno        
        obj.valt.setDato3(Txt_tres.getText());
        JOptionPane.showMessageDialog(null, obj.valt.getDato3()+"  Dato tres a evaluar");//valido sei me esta guardando en la caja uno    
        Operaciones obj1=new Operaciones(); //instancio
        resultado=obj1.calc_ascdesnu(obj.valu.getDato(),obj.vald.getDato2(),obj.valt.getDato3());
        JOptionPane.showMessageDialog(null,"Resultado: "+ resultado); //valido que me esta guardando
        Txt_Out.setText(resultado);
        System.out.println(resultado); //imprimo    
    }//GEN-LAST:event_Asc_Des_Null1ActionPerformed

    private void Num_ord1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_ord1ActionPerformed
        //ordenar numeros
        String resultado;
        Txt_Out.setText("");//limpiar
        obj.valu.setDato(Txt_uno.getText());
        obj.vald.setDato2(Txt_dos.getText());
        JOptionPane.showMessageDialog(null, obj.valu.getDato()+"  Dato uno a evaluar");//valido sei me esta guardando en la caja uno
        JOptionPane.showMessageDialog(null, obj.vald.getDato2()+"  Dato dos a evaluar");//valido sei me esta guardando en la caja uno
        Operaciones obj1=new Operaciones(); //instancio
        resultado=obj1.calc_ordnum(obj.valu.getDato(),obj.vald.getDato2());
        JOptionPane.showMessageDialog(null,"Resultado: "+ resultado); //valido que me esta guardando
        Txt_Out.setText(resultado);
        System.out.println(resultado); //imprimo
    }//GEN-LAST:event_Num_ord1ActionPerformed

    private void Par_impar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Par_impar1ActionPerformed
        //tomo par e impar o nulo
        String resultado;
        Txt_Out.setText("");//limpiar
        obj.valu.setDato(Txt_uno.getText());
        JOptionPane.showMessageDialog(null, obj.valu.getDato()+"  Dato uno a evaluar");//valido sei me esta guardando en la caja uno
        Operaciones obj1=new Operaciones(); //instancio 
        resultado=obj1.calc_primo(obj.valu.getDato());
        JOptionPane.showMessageDialog(null,"Resultado: "+ resultado); //valido que me esta guardando
        Txt_Out.setText(resultado);
        System.out.println(resultado); //imprimo
    }//GEN-LAST:event_Par_impar1ActionPerformed

    private void Num_pares1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_pares1ActionPerformed
        //Numero pares
        Double num, canti;
        String cant;
        int i;
        Txt_Out.setText("");//limpiar
        cant = JOptionPane.showInputDialog(null,"Cuantos números desea ingresar: ");
        canti=Double.parseDouble(cant);
        for (i=1; i<=canti; i++){
            if(i%2 == 0){
                Txt_Out.setText(Txt_Out.getText()+ "  " +  i); //concatena todos los datos pares
                System.out.println(Txt_Out.getText()+ "  " +  i);
            }
        }
    }//GEN-LAST:event_Num_pares1ActionPerformed

    private void May_men_ig1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_May_men_ig1ActionPerformed
        //mayor menor o igual que cien
        String resultado;
        Txt_Out.setText("");//limpiar
        obj.valu.setDato(Txt_uno.getText());
        JOptionPane.showMessageDialog(null, obj.valu.getDato()+"  Dato uno a evaluar");//valido sei me esta guardando en la caja uno
        Operaciones obj1=new Operaciones(); //instancio
        resultado=obj1.calc_maymenig(obj.valu.getDato());
        JOptionPane.showMessageDialog(null,"Resultado: "+ resultado); //valido que me esta guardando
        Txt_Out.setText(resultado);
        System.out.println(resultado); //imprimo
    }//GEN-LAST:event_May_men_ig1ActionPerformed

    private void Fibo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fibo1ActionPerformed
        //ciclo fibonacci
        Double num, canti;
        String cant;
        Txt_Out.setText("");//limpiar
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
    }//GEN-LAST:event_Fibo1ActionPerformed

    private void Dias_sem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dias_sem1ActionPerformed
        //identificar días de la semana
        String resultado;
        Txt_Out.setText("");//limpiar
        obj.valu.setDato(Txt_uno.getText());
        JOptionPane.showMessageDialog(null, obj.valu.getDato()+"  Dato uno a evaluar");//valido sei me esta guardando en la caja uno
        Operaciones obj1=new Operaciones(); //instancio
        resultado=obj1.calc_diasem(obj.valu.getDato());
        JOptionPane.showMessageDialog(null,"Resultado: "+ resultado); //valido que me esta guardando
        Txt_Out.setText(resultado);
        System.out.println(resultado); //imprimo
    }//GEN-LAST:event_Dias_sem1ActionPerformed

    private void Num_pri1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_pri1ActionPerformed
        //numero primo
        String resultado;
        Txt_Out.setText("");//limpiar        
        obj.valu.setDato(Txt_uno.getText());
        JOptionPane.showMessageDialog(null, obj.valu.getDato()+"  Dato uno a evaluar");//valido sei me esta guardando en la caja uno
        Operaciones obj1=new Operaciones(); //instancio
        resultado=obj1.calc_primos(obj.valu.getDato());
        JOptionPane.showMessageDialog(null,"Resultado: "+ resultado); //valido que me esta guardando
        Txt_Out.setText(resultado);
        System.out.println(resultado); //imprimo
        
    }//GEN-LAST:event_Num_pri1ActionPerformed

    private void Vocal_cons1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vocal_cons1ActionPerformed
       //vocal o consonante
        String resultado;
        Txt_Out.setText("");//limpiar
        obj.valu.setDato(Txt_uno.getText());
        JOptionPane.showMessageDialog(null, obj.valu.getDato()+" Dato uno a evaluar");//valido sei me esta guardando en la caja uno
        Operaciones obj1=new Operaciones(); //instancio
        resultado=obj1.calc_voccons(obj.valu.getDato());
        JOptionPane.showMessageDialog(null,"Resultado: "+ resultado); //valido que me esta guardando
        Txt_Out.setText(resultado);
        System.out.println(resultado); //imprimo
    }//GEN-LAST:event_Vocal_cons1ActionPerformed

    private void Pos_neg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos_neg1ActionPerformed
        //validamos que el numero cero sea nulo y se evalua el numero positivo y negativo
        String resultado;
        Txt_Out.setText("");//limpiar        
        obj.valu.setDato(Txt_uno.getText());
        JOptionPane.showMessageDialog(null, obj.valu.getDato()+"  Dato uno a evaluar");//valido sei me esta guardando en la caja uno
        Operaciones obj1=new Operaciones(); //instancio
        resultado=obj1.calc_prim(obj.valu.getDato());
        JOptionPane.showMessageDialog(null,"Resultado: "+ resultado); //valido que me esta guardando
        Txt_Out.setText(resultado);
        System.out.println(resultado); //imprimo    
    }//GEN-LAST:event_Pos_neg1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Asc_Des_Null;
    private javax.swing.JButton Asc_Des_Null1;
    private javax.swing.JButton Dias_sem;
    private javax.swing.JButton Dias_sem1;
    private javax.swing.JButton Fibo;
    private javax.swing.JButton Fibo1;
    private javax.swing.JButton May_men_ig;
    private javax.swing.JButton May_men_ig1;
    private javax.swing.JButton Num_ord;
    private javax.swing.JButton Num_ord1;
    private javax.swing.JButton Num_pares;
    private javax.swing.JButton Num_pares1;
    private javax.swing.JButton Num_pri;
    private javax.swing.JButton Num_pri1;
    private javax.swing.JButton Par_impar;
    private javax.swing.JButton Par_impar1;
    private javax.swing.JButton Pos_neg;
    private javax.swing.JButton Pos_neg1;
    private javax.swing.JTextField Txt_Out;
    private javax.swing.JTextField Txt_dos;
    private javax.swing.JTextField Txt_tres;
    private javax.swing.JTextField Txt_uno;
    private javax.swing.JButton Vocal_cons;
    private javax.swing.JButton Vocal_cons1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
