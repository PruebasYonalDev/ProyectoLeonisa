package empresaleonisa;

import java.util.ArrayList;
import java.util.Vector;

public class Pedido {

    private int cantidadUnidad;
    private Vector<Object> p = new Vector<Object>();

    public Pedido() {}

    public Pedido(int cantidadUnidad) {
        this.cantidadUnidad = cantidadUnidad;
    }

    public void asignarProducto(Leonisa leonisa) {
        p.add(leonisa);
    }

    public void asignarProducto(Leo leo) {
        p.add(leo);
    }

    public void asignarProducto(Teen teen) {
        p.add(teen);
    }


}
