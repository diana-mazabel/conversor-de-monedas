package entities;

public class Menu {


    private String bienvenida = "---Bienvenido al conversor de monedas---\n";

    private String instrucciones = """
                Elige entre las siguientes opciones la moneda que deseas convertir.
                
                Luego selecciona la moneda a la que deseas convertir la cantidad.
                """;

    private String  monedas = """
                1 - USD - Dólar estadounidense
                2 - MXN - Peso mexicano
                3 - ARS - Peso argentino
                4 - CLP - Peso chileno
                5 - COP - Peso colombiano
                0 - Salir
                """;

    public String getBienvenida() {
        return bienvenida;
    }

    public void setBienvenida(String bienvenida) {
        this.bienvenida = bienvenida;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getMonedas() {
        return monedas;
    }

    public void setMonedas(String monedas) {
        this.monedas = monedas;
    }


}
