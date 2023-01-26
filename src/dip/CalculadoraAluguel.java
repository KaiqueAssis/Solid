package dip;

import dip.interfaces.Aluguel;

public class CalculadoraAluguel {
    private Aluguel aluguel;

    public CalculadoraAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }


    public Double calcularAluguel(){
        return aluguel.calcularAluguel();
    }

}
