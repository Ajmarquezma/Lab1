/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.punto.pkg2;

/**
 *
 * @author FLIA. ESCAMAL
 */
public class SubtotalPedido {

    private Producto producto;
    private int cantidadProducto;
    private Inventario inventario;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public SubtotalPedido(Producto producto, int cantidadProducto, Inventario inventario) {
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
        this.inventario.obtenerCantidadPedido(producto, cantidadProducto);

    }

    public double getsubtotalPedido() {
        double total_dinero_pedido;
        total_dinero_pedido = producto.getPrecioVenta() * cantidadProducto;
        return total_dinero_pedido;
    }

    @Override
    public String toString() {
        return "SubtotalPedido: " + '\n' + "producto: " + producto + '\n' + "cantidadProducto: " + cantidadProducto + '\n' + "Subtotal: " + getsubtotalPedido();
    }
}
