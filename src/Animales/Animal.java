package Animales;

public abstract class Animal {
    private String foto;
    private String comida;
    private String localizacion;
    private String tamano;

    public abstract void hacerRuido();
    public void comer() {
        System.out.println("Comiendo");
    }
    public void dormir() {
        System.out.println("Dormir");
    }
    public void rugir() {
        System.out.println("Rugir");
    }
}
