package co.com.tienda_epica.dao;
import co.com.tienda_epica.conexion.Conexion;
import co.com.tienda_epica.model.Producto;
import com.sun.source.tree.TryTree;

import java.sql.*;

public class ProductoDao {
    public static void crearProductoDB(Producto registro){
        Conexion connect = new Conexion();

        try(Connection conexion = connect.get_connection()){
            PreparedStatement ps= null;

            try{
                String query = "INSERT INTO producto(nombre, descripcion, precio, costo, cantidad) VALUES(?,?,?,?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1,registro.getNombre());
                ps.setString(2,registro.getDescripcionProducto());
                ps.setDouble(3,registro.getPrecio());
                ps.setDouble(4,registro.getCosto());
                ps.setDouble(5, registro.getCantidad());
                ps.executeUpdate();
                System.out.println("Registro de producto exitoso");


            }catch (SQLException e){
                System.out.println(e);
            }

        } catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void listarProductosDB(){
        Conexion conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try(Connection connect = conexion.get_connection()){
            String query = "SELECT * FROM producto";
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();

            while(rs.next()){
                System.out.print("Id producto: "+ rs.getInt("Id"));
                System.out.print(" | ");
                System.out.print("Nombre del producto: " + rs.getString("nombre"));
                System.out.print(" | ");
                System.out.print("Descripcion del producto: "+ rs.getString("descripcion"));
                System.out.print(" | ");
                System.out.print("Precio del prodcuto: "+ rs.getDouble("precio"));
                System.out.print(" | ");
                System.out.print("Costo del prodcuto: "+ rs.getDouble("costo"));
                System.out.print(" | ");
                System.out.println("Cantidad del prodcuto: "+ rs.getDouble("cantidad"));
            }

        }catch (SQLException e){
            System.out.println("No se recuperaron registros");
            System.out.println(e);
        }
    }

    public static void modificarProductosDB(){}

    public static void borrarProductoDB(int idProducto){
        Conexion conexion = new Conexion();
        try(Connection connect = conexion.get_connection()) {
            PreparedStatement ps = null;
            try{
                String query = "DELETE FROM producto WHERE producto.Id =?";
                ps = connect.prepareStatement(query);
                ps.setInt(1, idProducto);
                ps.executeUpdate();
                System.out.println("El resgistro se elimino de manera correcta");
            } catch (SQLException e){
                System.out.println("No se elimino el registro");
                System.out.println(e);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }


}
