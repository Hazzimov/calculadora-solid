package operaciones;

import interfaces.OperacionesAvanzadas;

public class Seno  implements OperacionesAvanzadas {
    @Override
    public double realizarOperacion(double valor) {
        return Math.sin(valor);
    }
}
