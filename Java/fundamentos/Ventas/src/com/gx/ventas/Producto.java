package com.gx.ventas;

public class Producto {
 private final int idProducto;
 private String nombre;
 private double precio;
 private static int contadorProductos;
 
    public Producto(){
     idProducto=++Producto.contadorProductos;
    }
    public Producto(String nombre,double sueldo){
     this();
     this.nombre=nombre;
     this.precio=sueldo;
    }

    public int getIdClase() {
        return idProducto;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idClase=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
}
