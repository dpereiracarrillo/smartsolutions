/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Beneficiarios;

import diaketas.UI.UI;
import diaketas.Modelo.Gestores.Gestor_de_beneficiarios;
import java.awt.Font;

/**
 *
 * @author kesada
 */
public class jBajaFamiliar extends javax.swing.JPanel {

    /**
     * 
     */
    public int fase;
    String jPanelAnterior;
    String NombreApellidos;
    
    /**
     * Creates new form jAltaFamiliar
     * @param jPanelAnterior
     * @param Nombre_Apellidos  
     */
    public jBajaFamiliar(String jPanelAnterior, String Nombre_Apellidos) {
        
        /*Nombre & Apellidos del familiar que se da de baja*/
        this.jPanelAnterior = jPanelAnterior;
        this.NombreApellidos = Nombre_Apellidos;
        
        /* Iniciamos componentes */
        initComponents();
        
        /*Mostramos texto informativo */
        jLabelInformativo.setText("¿Desea eliminar el familiar «"+ Nombre_Apellidos + "»?");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitulo2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelInformativo = new javax.swing.JLabel();
        botonOK = new javax.swing.JButton();
        botonCancel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jTitulo1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(223, 232, 249));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jTitulo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTitulo2.setText("Eliminar un familiar");

        jLabelInformativo.setText("¿Desea eliminar el familiar?");

        botonOK.setText("Ok");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        botonCancel.setText("Cancelar");
        botonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/beneficiarios.png"))); // NOI18N

        jTitulo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTitulo1.setText("Beneficiarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTitulo2)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInformativo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(botonOK)
                        .addGap(18, 18, 18)
                        .addComponent(botonCancel)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel17)
                .addGap(69, 69, 69)
                .addComponent(jTitulo1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jTitulo1))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInformativo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOK)
                    .addComponent(botonCancel))
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        
        /*Confirmar eleiminar familiar*/
        diaketas.diaketas.ong.gestorBeneficiarios.confirmarEliminacion();
        
        UI.cl.show(UI.jPrincipal, jPanelAnterior);
    }//GEN-LAST:event_botonOKActionPerformed

    private void botonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelActionPerformed
        UI.cl.show(UI.jPrincipal, jPanelAnterior);
    }//GEN-LAST:event_botonCancelActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        int ancho, alto;
        ancho = this.getSize().width;
        alto = this.getSize().height;

        double fuente = 13 + (ancho - 1262) / 30;
        for (int i = 0; i < this.getComponentCount(); i++) {
            this.getComponent(i).setFont(new Font("Courier", Font.BOLD, (int) fuente));
        }
        
        jTitulo1.setFont(new Font("Courier", Font.BOLD, (int) fuente+12));
        jTitulo2.setFont(new Font("Courier", Font.BOLD, (int) fuente+2));
    }//GEN-LAST:event_formComponentResized

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancel;
    private javax.swing.JButton botonOK;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabelInformativo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jTitulo1;
    private javax.swing.JLabel jTitulo2;
    // End of variables declaration//GEN-END:variables
}
