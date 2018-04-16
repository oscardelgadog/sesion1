import javax.swing.JOptionPane;

public class Mod_Juego extends javax.swing.JFrame {
public static int partidas;

int Num1, num2, empate,numeropart;
    private static void JOptionPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Juego obj;
    
    public Mod_Juego() {  //constructor
        initComponents();
        obj=new Juego();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Jug_uno_pi = new javax.swing.JButton();
        Jug_uno_pa = new javax.swing.JButton();
        Jug_uno_ti = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_out = new javax.swing.JTextField();
        Jug_dos_pi = new javax.swing.JButton();
        Jug_dos_pa = new javax.swing.JButton();
        Jug_dos_ti = new javax.swing.JButton();
        txt_out1 = new javax.swing.JTextField();
        txt_out_fi = new javax.swing.JTextField();
        Evaluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        con_u = new javax.swing.JTextField();
        con_d = new javax.swing.JTextField();
        emp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(new java.awt.Color(0, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PIEDRA - PAPEL - TIJERA por Oscar Delgado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bodoni MT Black", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        Jug_uno_pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piedra.jpg"))); // NOI18N
        Jug_uno_pi.setText("Piedra");
        Jug_uno_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jug_uno_piActionPerformed(evt);
            }
        });

        Jug_uno_pa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/papel.jpg"))); // NOI18N
        Jug_uno_pa.setText("Papel");
        Jug_uno_pa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jug_uno_paActionPerformed(evt);
            }
        });

        Jug_uno_ti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tijera.jpg"))); // NOI18N
        Jug_uno_ti.setText("Tijera");
        Jug_uno_ti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jug_uno_tiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jugador uno");

        txt_out.setBackground(new java.awt.Color(255, 255, 153));
        txt_out.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        Jug_dos_pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piedra.jpg"))); // NOI18N
        Jug_dos_pi.setText("Piedra");
        Jug_dos_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jug_dos_piActionPerformed(evt);
            }
        });

        Jug_dos_pa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/papel.jpg"))); // NOI18N
        Jug_dos_pa.setText("Papel");
        Jug_dos_pa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jug_dos_paActionPerformed(evt);
            }
        });

        Jug_dos_ti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tijera.jpg"))); // NOI18N
        Jug_dos_ti.setText("Tijera");
        Jug_dos_ti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jug_dos_tiActionPerformed(evt);
            }
        });

        txt_out1.setBackground(new java.awt.Color(255, 255, 153));
        txt_out1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        txt_out_fi.setBackground(new java.awt.Color(153, 153, 255));
        txt_out_fi.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        txt_out_fi.setForeground(new java.awt.Color(0, 0, 102));

        Evaluar.setBackground(new java.awt.Color(204, 204, 0));
        Evaluar.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Evaluar.setText("Evaluar");
        Evaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvaluarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jugador dos");

        con_u.setBackground(new java.awt.Color(255, 255, 153));
        con_u.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        con_u.setForeground(new java.awt.Color(0, 0, 102));

        con_d.setBackground(new java.awt.Color(255, 255, 153));
        con_d.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        con_d.setForeground(new java.awt.Color(0, 0, 102));
        con_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con_dActionPerformed(evt);
            }
        });

        emp.setBackground(new java.awt.Color(255, 255, 153));
        emp.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EMPATES");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CUN.png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/01.gif"))); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/02.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addComponent(con_u, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(66, 66, 66)
                .addComponent(con_d, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jug_uno_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_out)
                    .addComponent(Jug_uno_pa, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jug_uno_ti, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(Jug_dos_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jug_dos_pa, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_out1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jug_dos_ti, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(519, 519, 519)
                        .addComponent(txt_out_fi, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(emp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(434, 434, 434)
                        .addComponent(Evaluar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(con_u, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(con_d, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jug_uno_pi)
                    .addComponent(Jug_uno_pa)
                    .addComponent(Jug_uno_ti)
                    .addComponent(Jug_dos_pi)
                    .addComponent(Jug_dos_pa)
                    .addComponent(Jug_dos_ti))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_out1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_out, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_out_fi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Evaluar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(emp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addComponent(jButton1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvaluarActionPerformed

        String lol = "partidas ingresadas"+partidas + " VS  Partidas jugadas" + numeropart;
        JOptionPane.showMessageDialog(null, lol);
    if(numeropart < partidas )
    {//evalua las opciones   
            String resultado; //variable que me guarda los valores de los objetos Jugador uno y jugador dos
             obj.jugador1.setOpc(txt_out.getText());  //guardo en los objeto lo que tengo en el cuadro de texto uno
             obj.jugador2.setOpc2(txt_out1.getText()); //guardo en los objeto lo que tengo en el cuadro de texto udos

             Juego obj1 = new Juego(); //instancio un nuevo objeto el obj1
             resultado=obj1.Evaluar(obj.jugador1.getOpc(),obj.jugador2.getOpc2()); //traigo el dato
             txt_out_fi.setText(resultado);//imprimo el resultado
             String mens,jj;
             mens=resultado;
             if(mens=="empate")
             {
                 JOptionPane.showMessageDialog(null,"Nadie ganó");
                 empate++;
                 emp.setText(""+ empate);
             }
             else if(resultado.contains("ganaste jugador dos")){
                  JOptionPane.showMessageDialog(null,"Ganó jugador 2");
                  num2++;
                  con_d.setText(""+num2);
             }else{
                 JOptionPane.showMessageDialog(null,"Ganó jugador 1");
                 Num1++;
                  con_u.setText(""+Num1);
             }

              Puntaje obj2 = new Puntaje(); //instancio el obj2
              obj2.puntaje1.setTxt(txt_out_fi.getText());//guardo en el obj2 lo que tengo en el cuadro de texto final

              Puntaje txt = new Puntaje(); //instancio un nuevo objeto el obj1 
              resultado=txt.Guardar(obj2.puntaje1.getTxt());//aqui ejecuto el metodo puntaje uno que guarda en el Txt
              numeropart++;
    }
    else
    {
    JOptionPane.showMessageDialog(null,"Fin del Juego");
    System.exit(0);
    }
    
    }//GEN-LAST:event_EvaluarActionPerformed

    private void Jug_uno_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jug_uno_piActionPerformed
    txt_out.setText("");
        txt_out.setText(txt_out.getText()+"Piedra");
        // TODO add your handling code here:
    }//GEN-LAST:event_Jug_uno_piActionPerformed

    private void Jug_uno_paActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jug_uno_paActionPerformed
    txt_out.setText("");   
    txt_out.setText(txt_out.getText()+"Papel");
// TODO add your handling code here:
    }//GEN-LAST:event_Jug_uno_paActionPerformed

    private void Jug_uno_tiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jug_uno_tiActionPerformed
  txt_out.setText("");
        txt_out.setText(txt_out.getText()+"Tijera");
        // TODO add your handling code here:
    }//GEN-LAST:event_Jug_uno_tiActionPerformed

    private void Jug_dos_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jug_dos_piActionPerformed
 txt_out1.setText("");
        txt_out1.setText(txt_out1.getText()+"Piedra");
        // TODO add your handling code here:
    }//GEN-LAST:event_Jug_dos_piActionPerformed

    private void Jug_dos_paActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jug_dos_paActionPerformed
txt_out1.setText("");
        txt_out1.setText(txt_out1.getText()+"Papel");
        // TODO add your handling code here:
    }//GEN-LAST:event_Jug_dos_paActionPerformed

    private void Jug_dos_tiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jug_dos_tiActionPerformed
txt_out1.setText("");
        txt_out1.setText(txt_out1.getText()+"Tijera");
        // TODO add your handling code here:
    }//GEN-LAST:event_Jug_dos_tiActionPerformed

    private void con_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_con_dActionPerformed

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
            java.util.logging.Logger.getLogger(Mod_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mod_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mod_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mod_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
JOptionPane.showMessageDialog(null, "Bienvenidos al Juego PIEDRA - PAPEL - TIJERA, BY Oscar Delgado!!!");
Double num, canti;
        String cant, numerop;
        cant = JOptionPane.showInputDialog(null,"Cuantos partidas desea Jugar?: ");
        canti=Double.parseDouble(cant);
        partidas = Integer.parseInt(cant);
        if (canti==0)
        {
        
            JOptionPane.showMessageDialog(null,"Ingrese un número mayor que uno, el juego no se iniciará  ");
           System.exit(0);
        }
        else{
            num=canti;
            //numeropart=canti;
           JOptionPane.showMessageDialog(null,"gracias, Se iniciará el Juego. BIENVENIDOS  ");
           
            }
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mod_Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Evaluar;
    private javax.swing.JButton Jug_dos_pa;
    private javax.swing.JButton Jug_dos_pi;
    private javax.swing.JButton Jug_dos_ti;
    private javax.swing.JButton Jug_uno_pa;
    private javax.swing.JButton Jug_uno_pi;
    private javax.swing.JButton Jug_uno_ti;
    private javax.swing.JTextField con_d;
    private javax.swing.JTextField con_u;
    private javax.swing.JTextField emp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_out;
    private javax.swing.JTextField txt_out1;
    private javax.swing.JTextField txt_out_fi;
    // End of variables declaration//GEN-END:variables

}
