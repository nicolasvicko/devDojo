package maratonajava.javacore.ZZBcomportamento.interfaces;

import maratonajava.javacore.ZZBcomportamento.domain.Car;

/*
Para Usar expressões lambda, a interface que estou trabalhando/usando precisa ser uma interface funcional.
Interface funcional é aquela onde temos apenas 1 método abstrato.

As expressões lambdas são uma forma de definir funções anônimas em Java. Elas foram introduzidas no Java 8 como uma forma de simplificar o código e torná-lo mais conciso.

As expressões lambdas são escritas usando o símbolo ->, que é conhecido como operador de flecha. A expressão lambda é composta por três partes:

1 - Os argumentos da função
2 - O corpo da função
3 - O tipo de retorno da função

(parametros) -> expressao

Métodos são comportamentos atrelados a uma Classe.
Lambda, o comportamento é chamado de funcão e não é atrelaho a uma classe.

Resumundo:

É anômina, tem funções e é concisa.

Em qualquer interface funcional é possível utilizar funções lambdas.


 */

@FunctionalInterface
public interface CarPredicate {
	 boolean test(Car car);
}
