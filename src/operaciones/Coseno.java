package operaciones;

import interfaces.OperacionesAvanzadas;

public class Coseno implements OperacionesAvanzadas {
    @Override
    public double realizarOperacion(double valor) {
        return Math.cos(valor);
    }
}
