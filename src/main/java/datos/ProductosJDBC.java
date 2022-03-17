package datos;

import domain.Productos;
import test.FCambioPrecios;
import java.sql.*;
import java.util.*;
//import java.sql.Date;

/**
 *
 * @author Grupo 2
 */
public class ProductosJDBC {

//    public class ProductosJDBC {
    private static final String sql_Select = "SELECT * FROM productos";
    private static final String sql_Insert = "INSERT INTO productos(Nombre,Categoria,Cantidad,Stock_productos,Precio_Unitario,Oferta) VALUES (?,?,?,?,?,?)";
    private static final String sql_Update = "UPDATE productos SET Id_Producto = ?,Nombre=?,Categoria=?,Cantidad=?,Stock_productos=?,Precio_Unitario=?,Oferta=?";
    private static final String sql_Update2 = "UPDATE productos SET Precio_Unitario=? WHERE Id_Producto = ?";
    private static final String sql_Update1 = "UPDATE productos SET Oferta=? WHERE Id_Producto = ?";
    private static final String sql_Delete = "DELETE FROM productos WHERE Id_Producto = ?";
    

    public List<Productos> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Productos> p = new ArrayList();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_Select);
            rs = stmt.executeQuery();
            
            while (rs.next()) {//busca si hay un campo siguiente. si no lo hay sale del while
                int id = rs.getInt(1);
                String nombre = rs.getString("Nombre");
                String categoria = rs.getString("Categoria");
                int cantidad = rs.getInt(4);
                String stock = rs.getString("Stock_productos");
                String precio = rs.getString("Precio_Unitario");
                String oferta = rs.getString("Oferta");
                p.add(new Productos(id,nombre, categoria, cantidad, stock, precio, oferta));
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return p;
    }
        
    

    public int insert(Productos p1) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_Insert);
//            stmt.setInt(1, p1.getId_producto());
            stmt.setString(1, p1.getNombre());
            stmt.setString(2, p1.getCategoria());
            stmt.setInt(3, p1.getCantidad());
            stmt.setString(4, p1.getStock());
            stmt.setString(5, p1.getPrecio());
            stmt.setString(6, p1.getOferta());

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
//    public int insert1(ArrayList<Productos> arr) {
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        int rows = 0;
//        try {
//            conn = Conexion.getConnection();
//            stmt = conn.prepareStatement(sql_Insert);
//            for (int i1 = 0; i1 < arr.size(); i1++){
//                stmt.setInt(1,arr.get(i1).getId_producto());
//                stmt.setString(2,arr.get(i1).getNombre());
//                stmt.setString(3,arr.get(i1).getCategoria());
//                stmt.setInt(4,arr.get(i1).getCantidad());
//                stmt.setString(5,arr.get(i1).getStock());
//                stmt.setString(6,arr.get(i1).getPrecio());
//                stmt.setString(7,arr.get(i1).getOferta());
//                System.out.println("Ejecutando query: " + sql_Insert);
//                rows = stmt.executeUpdate();
//                System.out.println("Registros afectados: " + rows);
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        } finally {
//            Conexion.close(stmt);
//            Conexion.close(conn);
//        }
//        return rows;
//
//    }
    
    public int Update(Productos p1) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + sql_Update2);
            stmt = conn.prepareStatement(sql_Update2);
            stmt.setInt(2, p1.getId_producto());
            stmt.setString(1, p1.getPrecio());
            System.out.println(" "+stmt);
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
//    public int Update1(Productos p1) {
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        int rows = 0;
//        try {
//            conn = Conexion.getConnection();
//            System.out.println("Ejecutando query: " + sql_Update);
//            stmt = conn.prepareStatement(sql_Update);
//             stmt.setInt(1, p1.getId_producto());
//             stmt.setString(2, p1.getNombre());
//             stmt.setString(3, p1.getCategoria());
//             stmt.setInt(4, p1.getCantidad());
//             stmt.setString(5, p1.getStock());
//             stmt.setString(6, p1.getPrecio());
//             stmt.setString(7, p1.getOferta());
//           
//            
//
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        } finally {
//            Conexion.close(stmt);
//            Conexion.close(conn);
//        }
//        return rows;
//
//    }
     public int Update2(Productos p1) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + sql_Update1);
            stmt = conn.prepareStatement(sql_Update1);
            stmt.setString(1, p1.getOferta());
            stmt.setInt(2, p1.getId_producto());
            
          
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
    public Boolean delete(int id){
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: "+sql_Update);
            stmt = conn.prepareStatement(sql_Delete);
            stmt.setInt(1, id);
            int i=stmt.executeUpdate();
            return i != 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            return false;
        }
        finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

    }

}
