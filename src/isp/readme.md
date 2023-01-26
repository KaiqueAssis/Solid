## 4 exemplo

### Exemplo da interface (Crie interfaces granulares a específicas para os seus clientes.)

Nesse exemplo não pensei em um projeto muito elaborado, contextualmente falando. Crie 2 interfaces que são extendidas para 2 classes cliente e cliente vip, e o programa principal verifica os dados dessas classe e se na compra deles poderá de algum desconto. 

### Classes 

#### Cliente
Extende os método da interface iClasseCliente e tem um constructor com os parametros de nome, cpf, data de nascimento, e última compra.
#### ClienteVip

Extende os métodos IClasseClienteVip, e em si é igual a cliente tendo apenas de diferença o método lastBuyDiscount.
