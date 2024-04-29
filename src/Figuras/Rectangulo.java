package Figuras;

class Rectangulo extends SuperFiguras {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        area = base * altura;
        return base * altura;
    }

    @Override
    double calcularPerimetro() {
        perimetro = 2 * (base + altura);
        return perimetro;
    }
}
