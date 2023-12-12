public class Deportivo extends Auto {
    private int n_chasis;
    private int n_puertas;

    public Deportivo(int añoFabricación, String color, float kilometraje, String tipoNeumaticos, int rin, int potencia_motor, int n_chasis, int n_puertas){
        super(añoFabricación, color, kilometraje, tipoNeumaticos, rin, potencia_motor);
        this.n_chasis = n_chasis;
        this.n_puertas = n_puertas;
    }

    public int getN_chasis(){
        return n_chasis;
    }
    public int getN_puertas(){
        return n_puertas;
    }
}
