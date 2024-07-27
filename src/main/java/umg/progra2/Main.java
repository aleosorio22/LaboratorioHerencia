package umg.progra2;

import umg.progra2.Vehiculos.Coche;
import umg.progra2.Vehiculos.Moto;
import umg.progra2.Vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo pickup = new Coche("Toyota", "22r", 2024, 2);
        pickup.mostrarDetalles();

        Vehiculo moto = new Moto("Yamaha", "sz150", 2024, true);
        moto.mostrarDetalles();
    }
}