
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.lang.String;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author fapal
 */
public class MostrarProductos extends javax.swing.JPanel {
    Cliente nuevo;
    
    private RegistrarNuevoProducto producto;
    Velas nuevo1 = new Velas();
    /**
     * Creates new form MostrarProductos
     */
    public MostrarProductos() {
        initComponents();
        
        this.producto = new RegistrarNuevoProducto();
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
        IngresarAñoFabricacion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        IngresarMarca1 = new javax.swing.JLabel();
        TituloMproductos = new javax.swing.JLabel();
        IngresarNumeroPuertas = new javax.swing.JLabel();
        IngresarVelocidad = new javax.swing.JLabel();
        RegresarAMenu = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        IngresarMarca = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        IngresarModelo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        mostrarNoVela = new javax.swing.JLabel();
        MostrarTemporada = new javax.swing.JLabel();
        mostarrMateria = new javax.swing.JLabel();
        MostrarExistencias = new javax.swing.JLabel();
        MostrarCategoría = new javax.swing.JLabel();
        MostrarPreccio = new javax.swing.JLabel();

        Hoja2.setBackground(new java.awt.Color(255, 255, 255));

        IngresarAñoFabricacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        IngresarAñoFabricacion.setForeground(new java.awt.Color(0, 0, 0));
        IngresarAñoFabricacion.setText("Laminas de materia prima  usada");
        IngresarAñoFabricacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IngresarAñoFabricacion.setVerifyInputWhenFocusTarget(false);

        jPanel2.setBackground(new java.awt.Color(255, 233, 133));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 233, 133));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        IngresarMarca1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        IngresarMarca1.setForeground(new java.awt.Color(0, 0, 0));
        IngresarMarca1.setText("Categoria");
        IngresarMarca1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IngresarMarca1.setVerifyInputWhenFocusTarget(false);

        TituloMproductos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        TituloMproductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloMproductos.setText("Mostrar Productos");
        TituloMproductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TituloMproductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TituloMproductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        IngresarNumeroPuertas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        IngresarNumeroPuertas.setForeground(new java.awt.Color(0, 0, 0));
        IngresarNumeroPuertas.setText("Cantidad en existencias");
        IngresarNumeroPuertas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IngresarNumeroPuertas.setVerifyInputWhenFocusTarget(false);

        IngresarVelocidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        IngresarVelocidad.setForeground(new java.awt.Color(0, 0, 0));
        IngresarVelocidad.setText("No. Vela");
        IngresarVelocidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IngresarVelocidad.setVerifyInputWhenFocusTarget(false);

        RegresarAMenu.setText("Regresar a menú");
        RegresarAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarAMenuActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ARTÍCULOS");

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Totus Tuus");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        IngresarMarca.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        IngresarMarca.setForeground(new java.awt.Color(0, 0, 0));
        IngresarMarca.setText("Precio");
        IngresarMarca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IngresarMarca.setVerifyInputWhenFocusTarget(false);

        jPanel5.setBackground(new java.awt.Color(255, 233, 133));
        jPanel5.setForeground(new java.awt.Color(255, 228, 146));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        IngresarModelo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        IngresarModelo.setForeground(new java.awt.Color(0, 0, 0));
        IngresarModelo.setText("Temporada");
        IngresarModelo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IngresarModelo.setVerifyInputWhenFocusTarget(false);

        jPanel6.setBackground(new java.awt.Color(255, 233, 133));
        jPanel6.setForeground(new java.awt.Color(255, 228, 146));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mostrarNoVela.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        mostrarNoVela.setText("1");
        mostrarNoVela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mostrarNoVela.setVerifyInputWhenFocusTarget(false);

        MostrarTemporada.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        MostrarTemporada.setText("Navideña");
        MostrarTemporada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MostrarTemporada.setVerifyInputWhenFocusTarget(false);

        mostarrMateria.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        mostarrMateria.setText("1");
        mostarrMateria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mostarrMateria.setVerifyInputWhenFocusTarget(false);

        MostrarExistencias.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        MostrarExistencias.setText("1");
        MostrarExistencias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MostrarExistencias.setVerifyInputWhenFocusTarget(false);

        MostrarCategoría.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        MostrarCategoría.setText("Entorchada");
        MostrarCategoría.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MostrarCategoría.setVerifyInputWhenFocusTarget(false);

        MostrarPreccio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        MostrarPreccio.setText("11");
        MostrarPreccio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MostrarPreccio.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout Hoja2Layout = new javax.swing.GroupLayout(Hoja2);
        Hoja2.setLayout(Hoja2Layout);
        Hoja2Layout.setHorizontalGroup(
            Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Hoja2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Hoja2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Hoja2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Hoja2Layout.createSequentialGroup()
                                        .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MostrarCategoría)
                                            .addComponent(IngresarMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(221, 221, 221)
                                        .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IngresarNumeroPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(MostrarExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(Hoja2Layout.createSequentialGroup()
                                        .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Hoja2Layout.createSequentialGroup()
                                                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(IngresarVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(IngresarMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(MostrarPreccio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(156, 156, 156))
                                            .addGroup(Hoja2Layout.createSequentialGroup()
                                                .addComponent(mostrarNoVela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(71, 71, 71)))
                                        .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Hoja2Layout.createSequentialGroup()
                                                .addComponent(MostrarTemporada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(161, 161, 161))
                                            .addGroup(Hoja2Layout.createSequentialGroup()
                                                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(IngresarAñoFabricacion, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                                    .addComponent(mostarrMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(IngresarModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Hoja2Layout.createSequentialGroup()
                                .addComponent(TituloMproductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(108, 108, 108))))
                    .addGroup(Hoja2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(649, 649, 649))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Hoja2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegresarAMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Hoja2Layout.setVerticalGroup(
            Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Hoja2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(TituloMproductos, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresarVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IngresarModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarNoVela)
                    .addComponent(MostrarTemporada))
                .addGap(17, 17, 17)
                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresarMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(IngresarAñoFabricacion))
                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MostrarPreccio)
                    .addComponent(mostarrMateria))
                .addGap(16, 16, 16)
                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresarMarca1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IngresarNumeroPuertas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Hoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MostrarCategoría)
                    .addComponent(MostrarExistencias))
                .addGap(72, 72, 72)
                .addComponent(RegresarAMenu)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Hoja2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Hoja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    public JLabel getMostrarCategoría() {
        return MostrarCategoría;
    }

    public void setMostrarCategoría(JLabel MostrarCategoría) {
        this.MostrarCategoría = MostrarCategoría;
    }

    public JLabel getMostrarExistencias() {
        return MostrarExistencias;
    }

    public void setMostrarExistencias(JLabel MostrarExistencias) {
        this.MostrarExistencias = MostrarExistencias;
    }

    public JLabel getMostrarPreccio() {
        return MostrarPreccio;
    }

    public void setMostrarPreccio(JLabel MostrarPreccio) {
        this.MostrarPreccio = MostrarPreccio;
    }

    public JLabel getMostrarTemporada() {
        return MostrarTemporada;
    }

    public void setMostrarTemporada(JLabel MostrarTemporada) {
        this.MostrarTemporada = MostrarTemporada;
    }

    public JLabel getMostarrMateria() {
        return mostarrMateria;
    }

    public void setMostarrMateria(JLabel mostarrMateria) {
        this.mostarrMateria = mostarrMateria;
    }

    public JLabel getMostrarNoVela() {
        return mostrarNoVela;
    }

    public void setMostrarNoVela(JLabel mostrarNoVela) {
        this.mostrarNoVela = mostrarNoVela;
    }
    
    


    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Hoja2;
    private javax.swing.JLabel IngresarAñoFabricacion;
    private javax.swing.JLabel IngresarMarca;
    private javax.swing.JLabel IngresarMarca1;
    private javax.swing.JLabel IngresarModelo;
    private javax.swing.JLabel IngresarNumeroPuertas;
    private javax.swing.JLabel IngresarVelocidad;
    private javax.swing.JLabel MostrarCategoría;
    private javax.swing.JLabel MostrarExistencias;
    private javax.swing.JLabel MostrarPreccio;
    private javax.swing.JLabel MostrarTemporada;
    private javax.swing.JButton RegresarAMenu;
    private javax.swing.JLabel TituloMproductos;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel mostarrMateria;
    private javax.swing.JLabel mostrarNoVela;
    // End of variables declaration//GEN-END:variables
}
