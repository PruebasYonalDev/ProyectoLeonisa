package empresaleonisa;

import java.util.ArrayList;
import java.util.Vector;

public class Pedido {

    private int cantidadUnidad;
    //private Vector<Object> Vleonisa = new Vector<Object>();
    private Vector<Object> Vleonisa = new Vector<Object>();
    private Vector<Object> Vleo = new Vector<Object>();
    private Vector<Object> Vteen = new Vector<Object>();
    private Vector<Object> t = new Vector<Object>();

    public Pedido() {}

    public Pedido(int cantidadUnidad) {
        this.cantidadUnidad = cantidadUnidad;
    }

    public void asignarProducto(Leonisa leonisa, Pedido cantidadUnidad) {
        Vleonisa.add(cantidadUnidad);
        Vleonisa.add(leonisa);
    }

    public void asignarProducto(Leo leo, Pedido pedido) {

        Vleo.add(leo);
    }

    public void asignarProducto(Teen teen) {
        Vteen.add(teen);
    }

    public Object totalCompra(Leonisa leonisa) {

        leonisa.getPrecio();

        return t;
    }

    public Object totalCompra(Leo leo, int cantidadUnidad) {

        t.add(cantidadUnidad * leo.getPrecio());

        return t;
    }

    public Object totalCompra(Teen teen, int cantidadUnidad) {

        t.add(cantidadUnidad * teen.getPrecio());

        return t;
    }


}
