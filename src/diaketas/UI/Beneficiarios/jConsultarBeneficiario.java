/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Beneficiarios;

import diaketas.UI.UI;
import diaketas.Modelo.ONG.Beneficiario;
import java.awt.Font;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author kesada
 */
public class jConsultarBeneficiario extends javax.swing.JPanel {

    JPanel panel;
    Beneficiario datosBeneficiario;

    
    /**
     * Creates new form jAltaBeneficiario
     * @param datosBeneficiario 
     */
    public jConsultarBeneficiario(Beneficiario datosBeneficiario) {
        this.datosBeneficiario = datosBeneficiario;

        
        /*Iniciamos la interfaz*/
        initComponents();
        
        /*Mostramos los datos de beneficiario*/
        NIF.setText(datosBeneficiario.NIF_CIF);
        Nombre.setText(datosBeneficiario.Nombre);
        Email.setText(datosBeneficiario.Email);
        Apellidos.setText(datosBeneficiario.Apellidos);
        
        Nacionalidad.setText(datosBeneficiario.Nacionalidad);
        Estado_Civil.setText(datosBeneficiario.Estado_civil);
        Domicilio.setText(datosBeneficiario.Domicilio);
        if (datosBeneficiario.Expediente != 0)
            Expediente.setText(Integer.toString(datosBeneficiario.Expediente));
        if (datosBeneficiario.Codigo_Postal != 0)
            Codigo_Postal.setText(Integer.toString(datosBeneficiario.Codigo_Postal));
        Localidad.setText(datosBeneficiario.Localidad);
        if (datosBeneficiario.Telefono != 0)
            Telefono.setText(Integer.toString(datosBeneficiario.Telefono));
        Tipo_Vivienda.setText(datosBeneficiario.Tipo_Vivienda);
        if (datosBeneficiario.Precio_Vivienda != 0.0)
            Precio_Vivienda.setText(Double.toString(datosBeneficiario.Precio_Vivienda));
        Motivo.setText(datosBeneficiario.Motivo);
        Tipo_Vivienda.setText(datosBeneficiario.Observaciones_Datos_Personales);
        Experiencia_Laboral.setText(datosBeneficiario.Experiencia_Laboral);
        Observaciones_Datos_Personales.setText(datosBeneficiario.Observaciones_Datos_Personales);
        Observaciones_Familiares.setText(datosBeneficiario.Observaciones_Familiares);        
        Observaciones_Vivienda.setText(datosBeneficiario.Observaciones_Vivienda);
        Ciudad_Nacimiento.setText(datosBeneficiario.Ciudad_Nacimiento);
        Situacion_Economica.setText(datosBeneficiario.Situacion_Economica);
        Nivel_Estudios.setText(datosBeneficiario.Nivel_Estudios);
        Profesion.setText(datosBeneficiario.Profesion);
        Tipo_Vivienda.setText(datosBeneficiario.Experiencia_Laboral);
        
        /* Representamos la fecha*/
        SimpleDateFormat formatoFecha=new java.text.SimpleDateFormat("dd/MM/yy");
        Fecha_Nacimiento.setText(formatoFecha.format(datosBeneficiario.FechaNac));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonConsultar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Observaciones_Datos_Personales_SB = new javax.swing.JScrollPane();
        Observaciones_Datos_Personales = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTitulo5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jTitulo4 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTitulo2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Observaciones_Familiares_SB = new javax.swing.JScrollPane();
        Observaciones_Familiares = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTitulo3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        Experiencia_Laboral_SB = new javax.swing.JScrollPane();
        Experiencia_Laboral = new javax.swing.JTextArea();
        Observaciones_Vivienda_SB = new javax.swing.JScrollPane();
        Observaciones_Vivienda = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonOK = new javax.swing.JButton();
        Motivo = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        Fecha_Nacimiento = new javax.swing.JLabel();
        Nacionalidad = new javax.swing.JLabel();
        Domicilio = new javax.swing.JLabel();
        Localidad = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Profesion = new javax.swing.JLabel();
        Tipo_Vivienda = new javax.swing.JLabel();
        Precio_Vivienda = new javax.swing.JLabel();
        Situacion_Economica = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Nivel_Estudios = new javax.swing.JLabel();
        NIF = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Estado_Civil = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Codigo_Postal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Expediente = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Ciudad_Nacimiento = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTitulo1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(223, 232, 249));
        setForeground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(32767, 500));
        setPreferredSize(new java.awt.Dimension(1100, 518));

        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/consultar_familiar.png"))); // NOI18N
        botonConsultar.setText("Consultar");
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });

        jLabel21.setText("Observaciones de los datos personales");

        jLabel15.setText("Situacion");

        jLabel6.setText("Nacimiento");

        jLabel16.setText("Email");

        jLabel4.setText("Nombre");

        jLabel24.setText("Motivo");

        Observaciones_Datos_Personales.setColumns(20);
        Observaciones_Datos_Personales.setEditable(false);
        Observaciones_Datos_Personales.setRows(5);
        Observaciones_Datos_Personales_SB.setViewportView(Observaciones_Datos_Personales);

        jLabel23.setText("Profesión");

        jLabel25.setText("Observaciones de la vivienda");

        jLabel22.setText("Estudios");

        jTitulo5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTitulo5.setText("Familiares");

        jTitulo4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTitulo4.setText("Situación economica");

        jLabel29.setText("Observaciones de los familiares");

        jTitulo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTitulo2.setText("Dar de alta a un beneficiario");

        jLabel28.setText("Tipo");

        Observaciones_Familiares.setColumns(20);
        Observaciones_Familiares.setEditable(false);
        Observaciones_Familiares.setRows(5);
        Observaciones_Familiares_SB.setViewportView(Observaciones_Familiares);

        jLabel5.setText("Apellidos");

        jTitulo3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTitulo3.setText("Vivienda");

        jLabel7.setText("Nacionalidad");

        jLabel9.setText("Domicilio");

        jLabel27.setText("Experiencia laboral");

        Experiencia_Laboral_SB.setEnabled(false);

        Experiencia_Laboral.setColumns(20);
        Experiencia_Laboral.setEditable(false);
        Experiencia_Laboral.setRows(5);
        Experiencia_Laboral_SB.setViewportView(Experiencia_Laboral);

        Observaciones_Vivienda.setColumns(20);
        Observaciones_Vivienda.setEditable(false);
        Observaciones_Vivienda.setRows(5);
        Observaciones_Vivienda_SB.setViewportView(Observaciones_Vivienda);

        jLabel11.setText("Localidad");

        jLabel18.setText("Precio Vivienda");

        jLabel12.setText("Telefono");

        jLabel2.setText("NIF");

        botonOK.setText("Ok");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        jLabel17.setText("Estado Civil");

        jLabel8.setText("Codigo Postal");

        jLabel10.setText("Expediente");

        jLabel19.setText("en");

        Ciudad_Nacimiento.setText("ddddd");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/beneficiarios.png"))); // NOI18N

        jTitulo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTitulo1.setText("Beneficiarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel27)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Observaciones_Datos_Personales_SB, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Experiencia_Laboral_SB, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTitulo2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel24))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NIF)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel10)
                                        .addGap(24, 24, 24)
                                        .addComponent(Expediente))
                                    .addComponent(Motivo)))
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(jLabel22)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nombre)
                                    .addComponent(Apellidos)
                                    .addComponent(Domicilio)
                                    .addComponent(Estado_Civil)
                                    .addComponent(Nacionalidad)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Telefono)
                                            .addComponent(Codigo_Postal)
                                            .addComponent(Nivel_Estudios))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Profesion)
                                            .addComponent(Email)
                                            .addComponent(Localidad)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Fecha_Nacimiento)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(Ciudad_Nacimiento)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tipo_Vivienda)
                                    .addComponent(Precio_Vivienda)))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTitulo3)
                            .addComponent(jLabel28)
                            .addComponent(jLabel25)
                            .addComponent(Observaciones_Vivienda_SB, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTitulo4)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(Situacion_Economica))
                            .addComponent(jTitulo5)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(Observaciones_Familiares_SB, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(botonOK)))
                .addGap(288, 288, 288))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel20)
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
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTitulo2)
                    .addComponent(jTitulo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NIF)
                            .addComponent(jLabel10)
                            .addComponent(Expediente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(Motivo))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Apellidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Fecha_Nacimiento)
                            .addComponent(jLabel19)
                            .addComponent(Ciudad_Nacimiento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Nacionalidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(Estado_Civil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Domicilio))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Codigo_Postal)
                            .addComponent(jLabel11)
                            .addComponent(Localidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Telefono)
                            .addComponent(jLabel16)
                            .addComponent(Email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(Nivel_Estudios)
                            .addComponent(jLabel23)
                            .addComponent(Profesion))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Experiencia_Laboral_SB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(Tipo_Vivienda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(Precio_Vivienda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Observaciones_Vivienda_SB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTitulo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(Situacion_Economica))
                        .addGap(18, 18, 18)
                        .addComponent(jTitulo5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Observaciones_Familiares_SB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Observaciones_Datos_Personales_SB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(botonOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonConsultar.setVerticalTextPosition(SwingConstants.BOTTOM); botonConsultar.setHorizontalTextPosition(SwingConstants.CENTER); botonConsultar.setFont(new Font("Courier", Font.BOLD,14));
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        panel = new jListarFamiliar("ConsultarBeneficiario", "ConsultarFamiliar");

        UI.jPrincipal.add("ListarFamiliar", panel);
        UI.cl.show(UI.jPrincipal, "ListarFamiliar");
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        UI.cl.show(UI.jPrincipal, "Beneficiarios"); 
    }//GEN-LAST:event_botonOKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel Ciudad_Nacimiento;
    private javax.swing.JLabel Codigo_Postal;
    private javax.swing.JLabel Domicilio;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Estado_Civil;
    private javax.swing.JLabel Expediente;
    private javax.swing.JTextArea Experiencia_Laboral;
    private javax.swing.JScrollPane Experiencia_Laboral_SB;
    private javax.swing.JLabel Fecha_Nacimiento;
    private javax.swing.JLabel Localidad;
    private javax.swing.JLabel Motivo;
    private javax.swing.JLabel NIF;
    private javax.swing.JLabel Nacionalidad;
    private javax.swing.JLabel Nivel_Estudios;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextArea Observaciones_Datos_Personales;
    private javax.swing.JScrollPane Observaciones_Datos_Personales_SB;
    private javax.swing.JTextArea Observaciones_Familiares;
    private javax.swing.JScrollPane Observaciones_Familiares_SB;
    private javax.swing.JTextArea Observaciones_Vivienda;
    private javax.swing.JScrollPane Observaciones_Vivienda_SB;
    private javax.swing.JLabel Precio_Vivienda;
    private javax.swing.JLabel Profesion;
    private javax.swing.JLabel Situacion_Economica;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel Tipo_Vivienda;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonOK;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jTitulo1;
    private javax.swing.JLabel jTitulo2;
    private javax.swing.JLabel jTitulo3;
    private javax.swing.JLabel jTitulo4;
    private javax.swing.JLabel jTitulo5;
    // End of variables declaration//GEN-END:variables
}
