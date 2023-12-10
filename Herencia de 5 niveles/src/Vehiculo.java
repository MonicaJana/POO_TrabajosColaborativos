public class Vehiculo {
    private int añoFabricación;
    private String color;

    public Vehiculo(int añoFabricación, String color) {
        this.añoFabricación = añoFabricación;
        this.color = color;
    }

    public int getAñoFabricación() {
        return añoFabricación;
    }

    public String getColor() {
        return color;
    }

    public void setAñoFabricación(int añoFabricación) {
        this.añoFabricación = añoFabricación;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
