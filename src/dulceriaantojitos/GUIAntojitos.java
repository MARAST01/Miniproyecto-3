
package dulceriaantojitos;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import logica.Dulces;

/**
 *
 * @authors
 * marlon Astudillo
 * Tina Torres
 * Juan Jose Gallego
 */
public class GUIAntojitos extends JFrame {
    static ArrayList<Dulces> lista_dulces;
   
    public GUIAntojitos() {
        this.getContentPane().setBackground(new java.awt.Color(255, 255, 255));//Color de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); //cerrar del todo
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("candys.png")).getImage()
        );
        setPreferredSize(new java.awt.Dimension(800, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 601));

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 10, true));

        Titulo.setBackground(new java.awt.Color(255, 204, 0));
        Titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 153, 0));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("DULCERIA ANTOJITOS");
        Titulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 8, true));

        jPanel5.setBackground(new java.awt.Color(255, 204, 0));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jButton25.setBackground(new java.awt.Color(255, 153, 0));
        jButton25.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton25.setForeground(new java.awt.Color(216, 130, 0));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dulceriaantojitos/oso-de-gominola.png"))); // NOI18N
        jButton25.setText("INSERTAR NUEVOS DULCES");
        jButton25.setBorder(null);
        jButton25.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jButton1ComponentAdded(evt);
            }
        });
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(255, 153, 0));
        jButton26.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton26.setForeground(new java.awt.Color(216, 130, 0));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dulceriaantojitos/chocolate.png"))); // NOI18N
        jButton26.setText("ACTUALIZAR DULCES");
        jButton26.setBorder(null);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(255, 153, 0));
        jButton27.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton27.setForeground(new java.awt.Color(216, 130, 0));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dulceriaantojitos/bolsa-de-reciclaje.png"))); // NOI18N
        jButton27.setText("ELIMINAR DULCES");
        jButton27.setBorder(null);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(255, 153, 0));
        jButton28.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton28.setForeground(new java.awt.Color(216, 130, 0));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dulceriaantojitos/caramelo (1).png"))); // NOI18N
        jButton28.setText("LISTAR DULCES");
        jButton28.setBorder(null);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(255, 153, 0));
        jButton29.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton29.setForeground(new java.awt.Color(216, 130, 0));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dulceriaantojitos/buscar (grande).png"))); // NOI18N
        jButton29.setText("BUSCAR DULCES");
        jButton29.setBorder(null);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(204, 204, 0));
        jButton30.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton30.setForeground(new java.awt.Color(154, 154, 0));
        jButton30.setText("SALIR");
        jButton30.setBorder(null);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                        .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("AUTORES");

        jLabel2.setFont(new java.awt.Font("SimSun", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Juan José Gallego      2259433");

        jLabel5.setFont(new java.awt.Font("SimSun", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Tina María Torres      2259729");

        jLabel6.setFont(new java.awt.Font("SimSun", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Marlon Astudillo       2259462");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("CODIGOS");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dulceriaantojitos/caramelo.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dulceriaantojitos/dulces.jpg"))); // NOI18N

        jLabel9.setBackground(new java.awt.Color(255, 204, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("¡Bienvenid@ a DULCERIA ANTOJITOS! ¿Qué deseas? :)");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 6, true));

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(13, 13, 13))
                            .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(MenuLayout.createSequentialGroup()
                            .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel7))
                            .addGap(4, 4, 4)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Buscar_Dulce ventana1 = new Buscar_Dulce();
        ventana1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Listar_Dulces ventana1 = new Listar_Dulces();
        ventana1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Eliminar_Dulces ventana1 = new Eliminar_Dulces();
        ventana1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Actualizar_Dulce ventana1 = new Actualizar_Dulce();
        ventana1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ventana_Nuevo_Dulce ventana1 = new Ventana_Nuevo_Dulce();
        ventana1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jButton1ComponentAdded
        Buscar_Dulce ventana1 = new Buscar_Dulce();
        ventana1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ComponentAdded

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
            java.util.logging.Logger.getLogger(GUIAntojitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAntojitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAntojitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAntojitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAntojitos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
