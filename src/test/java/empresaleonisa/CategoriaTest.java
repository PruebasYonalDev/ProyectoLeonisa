package empresaleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoriaTest {

    Categoria cat;

    @Before
    public void setUp() throws Exception {
        cat = new Categoria("panti", "m","negro", "algodón");
    }

    @Test
    public void getTipoPrenda() {
        Assert.assertEquals("Dato no esperado", "panti", cat.getTipoPrenda());
    }

    @Test
    public void getTalla() {
        Assert.assertEquals("Dato no esperado", "m", cat.getTalla());
    }

    @Test
    public void getColor() {
        Assert.assertEquals("Dato no esperado", "negro", cat.getColor());
    }

    @Test
    public void getMaterial() {
        Assert.assertEquals("Dato no esperado", "algodón", cat.getMaterial());
    }
}