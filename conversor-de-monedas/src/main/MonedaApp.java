package main;

import entities.Moneda;
import service.AppService;
import utils.Conversor;

public class MonedaApp {
    public static void main(String[] args) {

        AppService as = new AppService();
        Moneda moneda = new Moneda();

        as.iniciarMenu();

        do {
            if (as.obtenerDatos()) { //este método solicita los valores al usuario y los guarda en AppService
                moneda = as.obtenerMoneda(); //Al tener todos los datos guardados en AppService ya podemos obtener la clase moneda

                as.mostrarResultados(moneda);
            };

        } while (as.otraConsulta()); //en este método le preguntamos al usuario si desea salir


        as.mostrarSalida();
    }


}
