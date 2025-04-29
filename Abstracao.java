// 1. Interface Tributavel Primeiro, definimos uma interface para representar tudo que pode ser tributado
// no sistema. Isso promove o desacoplamento, pois o sistema de tributação só precisa conhecer a interface
// Tributavel, não os tipos específicos de contas.

// Interface Tributavel.java
// Define o contrato para objetos que podem sofrer tributação.
public interface Tributavel {
// Método abstrato (implicitamente public abstract)
// Calcula e retorna o valor do tributo.
double calculaTributos();
}

// • Explicação: A interface Tributavel declara um único método, calculaTributos(). Qualquer classe
// que queira ser considerada “tributável” pelo nosso sistema deve implementar esta interface e fornecer
// uma implementação concreta para este método.
// 9
// 2. Classe Abstrata Conta Criamos uma classe abstrata Conta para representar os atributos e
// comportamentos comuns a todas as contas bancárias. Usar uma classe abstrata é útil aqui porque não faz
// sentido criar um objeto “Conta” genérico; queremos apenas contas específicas como Corrente ou Poupança.

// Classe Abstrata Conta.java
// Modela os atributos e comportamentos básicos de uma conta bancária.
abstract class Conta {
// Atributos protegidos para serem acessíveis pelas subclasses
protected double saldo;
protected int agencia;
protected int numero;
protected String titular;
// Construtor para inicializar os atributos comuns
public Conta(int agencia, int numero, String titular) {
this.agencia = agencia;
this.numero = numero;
this.titular = titular;
this.saldo = 0.0; // Saldo inicial zero
}
// Método concreto para depositar
public void deposita(double valor) {
if (valor > 0) {
this.saldo += valor;
System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
} else {
System.out.println("Valor de depósito inválido.");
}
}
// Método concreto para sacar (com validação básica)
public boolean saca(double valor) {
if (this.saldo >= valor && valor > 0) {
this.saldo -= valor;
System.out.println("Saque de R$" + valor + " realizado com sucesso.");
return true;
} else {
System.out.println("Saldo insuficiente ou valor de saque inválido.");
return false;
}
}
// Método concreto para obter o saldo
public double getSaldo() {
return this.saldo;
}
// Método abstrato para exibir tipo da conta (força subclasses a implementar)
public abstract void exibeTipoConta();
}

/* 
• Explicação:
– abstract class Conta: Define uma classe que não pode ser instanciada diretamente.
– protected: Os atributos são protected para que as subclasses (ContaCorrente, ContaPoupanca)
10
possam acessá-los diretamente.
– deposita(), saca(), getSaldo(): Métodos concretos com comportamento padrão para todas as
contas.
– abstract void exibeTipoConta(): Método abstrato. Qualquer classe que herdar de Conta deve
fornecer uma implementação para este método.
3. Classe ContaCorrente Esta classe herda de Conta e implementa a interface Tributavel.
*/

// Classe ContaCorrente.java
// Representa uma conta corrente, que é um tipo de Conta e é Tributavel.
class ContaCorrente extends Conta implements Tributavel {
// Construtor que chama o construtor da superclasse (Conta)
public ContaCorrente(int agencia, int numero, String titular) {
super(agencia, numero, titular); // Chama o construtor de Conta
}
// Sobrescrita do método saca para incluir taxa de operação
@Override
public boolean saca(double valor) {
double valorASacar = valor + 0.20; // Taxa de R$0,20 por saque
return super.saca(valorASacar); // Chama o método saca da superclasse (Conta)
}
// Implementação do método abstrato herdado de Conta
@Override
public void exibeTipoConta() {
System.out.println("Esta é uma Conta Corrente.");
}
// Implementação do método da interface Tributavel
@Override
public double calculaTributos() {
// Tributo de 1% sobre o saldo para Conta Corrente
return this.saldo * 0.01;
}
}