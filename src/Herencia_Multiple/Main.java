package Herencia_Multiple;

interface Ciclista{
    void montarBicicleta();
}

interface Nadador {
    void nadar();
}

interface Corredir {
    void correr();
}


class Triatleta implements Ciclista, Nadador, Corredir {
    @Override
    public void montarBicicleta() {
            System.out.println("El Triatleta Esta Montando Bicicleta");
    }

    @Override
    public void nadar() {
        System.out.println("El Triatleta Esta Nadando");
    }

    @Override
    public void correr() {
        System.out.println("El Triatleta Esta Corriendo");
    }
}

public class Main {
    public static void main(String[] args) {
        Triatleta triatleta = new Triatleta();

        triatleta.correr();
        triatleta.montarBicicleta();
        triatleta.nadar();

    }
}