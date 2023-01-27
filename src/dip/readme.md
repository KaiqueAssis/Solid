## Quinto Exemplo

### Princípio da inversão de dependência.
    Mini Projeto de cálculo de aluguel, onde temos uma interface que implementa ás classes principais seguindo o conceito dip.
    Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações;
    Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.

### Contexto do Projeto.
    Programa feito para pessoas que querem aplicar regras diferentes de aluguel, caso tenham mais de um imóvel.

### Explicação do Projeto.
    
    O Projeto tem como pricipal arquivo a Interface Aluguel:

    public interface Aluguel {
    public Double calcularAluguel();
    }

    Com ela a gente aplica o conceito de dip. Que fala basicamente que devemos depender de abstrações,
    e não de implementações. Por isso a interface com ela, a gente pode seguir a regra da dip, melhorando também
    a questão de manutenção do código.

    A Interface implementa às classes AluguelDiferenciado, AluguelPadrao e CalculadoraAluguel:

    public class AluguelPadrao implements Aluguel {
    @Override
    public Double calcularAluguel() {
        return 800.00;
    }}

    public class AluguelDiferenciado implements Aluguel {
    @Override
    public Double calcularAluguel() {
    return 1000.00;
    }}
    
    public class CalculadoraAluguel {
    private Aluguel aluguel;

    public CalculadoraAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }


    public Double calcularAluguel(){
        return aluguel.calcularAluguel();
    }}

    As classe AluguelPadrao e Alugueldiferenciado, são basicamente a mesma coisa só que com ideia de négocio diferente,
    e Aluguel permite isso a criação de novas classes sem afetar quebra o sistema. Caso eu queira criar um novo tipo de Classe aluguel eu poderia livremente.
    
    Agora a classe CalculadoraAluguel, pega Aluguel como variável para utilizamos para
    determinamos o valor do aluguel para o construtor que usamos no App. exemplo do App para testar.

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

    
    


    