package entities;

public class Moneda {

    private String monedaBase; //moneda inicial
    private String monedaObjetivo; //moneda a la que se desea convertir

    private double valor; //valor de la moneda a la que se desea convertir

    public Moneda() {

    }

    public Moneda(String monedaBase, String monedaObjetivo, double valor) {
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;
        this.valor = valor;
    }

    //getters y setters


    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public void setMonedaObjetivo(String monedaObjetivo) {
        this.monedaObjetivo = monedaObjetivo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "entities.Moneda "+monedaBase+ " {" +
                "moneda='" + monedaObjetivo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
