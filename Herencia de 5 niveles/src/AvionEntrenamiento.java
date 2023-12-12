public class AvionEntrenamiento extends Aviones{
    private double envergadura;
    private double combustible;

    public AvionEntrenamiento(int añoFabricación, String color, int capacidadCarga, String tipoMotor, String tipo_aereo, int altura_alcance, double envergadura, double combustible){
        super(añoFabricación, color, capacidadCarga, tipoMotor, tipo_aereo, altura_alcance);
        this.envergadura =  envergadura;
        this.combustible = combustible;
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
}
