package Figuras;

abstract class SuperFiguras {
    protected double area;
    protected double perimetro;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    abstract double calcularArea();
    abstract double calcularPerimetro();
}


