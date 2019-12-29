package empresaleonisa;

public class Producto {


    private String ciu;
    private double precio;
    private Categoria categoria;

    public Producto(){}

    public Producto(String ciu, double precio, String tipoPrenda, String talla, String color, String material){
        categoria = new Categoria(tipoPrenda, talla, color, material);
        this.ciu = ciu;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCui() {
        return ciu;
    }





}
