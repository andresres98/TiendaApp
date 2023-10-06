package co.com.tienda_epica.service;

import co.com.tienda_epica.dao.ProductoDao;
import co.com.tienda_epica.model.Producto;

import java.util.Scanner;

public class ProductoService {
    static Scanner sc = new Scanner(System.in);
    public static void crearProducto(){
        System.out.println("Ingrese el nombre del producto");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la descripcion dle producto");
        String descripcion = sc.nextLine();
        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextDouble();
        System.out.println("Ingrese el costo del producto");
        double costo = sc.nextDouble();
        System.out.println("Ingrese la cantidad del producto");
        double cantidad= sc.nextDouble();


        Producto registro = new Producto();
        registro.setNombre(nombre);
        registro.setDescripcionProducto(descripcion);
        registro.setPrecio(precio);
        registro.setCosto(costo);
        registro.setCantidad(cantidad);

        ProductoDao.crearProductoDB(registro);


    }
    public static void listarProductos(){
        ProductoDao.listarProductosDB();
    }

    public static void modificarProductos(){
        System.out.println("Indique para modificar: 1: Nombre " +
                "2:Descripcion " +
                "3: Precio " +
                "4: Costo " +
                "5: Cantidad ");
        int opc = sc.nextInt();
        switch (opc){
            case 1:
                System.out.println("Modificar nombre");
                System.out.println("Ingrese el nuevo valor");
                String nombre = sc.next();
                System.out.println("Indique el id del producto a actualizar");
                int id = sc.nextInt();
                Producto update = new Producto();
                update.setNombre(nombre);

        }
    }

    public static void borrarProducto(){
        System.out.println("Indique el id del producto a borrar");
        int idProducto = sc.nextInt();
        ProductoDao.borrarProductoDB(idProducto);
    }





}
