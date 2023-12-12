public class Auto extends Terrestre {
    private int rin;
    private int potencia_motor;

    public Auto(int añoFabricación, String color, float kilometraje, String tipoNeumaticos, int rin, int potencia_motor){
        super(añoFabricación, color, kilometraje, tipoNeumaticos);
        this.rin = rin;
        this.potencia_motor = potencia_motor;
    }

    public int getRin(){
        return rin;
    }
    public int getPotencia_motor(){
        return potencia_motor;
    }
}
