package service;

import entities.Menu;

import java.util.Scanner;

public class MenuService {
    Menu menu = new Menu();
    Scanner scan = new Scanner(System.in);

    public void mostrarBienvenida(){
        System.out.println(menu.getBienvenida());
    }

    public void mostrarInstrucciones(){
        System.out.println(menu.getInstrucciones());
    }

    public int seleccionDe(){
        return mostrarMenu("De: ");
    }

    public int seleccionA(){
        return mostrarMenu("A: ");    }

    public int mostrarMenu(String m){
        int opcion = 0;
        do {
            System.out.println(m);
            System.out.println(menu.getMonedas());
            System.out.print("Elige una opción: ");
            opcion = scan.nextInt();
        } while (opcion < 0 || opcion > 5);
        return opcion;
    }



    public int obtenerCantidad(){
        System.out.print("\nEscribe la cantidad que deseas convertir: ");
        return scan.nextInt();
    }


    public boolean otraConsulta(){
        System.out.println("¿Deseas hacer otra consulta?");
        return repetir();
    }
    private boolean repetir(){
        int op;
        do {
            System.out.println("1. Si \n2. No");
            op = scan.nextInt();
            switch (op) {
                case 2:
                    return false;
                case 1:
                    return true;
                default:
                {
                    System.out.println("Esa no es una opción válida");
                    break;
                }
            }
        } while (true);
    }


}
