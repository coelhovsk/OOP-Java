public class Funcionario{
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(){
        setCpf(null);
        setNome(null);
        setSalario(0);
    }

    public Funcionario(String nome, String cpf, double salario){
        setCpf(cpf);
        setNome(nome);
        setSalario(salario);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
}
