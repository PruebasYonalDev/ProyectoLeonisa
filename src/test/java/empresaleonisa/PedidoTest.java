package empresaleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class PedidoTest {

    private Pedido pedidoLeonisa;
    private Pedido pedidoLeo;
    private Pedido pedidoTeen;
    private Leonisa leonisa;
    private Leo leo;
    private Teen teen;

    private Vector<Producto> producto = new Vector<Producto>();

    @Before
    public void setUp() throws Exception {
        Pedido p;
        pedidoLeonisa = new Pedido(2);
        pedidoLeo = new Pedido(3);
        pedidoTeen = new Pedido(2);
        leonisa = new Leonisa("AFF001", 35000, "Faja", "S", "Negro", "Algodón");
        leo = new Leo("AFC001", 15000, "Camisilla", "S", "Blanco", "Algodón");
        teen = new Teen("AFB003", 25000, "Bra", "34C", "Morado", "Algodón");

        producto.add(leonisa);
        producto.add(leo);
        producto.add(teen);
    }

    @Test
    public void asignarProducto() {
        Assert.assertNotNull("No se ha asignado un producto 'Leonisa' al pedido", leonisa);
    }

    @Test
    public void asignarProductoTest() {
        Assert.assertNotNull("No se ha asignado un producto 'Leonisa' al pedido", producto.contains(leo));
    }

    @Test
    public void asignarProductoT() {
        Assert.assertNotNull("No se ha asignado un producto 'Leonisa' al pedido", producto.contains(teen));
    }




}