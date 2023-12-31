
import java.awt.BorderLayout;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author fapal
 */
public class MostrarProducto extends javax.swing.JPanel {

    private RegistrarNuevoProducto producto;
    /**
     * Creates new form MostrarProducto
     */
    public MostrarProducto() {
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

        Hoja2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TituloMproductos = new javax.swing.JLabel();
        IngresarVelocidad = new javax.swing.JLabel();
        IngresarModelo = new javax.swing.JLabel();
        IngresarMarca = new javax.swing.JLabel();
        IngresarMarca1 = new javax.swing.JLabel();
        IngresarAñoFabricacion = new javax.swing.JLabel();
        IngresarNumeroPuertas = new javax.swing.JLabel();
        RegresarAMenu = new javax.swing.JButton();
        mTemporada = new javax.swing.JTextField();
        mPrecio = new javax.swing.JTextField();
        mNoVela2 = new javax.swing.JTextField();
        mNoVela3 = new javax.swing.JTextField();
        mLaminas = new javax.swing.JTextField();
        mExistencias = new javax.swing.JTextField();

        Hoja2.setBackground(new java.awt.Color(255, 255, 255));
        Hoja2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 233, 133));
        jPanel6.setForeground(new java.awt.Color(255, 228, 146));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 233, 133));
        jPanel3.setForeground(new java.awt.Color(255, 228, 146));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 233, 133));
        jPanel7.setForeground(new java.awt.Color(255, 228, 146));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 233, 133));
        jPanel4.setForeground(new java.awt.Color(255, 228, 146));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ARTÍCULOS");

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Totus Tuus");

        TituloMproductos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        TituloMproductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloMproductos.setText("Mostrar Productos");
        TituloMproductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TituloMproductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TituloMproductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        IngresarVelocidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        IngresarVelocidad.setForeground(new java.awt.Color(0, 0, 0));
        IngresarVelocidad.setText("No. Vela");
        IngresarVelocidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IngresarVelocidad.setVerifyInputWhenFocusTarget(false);

        IngresarModelo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        IngresarModelo.setForeground(new java.awt.Color(0, 0, 0));
        IngresarModelo.setText("Temporada");
        IngresarModelo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IngresarModelo.setVerifyInputWhenFocusTarget(false);

        IngresarMarca.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        IngresarMarca.setForeground(new java.awt.Color(0, 0, 0));
        IngresarMarca.setText("Precio");
        IngresarMarca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IngresarMarca.setVerifyInputWhenFocusTarget(false);

        IngresarMarca1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        IngresarMarca1.setForeground(new java.awt.Color(0, 0, 0));
        IngresarMarca1.setText("Categoria");
        IngresarMarca1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IngresarMarca1.setVerifyInputWhenFocusTarget(false);

        IngresarAñoFabricacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        IngresarAñoFabricacion.setForeground(new java.awt.Color(0, 0, 0));
        IngresarAñoFabricacion.setText("Laminas de materia prima  usada");
        IngresarAñoFabricacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IngresarAñoFabricacion.setVerifyInputWhenFocusTarget(false);

        IngresarNumeroPuertas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        IngresarNumeroPuertas.setForeground(new java.awt.Color(0, 0, 0));
        IngresarNumeroPuertas.setText("Cantidad en existencias");
        IngresarNumeroPuertas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IngresarNumeroPuertas.setVerifyInputWhenFocusTarget(false);

        RegresarAMenu.setText("Regresar a menú");
        RegresarAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarAMenuActionPerformed(evt);
            }
        });

        mTemporada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTemporadaActionPerformed(evt);
            }
        });

        mPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPrecioActionPerformed(evt);
            }
        });

        mNoVela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNoVela2ActionPerformed(evt);
            }
        });

        mNoVela3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNoVela3ActionPerformed(evt);
            }
        });

        mLaminas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLaminasActionPerformed(evt);
            }
        });

        mExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mExistenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Hoja2Layout = new javax.swing.GroupLayout(Hoja2);
        Hoja2.setLayout(Hoja2Layout);
        Hoja2Layout.setHorizontalGroup(
            Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Hoja2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Hoja2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(607, 607, 607))
                    .addGroup(Hoja2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(TituloMproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Hoja2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegresarAMenu)
                        .addGap(34, 34, 34))
                    .addGroup(Hoja2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(IngresarMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IngresarVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                            .addComponent(IngresarMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mNoVela2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mNoVela3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IngresarNumeroPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngresarAñoFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngresarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mLaminas, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Hoja2Layout.setVerticalGroup(
            Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Hoja2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TituloMproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresarVelocidad)
                    .addComponent(IngresarModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mNoVela3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresarMarca)
                    .addComponent(IngresarAñoFabricacion))
                .addGap(18, 18, 18)
                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mLaminas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresarMarca1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IngresarNumeroPuertas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mNoVela2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(RegresarAMenu)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Hoja2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Hoja2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarAMenuActionPerformed
        // TODO add your handling code here:
        PanelMenu menu = new PanelMenu();
        menu.setSize(868, 483);
        menu.setLocation(0, 0);

        Hoja2.removeAll();
        Hoja2.add(menu, BorderLayout.CENTER);
        Hoja2.revalidate();
        Hoja2.repaint();
    }//GEN-LAST:event_RegresarAMenuActionPerformed

    private void mTemporadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTemporadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mTemporadaActionPerformed

    private void mPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mPrecioActionPerformed

    private void mNoVela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNoVela2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mNoVela2ActionPerformed

    private void mNoVela3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNoVela3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mNoVela3ActionPerformed

    private void mLaminasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLaminasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mLaminasActionPerformed

    private void mExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mExistenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mExistenciasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Hoja2;
    private javax.swing.JLabel IngresarAñoFabricacion;
    private javax.swing.JLabel IngresarMarca;
    private javax.swing.JLabel IngresarMarca1;
    private javax.swing.JLabel IngresarModelo;
    private javax.swing.JLabel IngresarNumeroPuertas;
    private javax.swing.JLabel IngresarVelocidad;
    private javax.swing.JButton RegresarAMenu;
    private javax.swing.JLabel TituloMproductos;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField mExistencias;
    private javax.swing.JTextField mLaminas;
    private javax.swing.JTextField mNoVela2;
    private javax.swing.JTextField mNoVela3;
    private javax.swing.JTextField mPrecio;
    private javax.swing.JTextField mTemporada;
    // End of variables declaration//GEN-END:variables
}
