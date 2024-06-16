package utils;

import entities.Moneda;

public class Conversor {

    public double realizarConversion(int cantidad, Moneda mon){
        var valor = mon.getValor();
        return (cantidad * valor);
    }

}
