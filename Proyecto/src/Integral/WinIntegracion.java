/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integral;

import Ejecucion.Entrada;

/**
 *
 * @author GrevinSolorzano
 */
public final class WinIntegracion extends javax.swing.JFrame {

    /**
     * Creates new form WinIntegracion
     */
    public WinIntegracion() {
            
       initComponents();
       this.setLocationRelativeTo(null);
       btntranparente();
    }
    
    public void btntranparente(){
        btnsalir.setOpaque(true);
        btnsalir.setContentAreaFilled(true);
        btnsalir.setBorderPainted(true);
    }

      
    public int grado;
    double Resultado1,Resultado2,Resultado3,Resultado4;
    public Polinomio q;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtDisplay = new javax.swing.JTextField();
        BtnGrado = new javax.swing.JButton();
        TxtGrado = new javax.swing.JTextField();
        BtnContador = new javax.swing.JButton();
        TxtCoeficiente = new javax.swing.JTextField();
        TxtInf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BtnIzquierdo = new javax.swing.JButton();
        TxtPartes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtSup = new javax.swing.JTextField();
        BtnSimpson = new javax.swing.JButton();
        TxtTrapecio = new javax.swing.JTextField();
        BtnDerecho = new javax.swing.JButton();
        TxtIzquierdo = new javax.swing.JTextField();
        BtnTrapecio = new javax.swing.JButton();
        TxtDerecho = new javax.swing.JTextField();
        TxtSimpson = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        lblgrado = new javax.swing.JLabel();
        lblx = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtDisplay.setBackground(new java.awt.Color(153, 153, 153));
        TxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 290, 30));

        BtnGrado.setBackground(new java.awt.Color(51, 102, 255));
        BtnGrado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnGrado.setForeground(new java.awt.Color(255, 255, 255));
        BtnGrado.setText("Grado");
        BtnGrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGradoMouseClicked(evt);
            }
        });
        BtnGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGradoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        TxtGrado.setBackground(new java.awt.Color(153, 153, 153));
        TxtGrado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtGradoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 45, -1));

        BtnContador.setBackground(new java.awt.Color(51, 102, 255));
        BtnContador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnContador.setForeground(new java.awt.Color(255, 255, 255));
        BtnContador.setText("Coeficiente");
        BtnContador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnContadorMouseClicked(evt);
            }
        });
        BtnContador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContadorActionPerformed(evt);
            }
        });
        getContentPane().add(BtnContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, 30));

        TxtCoeficiente.setBackground(new java.awt.Color(153, 153, 153));
        TxtCoeficiente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtCoeficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 48, -1));

        TxtInf.setBackground(new java.awt.Color(153, 153, 153));
        TxtInf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 27, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Métodos de Integración");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 380, 50));

        BtnIzquierdo.setBackground(new java.awt.Color(51, 102, 255));
        BtnIzquierdo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnIzquierdo.setForeground(new java.awt.Color(255, 255, 255));
        BtnIzquierdo.setText("Izquierdo");
        BtnIzquierdo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIzquierdoMouseClicked(evt);
            }
        });
        getContentPane().add(BtnIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        TxtPartes.setBackground(new java.awt.Color(153, 153, 153));
        TxtPartes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtPartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 40, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("n =");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        TxtSup.setBackground(new java.awt.Color(153, 153, 153));
        TxtSup.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 27, -1));

        BtnSimpson.setBackground(new java.awt.Color(51, 102, 255));
        BtnSimpson.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnSimpson.setForeground(new java.awt.Color(255, 255, 255));
        BtnSimpson.setText("Simpson");
        BtnSimpson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSimpsonMouseClicked(evt);
            }
        });
        getContentPane().add(BtnSimpson, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        TxtTrapecio.setBackground(new java.awt.Color(153, 153, 153));
        TxtTrapecio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtTrapecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 110, -1));

        BtnDerecho.setBackground(new java.awt.Color(51, 102, 255));
        BtnDerecho.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnDerecho.setForeground(new java.awt.Color(255, 255, 255));
        BtnDerecho.setText("Derecho");
        BtnDerecho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDerechoMouseClicked(evt);
            }
        });
        getContentPane().add(BtnDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        TxtIzquierdo.setBackground(new java.awt.Color(153, 153, 153));
        TxtIzquierdo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 110, -1));

        BtnTrapecio.setBackground(new java.awt.Color(51, 102, 255));
        BtnTrapecio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnTrapecio.setForeground(new java.awt.Color(255, 255, 255));
        BtnTrapecio.setText("Trapecio");
        BtnTrapecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTrapecioMouseClicked(evt);
            }
        });
        getContentPane().add(BtnTrapecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        TxtDerecho.setBackground(new java.awt.Color(153, 153, 153));
        TxtDerecho.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 110, -1));

        TxtSimpson.setBackground(new java.awt.Color(153, 153, 153));
        TxtSimpson.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtSimpson, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 110, -1));

        jLabel3.setText("Hecho Por: Grevin Solorzano");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 60, 40));

        btnnuevo.setBackground(new java.awt.Color(51, 102, 255));
        btnnuevo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnnuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        lblgrado.setBackground(new java.awt.Color(153, 153, 153));
        lblgrado.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        getContentPane().add(lblgrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 30, 20));

        lblx.setBackground(new java.awt.Color(153, 153, 153));
        lblx.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblx.setText("X");
        getContentPane().add(lblx, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 20, 30));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/in.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_UTH_2009.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 630, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGradoMouseClicked
        // TODO add your handling code here:
        grado=Integer.parseInt(TxtGrado.getText());
        q=new Polinomio(grado+1);
        TxtGrado.setText(null);
        lblgrado.setText(" " + grado);
    }//GEN-LAST:event_BtnGradoMouseClicked

    private void BtnGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGradoActionPerformed

    private void TxtGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtGradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtGradoActionPerformed

    private void BtnContadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnContadorMouseClicked
        // TODO add your handling code here:
        if(grado>0)
        {
            q.a(grado, Float.parseFloat(TxtCoeficiente.getText()));
            TxtCoeficiente.setText(null);
            grado-=1;
            lblgrado.setText(""+grado+"");
            TxtCoeficiente.requestFocus();

        }
        else

        {
            q.a(grado, Float.parseFloat(TxtCoeficiente.getText()));
            TxtDisplay.setText(q.ver());
        }
    }//GEN-LAST:event_BtnContadorMouseClicked

    private void BtnContadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnContadorActionPerformed

    private void BtnIzquierdoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIzquierdoMouseClicked
        // TODO add your handling code here:
        Resultado1=q.izquierdo(Float.parseFloat(TxtInf.getText()),
            Float.parseFloat(TxtSup.getText()), Integer.parseInt(TxtPartes.getText()));
        TxtIzquierdo.setText(Double.toString(Resultado1));
    }//GEN-LAST:event_BtnIzquierdoMouseClicked

    private void BtnSimpsonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSimpsonMouseClicked
        // TODO add your handling code here:
        Resultado2=q.simpson(Float.parseFloat(TxtInf.getText()),
            Float.parseFloat(TxtSup.getText()), Integer.parseInt(TxtPartes.getText()));
        TxtSimpson.setText(Double.toString(Resultado2));
    }//GEN-LAST:event_BtnSimpsonMouseClicked

    private void BtnDerechoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDerechoMouseClicked
        // TODO add your handling code here:
        Resultado3=q.derecho(Float.parseFloat(TxtInf.getText()),
            Float.parseFloat(TxtSup.getText()), Integer.parseInt(TxtPartes.getText()));
        TxtDerecho.setText(Double.toString(Resultado3));
    }//GEN-LAST:event_BtnDerechoMouseClicked

    private void BtnTrapecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTrapecioMouseClicked
        // TODO add your handling code here:
        Resultado4=q.trapecio(Float.parseFloat(TxtInf.getText()),
            Float.parseFloat(TxtSup.getText()), Integer.parseInt(TxtPartes.getText()));
        TxtTrapecio.setText(Double.toString(Resultado4));
    }//GEN-LAST:event_BtnTrapecioMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        WinIntegracion nuevo=new WinIntegracion();
        nuevo.setVisible(true);
        dispose();//cierra la ventana anterior
    }//GEN-LAST:event_btnnuevoActionPerformed

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
            java.util.logging.Logger.getLogger(WinIntegracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinIntegracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinIntegracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinIntegracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContador;
    private javax.swing.JButton BtnDerecho;
    private javax.swing.JButton BtnGrado;
    private javax.swing.JButton BtnIzquierdo;
    private javax.swing.JButton BtnSimpson;
    private javax.swing.JButton BtnTrapecio;
    private javax.swing.JTextField TxtCoeficiente;
    private javax.swing.JTextField TxtDerecho;
    private javax.swing.JTextField TxtDisplay;
    private javax.swing.JTextField TxtGrado;
    private javax.swing.JTextField TxtInf;
    private javax.swing.JTextField TxtIzquierdo;
    private javax.swing.JTextField TxtPartes;
    private javax.swing.JTextField TxtSimpson;
    private javax.swing.JTextField TxtSup;
    private javax.swing.JTextField TxtTrapecio;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblgrado;
    private javax.swing.JLabel lblx;
    // End of variables declaration//GEN-END:variables
}
