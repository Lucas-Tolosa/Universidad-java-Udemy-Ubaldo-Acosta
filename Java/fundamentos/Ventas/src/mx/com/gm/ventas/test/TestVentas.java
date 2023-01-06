package mx.com.gm.ventas.test;
import com.gx.ventas.*;
public class TestVentas {
    public static void main(String[] args) {
        Producto producto1 = new Producto("remera",50.00);
        Producto producto2 = new Producto("camisa",100.00);
        Producto producto3 = new Producto("pantalon",50.00);
        
        
        Orden orden1=new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.mostrarOrden();
    }
}
