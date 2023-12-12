public class Cessna_172 extends AvionEntrenamiento
{
    private double alcance;
    private double alturaMax;

    public Cessna_172(int añoFabricación, String color, int capacidadCarga, String tipoMotor, String tipo_aereo, int altura_alcance, double envergadura, double combustible, double alcance, double alturaMax){
        super(añoFabricación, color, capacidadCarga, tipoMotor, tipo_aereo, altura_alcance, envergadura, combustible);
        this.alcance = alcance;
        this.alturaMax = alturaMax;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public double getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(double alturaMax) {
        this.alturaMax = alturaMax;
    }
}
