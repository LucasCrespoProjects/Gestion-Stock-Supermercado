package datos;
//import domain.Usuarios;
import domain.Usuarios;
import java.sql.*;
import java.util.*;

import test.FIniciarSesion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 2
 */
public class UsuariosJDBC {

    private static final String sql_Select2 = "SELECT * FROM usuarios";
    private static final String sql_Insert = "INSERT INTO usuarios(Usuario,Contraseña,Puesto) VALUES (?,?,?)";

    public List<Usuarios> Select() {
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            ArrayList<Usuarios> usu = new ArrayList();


            try {
                conn = Conexion.getConnection();
                stmt = conn.prepareStatement(sql_Select2);
                
                rs = stmt.executeQuery();
                //int codigo,String nombre, int año,String genero,String nom_director, 
                //String estreno, String productora
                while (rs.next()) {//busca si hay un campo siguiente. si no lo hay sale del while
                    int id=rs.getInt(1);
                    String usuario = rs.getString("Usuario");
                    String contraseña = rs.getString("Contraseña");
                    String puesto=rs.getString("Puesto");
                    usu.add(new Usuarios(id,usuario, contraseña,puesto));
                }

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
            } finally {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            }

            return usu;
        }
     public int insert(Usuarios us1) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_Insert);
//            stmt.setInt(1, p1.getId_producto());
             System.out.println("Entro al metodo");
            stmt.setString(1, us1.getUsuario());
            stmt.setString(2, us1.getContraseña());
            stmt.setString(3, us1.getPuesto());

            System.out.println("Ejecutando query: " + sql_Insert);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;

    }
}
