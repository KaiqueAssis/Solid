package dip;

import dip.interfaces.Aluguel;

public class AluguelPadrao implements Aluguel {
    @Override
    public Double calcularAluguel() {
        return 800.00;
    }
}
