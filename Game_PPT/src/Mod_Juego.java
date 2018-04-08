import javax.swing.JOptionPane;

public class Mod_Juego extends javax.swing.JFrame {
    Juego obj;
    
    public Mod_Juego() {  //constructor
        initComponents();
        obj=new Juego();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Jug_uno_pi = new javax.swing.JButton();
        Jug_uno_pa = new javax.swing.JButton();
        Jug_uno_ti = new javax.swing.JButton();
        Jug_dos_ti = new javax.swing.JButton();
        Jug_dos_pi = new javax.swing.JButton();
        Jug_dos_pa = new javax.swing.JButton();
        txt_out = new javax.swing.JTextField();
        Evaluar = new javax.swing.JButton();
        txt_out1 = new javax.swing.JTextField();
        txt_out_fi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Jugador uno");

        jLabel2.setText("Jugador dos");

        Jug_uno_pi.setText("Piedra");
        Jug_uno_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jug_uno_piActionPerformed(evt);
            }
        });

        Jug_uno_pa.setText("Papel");
        Jug_uno_pa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jug_uno_paActionPerformed(evt);
            }
        });

        Jug_uno_ti.setText("Tijera");
        Jug_uno_ti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jug_uno_tiActionPerformed(evt);
            }
        });

        Jug_dos_ti.setText("Tijera");
        Jug_dos_ti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jug_dos_tiActionPerformed(evt);
            }
        });

        Jug_dos_pi.setText("Piedra");
        Jug_dos_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jug_dos_piActionPerformed(evt);
            }
        });

        Jug_dos_pa.setText("Papel");
        Jug_dos_pa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jug_dos_paActionPerformed(evt);
            }
        });

        Evaluar.setText("Evaluar");
        Evaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvaluarActionPerformed(evt);
            }
        });

        txt_out_fi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_out_fiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jug_uno_pi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Jug_uno_pa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jug_uno_ti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jug_dos_pi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jug_dos_pa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Jug_dos_ti))
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_out, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addComponent(txt_out1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(Evaluar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(txt_out_fi, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jug_uno_pi)
                    .addComponent(Jug_uno_pa)
                    .addComponent(Jug_uno_ti)
                    .addComponent(Jug_dos_pi)
                    .addComponent(Jug_dos_pa)
                    .addComponent(Jug_dos_ti))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_out1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_out, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(txt_out_fi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(Evaluar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvaluarActionPerformed
//evalua las opciones
        String resultado; //variable que me guarda los valores de los objetos Jugador uno y jugador dos
         obj.jugador1.setOpc(txt_out.getText());  //guardo en los objeto lo que tengo en el cuadro de texto uno
         obj.jugador2.setOpc2(txt_out1.getText()); //guardo en los objeto lo que tengo en el cuadro de texto udos
         
         //JOptionPane.showMessageDialog(null,obj.jugador2.getOpc2()); //valido que me esta guardando
         Juego obj1 = new Juego(); //instancio un nuevo objeto el obj1
         resultado=obj1.Evaluar(obj.jugador1.getOpc(),obj.jugador2.getOpc2());
          txt_out_fi.setText(resultado);//imprimo el resultado
 

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

    private void txt_out_fiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_out_fiActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_out_fiActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_out;
    private javax.swing.JTextField txt_out1;
    private javax.swing.JTextField txt_out_fi;
    // End of variables declaration//GEN-END:variables

}
