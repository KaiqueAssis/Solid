# Primeiro exemplo

### Utilizando o principio da responsabilidade única.

 Fiz um mini projeto de saque e deposito para utilizar o principio do SRP.(Uma classe deve ter um, e somente um, motivo para mudada. Uma classe tem que ser especializada apenas em uma coisa.)
 Dividi o projeto em 4 classes fora o App, onde eu testei as classes aclopadas:

## As classes são:
 
##### Account
    Onde separei os metodos construtores, getters e settings, as variaveis account, name, balance todas private, e uma função de withDraw(De saque).
    Que basicamente atualiza o saldo da conta, no caso subtraindoo valor de balance que determinamos o valor durante a execução do main com um setBalance.

#### validAccount.
    Tem uma função que valida função que valida a conta caso esteja correta, no caso coloquei apenas 1 validação exetremamente simple, caso o nome estiver José
    e número 1000 a conta é acessada, se não a programa é encerrado.

#### validMoney.
    Tem uma função que testa, se é possível sacar o dinheiro da conta, caso não seja, o programa para de executar.

#### statesAccount 
     Tem uma função de vizualização onde mostra os status da conta acessada depois de cada operação.