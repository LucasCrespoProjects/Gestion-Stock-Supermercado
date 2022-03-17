
package datos;
import domain.Ventas;
import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Grupo 2
 */

public class VentasJDBC {
     private static final String sql_Select = "SELECT * FROM ventas WHERE Mes=?";
     private static final String sql_Select1 = "SELECT * FROM ventas ";
      
     
     public List<Ventas> Select(Ventas v1) {
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            ArrayList<Ventas> usu = new ArrayList();


            try {
                conn = Conexion.getConnection();
                stmt = conn.prepareStatement(sql_Select);
                stmt.setString(1, v1.getMes());
                rs = stmt.executeQuery();
                
                //int codigo,String nombre, int año,String genero,String nom_director, 
                //String estreno, String productora
                while (rs.next()) {//busca si hay un campo siguiente. si no lo hay sale del while
                    String mes = rs.getString(1);
                    double cant=rs.getDouble(2);
                    double cant_online=rs.getDouble(3);
                    
                    
                    usu.add(new Ventas(mes,cant,cant_online));
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
     public List<Ventas> Select1() {
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            ArrayList<Ventas> usu = new ArrayList();


            try {
                conn = Conexion.getConnection();
                stmt = conn.prepareStatement(sql_Select1);
                rs = stmt.executeQuery();
//                stmt.setString(1, v1.getMes());
                //int codigo,String nombre, int año,String genero,String nom_director, 
                //String estreno, String productora
                while (rs.next()) {//busca si hay un campo siguiente. si no lo hay sale del while
                    String mes = rs.getString(1);
                    double cant=rs.getDouble(2);
                    double cant_online=rs.getDouble(3);
//                    double total=rs.getDouble(4);
                    
                    usu.add(new Ventas(mes,cant,cant_online));
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
}
