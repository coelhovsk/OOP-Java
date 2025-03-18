public class Gerente extends Funcionario {
    int senha;
    int numeroDeFuncionariosGerenciados;

    public Gerente(int senha, int numeroDeFuncionariosGerenciados){
        super();
        setSenha(senha);
        setNumeroDeFuncionariosGerenciados(numeroDeFuncionariosGerenciados);
    }
    public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados){
        super(nome, cpf, salario);
        setSenha(senha);
        setNumeroDeFuncionariosGerenciados(numeroDeFuncionariosGerenciados);
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }
    public int getSenha() {
        return senha;
    }
    public boolean authentication(int passw){
        if (passw == senha) return true;
        return false;
    }
}
