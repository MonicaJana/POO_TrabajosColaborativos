public class Terrestre extends Vehiculo{
    private float kilometraje;
    private  String tipoNeumaticos;

    public Terrestre(int añoFabricación, String color, float kilometraje, String tipoNeumaticos) {
        super(añoFabricación, color);
        this.kilometraje = kilometraje;
        this.tipoNeumaticos = tipoNeumaticos;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public String getTipoNeumaticos() {
        return tipoNeumaticos;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setTipoNeumaticos(String tipoNeumaticos) {
        this.tipoNeumaticos = tipoNeumaticos;
    }
}
