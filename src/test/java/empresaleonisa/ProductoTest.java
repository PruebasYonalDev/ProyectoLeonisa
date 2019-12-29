package empresaleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductoTest {
        Producto p;

    @Before
    public void setUp() throws Exception {
        p = new Producto("123", 12000, "brasier","36b", "rojo", "algodón");
    }

    @Test
    public void Producto() {
        Assert.assertNotNull(p);
    }

    @Test
    public void getPrecio() {
        Assert.assertEquals("El dato no es el esperado", 12000, p.getPrecio(), 0);
    }

    @Test
    public void setPrecio() {
        p.setPrecio(200);
        Assert.assertEquals("El dato no es el esperado", 200, p.getPrecio(), 0);
    }

    @Test
    public void getCui() {
        Assert.assertEquals("El dato no es el esperado", "123", p.getCui());
    }
}