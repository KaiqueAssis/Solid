# Exemplo 2 

### Utiizando o Open/Close.()

Projeto sobre o calculo da área de figuras. O exemplo compõe 1 classe abstrata que passa a herança para outras 2 classes, Rectangle e Circle.
Caso o dev queira criar mais alguma classe para calcular a área de alguma outra figura, é necessário apenas que após criar a outra classe modificar o main acrescentando mais um if.

### Classes são:

#### Shape

Classe abstrata que passa a herença color e o método abstrato area();

#### Rectangle e Circle

É Herença de Shape, tem o metodo area() que calcula a área das figuras;
