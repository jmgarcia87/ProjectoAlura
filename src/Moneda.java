public class Moneda {
    private String nombre;
    private double valor;

    //constructor
    public Moneda(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }

    //setters
    public void setValor(double valor) {
        this.valor = valor;
    }
}
