
package Presentacion;
import javax.swing.JOptionPane;
public class Form_uno extends javax.swing.JFrame {
    public int Cont; 
    public String[] Nombre = new String[10];
    public Form_uno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_uno = new javax.swing.JTextField();
        txt_dos = new javax.swing.JTextField();
        txt_tres = new javax.swing.JTextField();
        eti_uno = new javax.swing.JLabel();
        eti_dos = new javax.swing.JLabel();
        eti_tres = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        eti_out = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_out = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_out2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        bot_sal1 = new javax.swing.JButton();
        bot_sal2 = new javax.swing.JButton();
        eti = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("ESTUDIANTES");

        eti_uno.setText("Nombres: ");

        eti_dos.setText("Apellidos: ");

        eti_tres.setText("Correo: ");

        jButton1.setText("GUARDAR E  IMPRIMIR EN PANTALLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        eti_out.setForeground(new java.awt.Color(0, 0, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Estudiante: ");

        txt_out.setColumns(20);
        txt_out.setRows(5);
        jScrollPane1.setViewportView(txt_out);

        jButton2.setText("CONSULTAR E IMPRIMIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_out2.setColumns(20);
        txt_out2.setRows(5);
        jScrollPane2.setViewportView(txt_out2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Estudiante: ");

        bot_sal1.setText("Cerrar Ventana");
        bot_sal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_sal1ActionPerformed(evt);
            }
        });

        bot_sal2.setText("Salir Aplicación");
        bot_sal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_sal2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eti_uno)
                    .addComponent(eti_dos)
                    .addComponent(eti_tres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_uno, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txt_dos)
                    .addComponent(txt_tres))
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(335, 335, 335))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eti, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bot_sal1)
                            .addComponent(bot_sal2))
                        .addGap(24, 24, 24))))
            .addGroup(layout.createSequentialGroup()
                .addGap(512, 512, 512)
                .addComponent(eti_out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_uno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_uno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_dos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_tres))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(11, 11, 11)
                .addComponent(eti_out, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bot_sal1)
                        .addGap(18, 18, 18)
                        .addComponent(bot_sal2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eti, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       

    
    if(Cont < 10)
        {
             Estudiante Per=new Estudiante();
             Per.setNombre(txt_uno.getText());
             Per.setApellido(txt_dos.getText());
             Per.setCorreo(txt_tres.getText());
             
             Nombre[Cont] = Per.Dato_Completo();   
             String Result = "";
             for(int a = 0; a <= Cont ; a++)
             {
                Result += Nombre[a]+ "\n"; 
             }
             txt_out2.setText(Result);
             Cont++;
             
             txt_uno.setText("");
             txt_dos.setText("");
             txt_tres.setText("");
        }else
        {
            JOptionPane.showMessageDialog(null, "Excedio la capacidad de inserción");
        }
    
    
    
    
    

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 //eti_out.setText(txt_uno.getText()+ " " + txt_dos.getText() + " correo: " +txt_tres.getText());
 
      // txt_out2.setText("Nombres: " + txt_uno.getText()+ " " + txt_dos.getText() + "     Correo: " +txt_tres.getText());//guarda e imprime
 
/*String[] Nombre=new String[10];
Nombre[0]="OSCAR DELGADO ";
Nombre[1]="LUIS DELGADO";
Nombre[2]="FERNANDO DELGADO";
Nombre[3]="ISABEL GUAQUETA ";
Nombre[4]="MAIRA COLMENARES";
Nombre[5]="JAVIER MERA";
Nombre[6]="GUILLERMO AVILA";
Nombre[7]="FERNANDO COLMENARES";
Nombre[8]="FERNANDO GUTIERREZ";
Nombre[9]="RUTH COLMENARES";
String[] Correo=new String[10];
Correo[0]="OSCAR_DELGADO@cun.edu.co ";
Correo[1]="LUIS_DELGADO@cun.edu.co";
Correo[2]="FERNANDO_DELGADO@cun.edu.co";
Correo[3]="ISABEL_GUAQUETA@cun.edu.co ";
Correo[4]="MAIRA_COLMENARES@cun.edu.co";
Correo[5]="JAVIER_MERA@cun.edu.co";
Correo[6]="GUILLERMO_AVILA@cun.edu.co";
Correo[7]="FERNANDO_COLMENARES@cun.edu.co";
Correo[8]="FERNANDO_GUTIERREZ@cun.edu.co";
Correo[9]="RUTH_COLMENARES@cun.edu.co";
        for (int i=0; i<10; i++)
      {
        txt_out2.setText(txt_out2.getText()+"Nombres: " + Nombre[i]  + "     Correo: " + Correo[i] +" ");  
      }
  */      

    Persona uno=new Persona();
      uno.setNombre("Luis Enrique ");
        uno.setApellido("Delgado Durán ");
        txt_out.setText(uno.nombre_completo());

    Estudiante estudianteuno=new Estudiante("CORREO: oscar.delgadog@cun.edu.co ");
    estudianteuno.setNombre("NOMBRES: Oscar Javier ");
    estudianteuno.setApellido("Delgado Guaqueta ");
    txt_out.setText(estudianteuno.Dato_Completo());
    



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bot_sal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_sal1ActionPerformed
        // TODO add your handling code here:
        dispose();//sirve para cerrar una sola ventana
        
    }//GEN-LAST:event_bot_sal1ActionPerformed

    private void bot_sal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_sal2ActionPerformed
        // TODO add your handling code here:
        System.exit(0); //sirve para salir de la aplicación
    }//GEN-LAST:event_bot_sal2ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_uno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_sal1;
    private javax.swing.JButton bot_sal2;
    private javax.swing.JLabel eti;
    private javax.swing.JLabel eti_dos;
    private javax.swing.JLabel eti_out;
    private javax.swing.JLabel eti_tres;
    private javax.swing.JLabel eti_uno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_dos;
    private javax.swing.JTextArea txt_out;
    private javax.swing.JTextArea txt_out2;
    private javax.swing.JTextField txt_tres;
    private javax.swing.JTextField txt_uno;
    // End of variables declaration//GEN-END:variables
}
