package Figuras;

import java.util.Scanner;

public class AplicacionConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una figura: ");
        System.out.println("1. Circulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Rectangulo");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del circulo ");
                double radio = scanner.nextDouble();
                Circulo circulo = new Circulo(radio);
                double areaCirculo = circulo.calcularArea();
                double perimetroCirculo = circulo.calcularPerimetro();
                System.out.println("El area del circulo es: " + areaCirculo);
                System.out.println("Perimetro del circulo es: " + perimetroCirculo);
                break;
                case 2:
                    System.out.print("Ingrese la base del triangulo");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triangulo");
                    double altura = scanner.nextDouble();
                    System.out.print("Ingrese el lado 1 del triangulo");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Ingrese el lado 2 del triangulo");
                    double lado2 = scanner.nextDouble();
                    System.out.print("Ingrese el lado 3 del triangulo");
                    double lado3 = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(base, altura, lado1, lado2, lado3);
                    double areaTriangulo = triangulo.calcularArea();
                    double perimetroTriangulo = triangulo.calcularPerimetro();
                    System.out.println("El area del triangulo es: " + areaTriangulo);
                    System.out.println("El perimetro del triangulo es: " + perimetroTriangulo);
                    break;
                    case 3:
                        System.out.print("Ingrese la base del rectangulo");
                        double baseRectangulo = scanner.nextDouble();
                        System.out.print("Ingrese la altura del rectangulo");
                        double alturaRectangulo = scanner.nextDouble();
                        Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                        double areaRectangulo = rectangulo.calcularArea();
                        double perimetroRectangulo = rectangulo.calcularPerimetro();
                        System.out.println("El area del rectangulo es: " + areaRectangulo);
                        System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo);
                        break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        scanner.close();
    }
}
