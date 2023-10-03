package co.com.tienda_epica.model;

public class Producto {
    private int idProducto;
    private String nombre;
    private String descripcionProducto;
    private double precio;
    private double costo;
    private double cantidad;

    public Producto() {
    }

    public Producto(String nombre, String descripcionProducto, double precio, double costo, double cantidad) {
        this.nombre = nombre;
        this.descripcionProducto = descripcionProducto;
        this.precio = precio;
        this.costo = costo;
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
