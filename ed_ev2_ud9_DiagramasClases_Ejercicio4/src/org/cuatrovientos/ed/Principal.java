package org.cuatrovientos.ed;

public class Principal {

    public static void main(String[] args) {

        int option;
        Invoice factura = new Invoice("Mario");

        do {
            option = Utils.show_menu();
            Utils.state_machine(option, factura);
        } while (option != 0);
    }
}

