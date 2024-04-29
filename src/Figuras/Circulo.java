package Figuras;

class Circulo extends SuperFiguras {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        area = Math.PI * radio * radio;
        return area;
    }

    @Override
    double calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
