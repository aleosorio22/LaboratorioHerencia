package umg.progra2.Vehiculos;

public class Moto extends Vehiculo{
    private boolean tieneSidecar;

    public Moto (String marca, String modelo, int ano, boolean tieneSidecar) {
        super(marca, modelo, ano);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean getTieneSidecar() {
        return tieneSidecar;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Sidecar: " + getTieneSidecar());
    }
}
