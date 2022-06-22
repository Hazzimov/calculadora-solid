package operaciones;

import interfaces.OperacionesBasicas;

public class Multiplicacion implements OperacionesBasicas {
    @Override
    public double realizarOperacion(double n1, double n2) {
        return n1*n2;
    }
}
