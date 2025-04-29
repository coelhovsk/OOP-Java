abstract class Funcionario {
    5
    protected String nome;
    protected double salario;
    public abstract double calcularBonificacao();
    }
    class Gerente extends Funcionario {
    @Override
    public double calcularBonificacao() {
    return salario * 0.15; // 15% de bonificação
    }
    }
    class Desenvolvedor extends Funcionario {
    @Override
    public double calcularBonificacao() {
    return salario * 0.05; // 5% de bonificação
    }
    }
    // Uso do polimorfismo
    class SistemaRH {
    public static void main(String[] args) {
    ControleDeBonificacoes controle = new ControleDeBonificacoes();
    Funcionario f1 = new Gerente();
    f1.nome = "Carlos";
    f1.salario = 5000.0;
    Funcionario f2 = new Desenvolvedor();
    f2.nome = "Ana";
    f2.salario = 4000.0;
    // Mesmo método, comportamentos diferentes
    controle.registra(f1);
    controle.registra(f2);
    System.out.println("Total de bonificações: " + controle.getTotalDeBonificacoes());
    // Resultado: 5000 * 0.15 + 4000 * 0.05 = 750 + 200 = 950
    }
    }
    