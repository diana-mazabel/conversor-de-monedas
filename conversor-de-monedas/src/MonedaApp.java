public class MonedaApp {
    public static void main(String[] args) {
        ConsultaAPI consultaAPI = new ConsultaAPI();
        var monedaBase = "USD";
        var monedaObjetivo = "MXN";

        Moneda moneda = consultaAPI.consulta(monedaBase, monedaObjetivo);
        System.out.println(moneda);

    }
}
