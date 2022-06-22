package operaciones;

import interfaces.OperacionesBasicas;

public class Potencia implements OperacionesBasicas {

    @Override
    public double realizarOperacion(double n1, double n2) {
        return Math.pow(n1, n2);
    }
}
