package operaciones;

import interfaces.OperacionesAvanzadas;

public class Tangente implements OperacionesAvanzadas {
    @Override
    public double realizarOperacion(double valor) {
        return Math.tan(valor);
    }
}
