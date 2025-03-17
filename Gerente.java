public class Gerente {
    int senha;
    int numeroDeFuncionariosGerenciados;

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
    public boolean authentication(int senha){
        if (senha == senha){
            return true;
        }
        return false;
    }
}
