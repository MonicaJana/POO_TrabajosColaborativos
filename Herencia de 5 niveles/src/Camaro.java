public class Camaro extends Deportivo
{
    private  int velocidad;
    private  int caballosFuerza;
    public Camaro(int añoFabricación, String color, float kilometraje, String tipoNeumaticos, int rin, int potencia_motor, int n_chasis, int n_puertas, int velocidad, int caballosFuerza){
        super(añoFabricación, color, kilometraje, tipoNeumaticos, rin, potencia_motor, n_chasis, n_puertas);

        this.velocidad = velocidad;
        this.caballosFuerza = caballosFuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
}
