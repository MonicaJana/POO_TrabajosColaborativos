public class Aereo extends Vehiculo{

    private int capacidadCarga;

    private String tipoMotor;

    public Aereo(int añoFabricación, String color, int capacidadCarga, String tipoMotor) {
        super(añoFabricación, color);
        this.capacidadCarga = capacidadCarga;
        this.tipoMotor = tipoMotor;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

}
