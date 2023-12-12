public class Aviones extends Aereo {
    private String tipo_aereo;
    private int altura_alcance;

    public Aviones(int añoFabricación, String color, int capacidadCarga, String tipoMotor, String tipo_aereo, int altura_alcance){
        super(añoFabricación, color, capacidadCarga, tipoMotor);
        this.tipo_aereo = tipo_aereo;
        this.altura_alcance = altura_alcance;
    }

    public String getTipo_aereo(){
        return tipo_aereo;
    }
    public int getAltura_alcance(){
        return altura_alcance;
    }
}