package operaciones;

import interfaces.OperacionesAvanzadas;
import interfaces.OperacionesBasicas;

public class Raiz implements OperacionesAvanzadas {
    @Override
    public double realizarOperacion(double valor) {
        return Math.sqrt(valor);
    }
}
