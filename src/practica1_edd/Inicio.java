/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;

import java.awt.BorderLayout;

/**
 *
 * @author KRATOS
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Plantas = new javax.swing.JButton();
        Zombis = new javax.swing.JButton();
        Juego = new javax.swing.JButton();
        Eliminar_Juego = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JUGADORES");
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Plantas.setBackground(new java.awt.Color(51, 51, 51));
        Plantas.setFont(new java.awt.Font("Ravie", 1, 18)); // NOI18N
        Plantas.setForeground(new java.awt.Color(255, 255, 255));
        Plantas.setText("JUGADOR PLANTAS");
        Plantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlantasActionPerformed(evt);
            }
        });
        getContentPane().add(Plantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        Zombis.setBackground(new java.awt.Color(51, 51, 51));
        Zombis.setFont(new java.awt.Font("Ravie", 1, 18)); // NOI18N
        Zombis.setForeground(new java.awt.Color(255, 255, 255));
        Zombis.setText("JUGADOR ZOMBIS");
        Zombis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZombisActionPerformed(evt);
            }
        });
        getContentPane().add(Zombis, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        Juego.setBackground(new java.awt.Color(51, 51, 51));
        Juego.setFont(new java.awt.Font("Ravie", 1, 18)); // NOI18N
        Juego.setForeground(new java.awt.Color(255, 255, 255));
        Juego.setText("COMENZAR JUEGO");
        getContentPane().add(Juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        Eliminar_Juego.setBackground(new java.awt.Color(51, 51, 51));
        Eliminar_Juego.setFont(new java.awt.Font("Ravie", 1, 18)); // NOI18N
        Eliminar_Juego.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Juego.setText("ELIMINAR DATOS");
        getContentPane().add(Eliminar_Juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portada.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlantasActionPerformed
        Plantas ventana=new Plantas();
        ventana.setVisible(true);
    }//GEN-LAST:event_PlantasActionPerformed

    private void ZombisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZombisActionPerformed
        Zombies ventana=new Zombies();
        ventana.setVisible(true);
    }//GEN-LAST:event_ZombisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        System.out.println("Freddy-201212854");
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar_Juego;
    private javax.swing.JButton Juego;
    private javax.swing.JButton Plantas;
    private javax.swing.JButton Zombis;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
