package service;

import entities.Moneda;
import utils.ConsultaAPI;
import utils.Conversor;

public class AppService {
    MenuService ms = new MenuService();
    Conversor con = new Conversor();

    String monedaBase = "";
    String monedaObjetivo = "";
    int cantidad;


    //mostrar la bienvenida
    public void iniciarMenu(){
        ms.mostrarBienvenida();
        ms.mostrarInstrucciones();
    }

    //método para obtener el input del usuario de la moneda Base
    private String seleccionDe(){
        String moneda = "";
        int op = ms.seleccionDe();
        if (op != 0){
            moneda = switchMoneda(op);
        }
        return moneda;
    }

    //método para obtener el input del usuario de la moneda Objetivo
    private String seleccionA(){
        String moneda = "";
        int op = ms.seleccionA();
        if (op != 0){
            moneda = switchMoneda(op);
        }
        return moneda;
    }

    private String switchMoneda(int op){
        String moneda ="";
        switch (op){
            case 1:
                moneda = "USD";
                break;
            case 2:
                moneda = "MXN";
                break;
            case 3:
                moneda = "ARS";
                break;
            case 4:
                moneda = "CLP";
                break;
            case 5:
                moneda = "COP";
                break;
        }
        return moneda;
    }

    public boolean obtenerDatos() {
        boolean valido = false;
        monedaBase = seleccionDe();
        if (!monedaBase.isBlank()){
            monedaObjetivo = seleccionA();
            if (!monedaObjetivo.isBlank()){
                cantidad = obtenerCantidad();
                if (cantidad > 0){
                    valido = true;
                }
            }
        }
        return valido;
    }

    private int obtenerCantidad(){
        return ms.obtenerCantidad();
    }


    //este método hace la consulta a la api
    public Moneda obtenerMoneda(){
        ConsultaAPI consultaAPI = new ConsultaAPI();
        return consultaAPI.consulta(monedaBase, monedaObjetivo);
    }

    public boolean otraConsulta(){
        return ms.otraConsulta();
    }

    public void mostrarResultados (Moneda moneda){
        var mB = moneda.getMonedaBase();
        var mO = moneda.getMonedaObjetivo();
        var valor = moneda.getValor();
        var resultado = con.realizarConversion(cantidad, moneda);
        System.out.println("----------------------------");
        System.out.printf("1 " + mB + " = " + "%,.3f" + " "+mO +"\n", valor);
        System.out.printf(cantidad + " " + mB + " = " + "%,.3f" + " "+mO +"\n", resultado);
        System.out.println("----------------------------\n");
    }

    public void mostrarSalida(){
        System.out.println("Programa finalizado");
    }
}
