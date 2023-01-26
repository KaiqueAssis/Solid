package dip;

import dip.interfaces.Aluguel;

public class App {
    public static void main(String[] args){
        Aluguel aluguelNormal = new AluguelPadrao();
        Aluguel aluguelDiferenciado = new AluguelDiferenciado();

        CalculadoraAluguel calculadoraAluguelNormal = new CalculadoraAluguel(aluguelNormal);
        CalculadoraAluguel calculadoraAluguelDiferenciado = new CalculadoraAluguel(aluguelDiferenciado);

        Double calculoDiego = calculadoraAluguelNormal.calcularAluguel();
        Double calculoTiago = calculadoraAluguelDiferenciado.calcularAluguel();

        System.out.println("Aluguel Diego:" + calculoDiego);
        System.out.println("Aluguel Tiago:" + calculoTiago);
    }

}

