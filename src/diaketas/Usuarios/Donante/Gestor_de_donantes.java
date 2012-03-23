/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.Usuarios.Donante;

import diaketas.ConexionBD;
import diaketas.Usuarios.Accion;
import diaketas.Usuarios.ONG;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class Gestor_de_donantes {

    static Donante datosDonante;
    static String NIF_Voluntario;

    static public boolean introducirDatosDonante(String NIF_CIF, String Nombre, String Apellidos, Date FechaNac, String Localidad, String Email, int Telefono,
            String Tipo_Donante, Date Fecha_Inscripcion, String Observaciones, int Periodicidad_Donaciones, double Cuantia_Donaciones,
            String Tipo_Periodicidad, String NIF_Vol) {

        datosDonante = new Donante(NIF_CIF, Nombre, Apellidos, FechaNac, Localidad, 1, new Date(), Email, Telefono, Tipo_Donante, Fecha_Inscripcion,
                Observaciones, Periodicidad_Donaciones, Cuantia_Donaciones, Tipo_Periodicidad);


        NIF_Voluntario = NIF_Vol;
        //return ONG.comprobarExistenciaVoluntario(NIF_Voluntario);
        return true;
    }

    static public void RegistrarOperacion(String DNI_Voluntario, String DNI, String Tipo) {
        Accion ac = new Accion(DNI_Voluntario, DNI, Tipo, new Date());
        ONG.agregarAccion(ac);
    }

    public static void confirmarFinAlta() {

        /*
         * Crear beneficiario
         */
        Donante nuevoDonante = Donante.crearDonante(datosDonante.NIF_CIF, datosDonante.Nombre,
                datosDonante.Apellidos, datosDonante.FechaNac, datosDonante.Localidad, datosDonante.Email,
                datosDonante.Telefono, datosDonante.Tipo_Donante, datosDonante.Fecha_Inscripcion,
                datosDonante.Observaciones, datosDonante.Periodicidad_Donaciones,
                datosDonante.Cuantia_Donaciones, datosDonante.Tipo_Periodicidad);

        /*
         * Registrar Beneficiario
         */
        ONG.agregarNuevoDonante(nuevoDonante);

        /*
         * Registrar Operacion
         */
        Gestor_de_donantes.RegistrarOperacion(NIF_Voluntario, datosDonante.NIF_CIF, "Alta_Donante");
    }

    public static Boolean comprobarDniDonante(String NIF_CIF) {

        Boolean existe = false;

        ConexionBD con;
        Statement s;
        ResultSet rs;

        //Me conecto a la BD
        con = new ConexionBD();
        con.conectarBD();
        try {
            s = con.conexion().createStatement();
            rs = s.executeQuery("select * from Voluntario where NIF_CIF = '"
                    + NIF_CIF + "'");
            if (rs.next()) {
                existe = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gestor_de_donantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }
}
