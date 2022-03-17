
package datos;
import domain.Pedidos;

import java.sql.*;
import java.util.*;
/**
 *
 * @author Grupo 2
 */
public class PedidosJDBC {
    private static final String sql_Select = "SELECT * FROM pedidos";
    private static final String sql_Insert = "INSERT INTO pedidos(nombre,categoria,cantidad_de_pedidos,Precio_pedido ) VALUES (?,?,?,?)";
    private static final String sql_Update = "UPDATE pelicula SET  nombre=?, categoria=?,cantidad_de_pedidos=?,Precio_pedido=? WHERE Numero_de_pedido = ?";
    private static final String sql_Delete = "DELETE FROM pedidos WHERE Numero_de_pedido = ?";
   
    public List<Pedidos> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Pedidos> p1 = new ArrayList();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_Select);
            rs = stmt.executeQuery();
            //int codigo,String nombre, int año,String genero,String nom_director, 
            //String estreno, String productora
            while (rs.next()) {//busca si hay un campo siguiente. si no lo hay sale del while
                int Npedido=rs.getInt("Numero de pedido");
                String nombre=rs.getString("nombre");
                String categoria=rs.getString("categoria");
                int cantidad=rs.getInt("cantidad de pedidos");
                String precio=rs.getString("Precio pedido");
                
                p1.add(new Pedidos(Npedido,nombre,categoria,cantidad,precio));
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return p1;
    }

    public int insert(Pedidos p1) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            System.out.println("Entro al metodo insert");
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_Insert);
//            stmt.setInt(1, p1.getId());
            stmt.setString(1, p1.getNombre());
            stmt.setString(2, p1.getCategoria());
            stmt.setInt(3, p1.getCantidad());
            stmt.setString(4, p1.getPrecio());
            
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
    public int Update(Pedidos p1) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + sql_Update);
            stmt = conn.prepareStatement(sql_Update);
            stmt.setInt(1, p1.getId());
            stmt.setString(2, p1.getNombre());
            stmt.setInt(3, p1.getCantidad());
            stmt.setString(4, p1.getCategoria());
            stmt.setString(5, p1.getPrecio());

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
    public void delete(int id){
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: "+sql_Update);
            stmt = conn.prepareStatement(sql_Delete);
            stmt.setInt(1, id);

           stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

    }

}
