package umg.progra2.Vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Vehiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno() {
        return ano;
    }

    public void mostrarDetalles(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

}
