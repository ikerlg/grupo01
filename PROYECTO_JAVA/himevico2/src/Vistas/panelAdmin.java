/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import himevico2.controladora;
import javax.swing.JOptionPane;

/**
 *
 * @author Iker
 */
public class panelAdmin extends javax.swing.JFrame {

    /**
     * Creates new form panelAdmin
     */
    public panelAdmin() {
        initComponents();
         setLocationRelativeTo(null);
         this.setResizable(false); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMinicio = new javax.swing.JMenu();
        jMcerrarSesion = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuTalta = new javax.swing.JRadioButtonMenuItem();
        menuTmodificacion = new javax.swing.JRadioButtonMenuItem();
        menuTbaja = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        meunuPconsultar = new javax.swing.JRadioButtonMenuItem();
        menuPElimininar = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuCalta = new javax.swing.JRadioButtonMenuItem();
        menuCmodificacion = new javax.swing.JRadioButtonMenuItem();
        menuCbaja = new javax.swing.JRadioButtonMenuItem();
        jMflota = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(330, 240));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/tlogistica.jpeg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 20, 243, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/arenaG.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-80, 0, 420, 220);

        jMinicio.setText("Inicio");

        jMcerrarSesion.setText("Cerrar Sesion");
        jMcerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMcerrarSesionActionPerformed(evt);
            }
        });
        jMinicio.add(jMcerrarSesion);
        jMinicio.add(jSeparator6);

        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMinicio.add(jMSalir);

        jMenuBar1.add(jMinicio);

        jMenu1.setText("Trabajador");

        menuTalta.setSelected(true);
        menuTalta.setText("Alta");
        menuTalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTaltaActionPerformed(evt);
            }
        });
        jMenu1.add(menuTalta);

        menuTmodificacion.setSelected(true);
        menuTmodificacion.setText("Modificacion");
        menuTmodificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTmodificacionActionPerformed(evt);
            }
        });
        jMenu1.add(menuTmodificacion);

        menuTbaja.setSelected(true);
        menuTbaja.setText("Baja");
        menuTbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTbajaActionPerformed(evt);
            }
        });
        jMenu1.add(menuTbaja);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Parte");

        meunuPconsultar.setSelected(true);
        meunuPconsultar.setText("Consultar");
        meunuPconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meunuPconsultarActionPerformed(evt);
            }
        });
        jMenu2.add(meunuPconsultar);

        menuPElimininar.setSelected(true);
        menuPElimininar.setText("Eliminar");
        jMenu2.add(menuPElimininar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Centro");

        menuCalta.setSelected(true);
        menuCalta.setText("Alta");
        menuCalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCaltaActionPerformed(evt);
            }
        });
        jMenu3.add(menuCalta);

        menuCmodificacion.setSelected(true);
        menuCmodificacion.setText("Modificacion");
        menuCmodificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCmodificacionActionPerformed(evt);
            }
        });
        jMenu3.add(menuCmodificacion);

        menuCbaja.setSelected(true);
        menuCbaja.setText("Baja");
        menuCbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCbajaActionPerformed(evt);
            }
        });
        jMenu3.add(menuCbaja);

        jMenuBar1.add(jMenu3);

        jMflota.setText("Flota");

        jMenuItem1.setText("Vehículos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMflota.add(jMenuItem1);

        jMenuBar1.add(jMflota);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuTaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTaltaActionPerformed
        // TODO add your handling code here:
        controladora.selecOperacion("alta");
    }//GEN-LAST:event_menuTaltaActionPerformed

    private void menuTmodificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTmodificacionActionPerformed
        // TODO add your handling code here:
        controladora.selecOperacion("modificacion");
    }//GEN-LAST:event_menuTmodificacionActionPerformed

    private void menuTbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTbajaActionPerformed
        // TODO add your handling code here:
        controladora.selecOperacion("baja");
    }//GEN-LAST:event_menuTbajaActionPerformed

    private void menuCaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCaltaActionPerformed
        // TODO add your handling code here:
        controladora.selecOperacion("altaC");
    }//GEN-LAST:event_menuCaltaActionPerformed

    private void menuCmodificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCmodificacionActionPerformed
        // TODO add your handling code here:
        controladora.selecOperacion("modificacionC");
      
    }//GEN-LAST:event_menuCmodificacionActionPerformed

    private void menuCbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCbajaActionPerformed
        // TODO add your handling code here:
        controladora.selecOperacion("bajaC");
    }//GEN-LAST:event_menuCbajaActionPerformed

    private void meunuPconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meunuPconsultarActionPerformed
        // TODO add your handling code here:
        controladora.panleFiltroParte();
    }//GEN-LAST:event_meunuPconsultarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // BOTON ABRIR FICHA VEHICULO
        this.setVisible(false);
        controladora.abrirVentanaVehiculo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMcerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMcerrarSesionActionPerformed
        // BOTON MENU CERRAR SESION

    }//GEN-LAST:event_jMcerrarSesionActionPerformed

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
        // BOTON MENU SALIR
        JOptionPane.showMessageDialog(null, "¡Hasta la Próxima!");
        System.exit(0);
    }//GEN-LAST:event_jMSalirActionPerformed

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
            java.util.logging.Logger.getLogger(panelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panelAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMSalir;
    private javax.swing.JMenuItem jMcerrarSesion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMflota;
    private javax.swing.JMenu jMinicio;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JRadioButtonMenuItem menuCalta;
    private javax.swing.JRadioButtonMenuItem menuCbaja;
    private javax.swing.JRadioButtonMenuItem menuCmodificacion;
    private javax.swing.JRadioButtonMenuItem menuPElimininar;
    private javax.swing.JRadioButtonMenuItem menuTalta;
    private javax.swing.JRadioButtonMenuItem menuTbaja;
    private javax.swing.JRadioButtonMenuItem menuTmodificacion;
    private javax.swing.JRadioButtonMenuItem meunuPconsultar;
    // End of variables declaration//GEN-END:variables
}
