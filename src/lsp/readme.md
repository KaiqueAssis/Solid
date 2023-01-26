## Terceiro Exemplo

### Utilizando o princípio de substituição de Liskov 

Fiz um exemplo parecido com o 2 exemplo onde utiliza ocp, mas o foco é o princípio de Liskov que fala que os componentes filhos podem substituir o componente pai, então criei 2 classes retângulo e quadrado, ambos pode ser utilizado para calcular o valor da área no caso o quadrado para calcula a área do retangulo tem que se passado 2 paramêtros quando chamar o método. O retângulo é filho de uma classe abstrata, e o quandrado filho do retângulo.

### Classe 

#### Quadrate 
Classe do Quadrado onde se pode calcular a área tanto da Quadrado, caso seja passado apenas um parâmetro quanto o do retângulo caso seja passado 2.

#### Rectangle
Classe que faz o calculo da área apenas do retângulo e classe pai de Quadrate.

#### Shape 
Classe abstrata e também classe pai de Rectangle.