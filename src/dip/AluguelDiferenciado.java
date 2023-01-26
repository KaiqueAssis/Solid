package dip;

import dip.interfaces.Aluguel;

public class AluguelDiferenciado implements Aluguel {
    @Override
    public Double calcularAluguel() {
        return 1000.00;
    }
}
