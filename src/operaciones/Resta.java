package operaciones;

import interfaces.OperacionesBasicas;

public class Resta implements OperacionesBasicas {
    @Override
    public double realizarOperacion(double n1, double n2) {
        return n1 - n2;
    }
}
