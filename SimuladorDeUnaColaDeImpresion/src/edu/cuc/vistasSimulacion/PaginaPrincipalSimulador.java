/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.vistasSimulacion;

import edu.cuc.metodosSimulacion.Metodos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Estudiante Redes
 */
public class PaginaPrincipalSimulador extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipalSimulador
     */
    public PaginaPrincipalSimulador() {
        initComponents();
        reproducir = new Timer(10000, acciones);
        ventana2 = new PaginaSecundariaSimulador(this, true);
    }
    Timer reproducir;
    PaginaSecundariaSimulador ventana2;
    ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!Metodos.Vacio()) {
            reproducir.stop();
            ventana2.setVisible(true);
            Metodos.mostrarQueues(mostrarArchivos);
            reproducir.start();
            } else {
            reproducir.stop();
            }
        }
    };
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mostrarArchivos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCargarDatos = new javax.swing.JButton();
        btnSimuladorImpresion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Simulador De Una Cola De Impresion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setFocusCycleRoot(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(mostrarArchivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 130));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 210, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cuc/imagenesSimulacion/ImpresoraImagen.jpeg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 190, 160));

        btnCargarDatos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCargarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cuc/imagenesSimulacion/folder.jpeg"))); // NOI18N
        btnCargarDatos.setText("Cargar Datos");
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        btnSimuladorImpresion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSimuladorImpresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cuc/imagenesSimulacion/process.jpeg"))); // NOI18N
        btnSimuladorImpresion.setText("Iniciar Simulación");
        btnSimuladorImpresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimuladorImpresionActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimuladorImpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cuc/imagenesSimulacion/logout.jpeg"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        // TODO add your handling code here:
        Metodos.agregarArchivos();
        Metodos.mostrarQueues(mostrarArchivos);
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void btnSimuladorImpresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimuladorImpresionActionPerformed
        // TODO add your handling code here:
        reproducir.start();
    }//GEN-LAST:event_btnSimuladorImpresionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaPrincipalSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipalSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipalSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipalSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipalSimulador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSimuladorImpresion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mostrarArchivos;
    // End of variables declaration//GEN-END:variables
}
