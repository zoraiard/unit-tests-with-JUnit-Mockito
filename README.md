# Teste Unitários com Frameworks JUnit e Mockito

Elegant and robust Unit Tests using JUnit and Mockito frameworks

##  Conceitos relacionados ao assunto

Teste unitário é um trecho de código que verifica a correta execução de outro trecho de código.

Em uma linguagem orientada a objetos, um teste unitário verifica um método de uma classe.

O usuário final de um sistema não pode executar um teste unitário a partir da sua interface web

Teste de Integração - Verifica a comunicação entre os componentes de um sistema e um serviço externo, como por exemplo, um web Service.

Um teste unitário isola uma parte do sistema e verifica se o seu funcionamento está correto.

Um teste unitário pode executar comandos em um banco de dados relacional, mas neste caso ele pode se tornar lento. Falso

AAA Pattern é o Padrão para implementação de testes unitários adotado pela comunidade de testes.

* Facilita a manutenção do código
* Redução de Custos
* Melhora o Design da Aplicação
* Serve como documentação do sistema
* Os testes unitários ajudam o desenvolvedor a perder menos tempo para entender e modificar o código, e ter mais tempo para implementar novos códigos.
* O teste unitário ajuda a identificar problemas na aplicação e a ajuda a melhorar o design.

## JUnit
JUnit o é principal framework utilizado para implementação de testes unitários em Java.
O JUnit tem suporte para as principais IDE´s Java, o que torna a implementação de testes unitários menos trabalhosa.

@Test Annotation que define um método como um teste unitário

Se utilizarmos @Test numa classe, cada método desta classe não será visto como um teste pelo JUnit

@ignore Annotation utilizada para informar ao JUnit que um determinado teste deve ser ignorado

@before Informa ao JUnit que o método deve ser executado antes de cada método de teste

@Test(expected = Exception.class)
O teste será bem sucedido caso levante uma exceção do tipo exception.

Parameterized Test. Importante recurso JUnit usado para executar uma bateria de testes utilizando um conjunto de parâmentros de entrada, evitando duplicidade de código ou criação de vários métodos de testes semelhantes.

Assert é uma classe do JUnit que oferece diversos métodos estáticos utilizados para comparar valores e objetos.

JUnit Core - Classe do JUnit necessária à execução de testes unitários sem utilização do plugin do Eclipse

# Mockito
O acoplamento entre classes pode inviabilizar os testes unitários

O Mock. È um subnstituto para uma dependência existente.

Mockito: è um framework para construção de mocks.

São características do Mockito:

* API Simples;
* Fácil de Usar
* Foi Top 10 Library

O método mock() serve para construir um mock.
