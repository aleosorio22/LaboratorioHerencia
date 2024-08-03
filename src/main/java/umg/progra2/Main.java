package umg.progra2;

import conductores.ConductorDeMoto;
import umg.progra2.Conductores.Conductor;
import umg.progra2.Conductores.ConductorDeCoche;
import umg.progra2.Vehiculos.Coche;
import umg.progra2.Vehiculos.Moto;
import umg.progra2.Vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo pickup = new Coche("Toyota", "22r", 2024, 2);
        pickup.mostrarDetalles();
        System.out.println();

        Vehiculo moto = new Moto("Yamaha", "sz150", 2024, true);
        moto.mostrarDetalles();
        System.out.println();

        //utilizando libreria de karen galicia
        Conductor conductor = new Conductor("Jorgito", "DJ31RC");
        conductor.mostrarInformacion();
        System.out.println();

        ConductorDeCoche conductorDeCoche = new ConductorDeCoche("Mario", "FJ392", 5);
        conductorDeCoche.mostrarInformacion();
        System.out.println();

        //Utilizando libreria de Raquel
        ConductorDeMoto conductorDeMoto = new ConductorDeMoto("Celeste", "138cb", true);
        conductorDeMoto.mostrarInformacion();
    }
}