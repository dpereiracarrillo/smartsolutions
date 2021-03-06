/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Movil;

import diaketas.Modelo.ONG.Movimiento;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author kesada
 */
public class UI extends javax.swing.JFrame {
    
    /**
     * 
     */
    public static CardLayout cl;
    
    public static ArrayList<Movimiento> movimientosEncontrados = null;
     
    /**
     * Creates new form Main
     */
    public UI() {
        initComponents();
        jPrincipalScroll.getViewport().setView(jPrincipal);
        cl = (CardLayout)(jPrincipal.getLayout());
        
        /*Paneles acciones */
        /*Categorias principales jPrincipal*/
        JPanel modificar = new jFormularioModificar2();   
        JPanel seleccionar = new jFormularioOpcion();
        
        /*JPrincipal*/
        jPrincipal.add("SeleccionarOpcion",seleccionar);
        jPrincipal.add("ModificarDonante", modificar);
        
        
        /*Mostramos el panel principal*/
        cl.show(jPrincipal, "SeleccionarOpcion");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPrincipal = new javax.swing.JPanel();
        jPrincipalScroll = new javax.swing.JScrollPane();

        setTitle("Diaketas");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("Principal");

        jPrincipal.setLayout(new java.awt.CardLayout());
        getContentPane().add(jPrincipal, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPrincipalScroll, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel jPrincipal;
    private javax.swing.JScrollPane jPrincipalScroll;
    // End of variables declaration//GEN-END:variables
}
