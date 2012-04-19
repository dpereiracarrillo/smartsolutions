/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Beneficiarios;

import diaketas.UI.UI;
import diaketas.Modelo.ONG.ONG;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author kesada
 */
public class jBajaBeneficiario extends javax.swing.JPanel {

    /**
     * 
     */
    public int fase;
    /**
     * Creates new form jAltaBeneficiario
     */
    public jBajaBeneficiario() {
        initComponents();
        fase = 0;
        jLabel4.setVisible(false);
        NIF_Voluntario.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        NIF_CIF = new javax.swing.JTextField();
        botonOK = new javax.swing.JButton();
        botonCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        NIF_Voluntario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jTitulo1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(223, 232, 249));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jTitulo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTitulo2.setText("Dar de baja a un beneficiario");

        jLabel2.setText("DNI/NIF del beneficiario");

        NIF_CIF.setColumns(9);
        NIF_CIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIF_CIFKeyTyped(evt);
            }
        });

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

        jLabel4.setText("DNI voluntario");

        NIF_Voluntario.setBackground(new java.awt.Color(255, 255, 153));
        NIF_Voluntario.setColumns(9);
        NIF_Voluntario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIF_VoluntarioKeyTyped(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/beneficiarios.png"))); // NOI18N

        jTitulo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTitulo1.setText("Beneficiarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel17)
                        .addGap(69, 69, 69)
                        .addComponent(jTitulo1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTitulo2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NIF_Voluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NIF_CIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(botonOK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCancel)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NIF_CIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NIF_Voluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOK)
                    .addComponent(botonCancel))
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        boolean correcto;
        
        if (fase == 0){
            if (NIF_CIF.getText().compareTo("") != 0){
                
                /*Introducir DNI Beneficiario*/
                correcto = ONG.gestorBeneficiarios.introducirDNIBeneficiario(NIF_CIF.getText());

                /*Beneficiario correcto*/
                if (correcto == true){
                    
                    /*Cambios esteticos*/
                    NIF_CIF.setVisible(false);
                    jLabel2.setText("¿Desea borrar el beneficiario con NIF-CIF " + NIF_CIF.getText()+ "?");
                    jLabel4.setVisible(true);
                    NIF_Voluntario.setVisible(true);
                    fase = 1;
                    
                }else   /*No se encuentra el beneficiario*/
                    JOptionPane.showMessageDialog(this, "No se ha encontrado ningún beneficiario con ese NIF.",
                            "NIF Beneficiario", JOptionPane.ERROR_MESSAGE);
                
            }else{
                    JOptionPane.showMessageDialog(this, "El NIF del beneficiario no se ha introducido.",
                            "NIF Beneficiario", JOptionPane.ERROR_MESSAGE);
            }
        }else if (fase ==1){
            if (NIF_Voluntario.getText().compareTo("") != 0){
                
                /*IntroducirDNIVoluntario*/
                correcto = ONG.gestorVoluntarios.introducirDNIVoluntario(NIF_Voluntario.getText());
                
                if (correcto == true){
                    
                    /* ConfirmarBajaBeneficiario*/
                    ONG.gestorBeneficiarios.confirmarBajaBeneficiario(NIF_Voluntario.getText());
                    
                    /*Cambios esteticos*/
                    NIF_Voluntario.setVisible(false);
                    jLabel2.setText("El beneficiario ha sido dado de baja correctamente.");
                    jLabel4.setVisible(false);
                    fase = 2;
                    
                }else{
                     JOptionPane.showMessageDialog(this, "No se ha encontrado ningún voluntario con ese NIF.",
                            "NIF Voluntario", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "El NIF del voluntario no se ha introducido.",
                        "NIF Voluntario", JOptionPane.ERROR_MESSAGE);
            }
        }else
            UI.cl.show(UI.jPrincipal, "Beneficiarios");
    }//GEN-LAST:event_botonOKActionPerformed

    private void botonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelActionPerformed
            UI.cl.show(UI.jPrincipal, "Beneficiarios");
            // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelActionPerformed

    private void NIF_CIFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIF_CIFKeyTyped
        if (NIF_CIF.getText().length()>=9){
            evt.consume();
        } 
// TODO add your handling code here:
    }//GEN-LAST:event_NIF_CIFKeyTyped

    private void NIF_VoluntarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIF_VoluntarioKeyTyped
        if (NIF_Voluntario.getText().length()>=9){
            evt.consume();
        }
    }//GEN-LAST:event_NIF_VoluntarioKeyTyped

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
    private javax.swing.JTextField NIF_CIF;
    private javax.swing.JTextField NIF_Voluntario;
    private javax.swing.JButton botonCancel;
    private javax.swing.JButton botonOK;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jTitulo1;
    private javax.swing.JLabel jTitulo2;
    // End of variables declaration//GEN-END:variables
}
