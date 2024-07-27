package umg.progra2.Vehiculos;

public class Coche extends Vehiculo {
    private int nPuertas;

    public Coche(String marca, String modelo, int ano, int nPuertas) {
        super(marca, modelo, ano);
        this.nPuertas = nPuertas;
    }

    public int getNPuertas() {
        return nPuertas;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Puertas: " + getNPuertas());
    }

}
