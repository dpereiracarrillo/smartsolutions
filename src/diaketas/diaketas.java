/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas;

import de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel;
import diaketas.Modelo.ONG.ONG;
import diaketas.UI.UI;
import javax.swing.UIManager;

/**
 *
 * @author kesada
 */
public class diaketas {
    public static ONG ong;
    
    public static void main(String args[]){
        
        /*Look & Feel*/
/*        try{
           UIManager.setLookAndFeel(new SyntheticaBlueMoonLookAndFeel());
        } catch (Exception e) {
        }
*/      
        /*Creamos gestor principal ONG*/
        ong = new ONG();

        /*Iniciamos la interfaz*/
        UI ui = new UI();
        ui.setVisible(true);
    }
}
