interface Autenticavel {
    // Atributo (implicitamente public static final)
    int SENHA_PADRAO = 12345;
    // Método (implicitamente public abstract)
    boolean autentica(int senha);
    }
    // Classe que implementa a interface
    class Gerente implements Autenticavel {
    private int senhaInterna;
    @Override
    public boolean autentica(int senha) {
    // Implementação específica para Gerente
    if (this.senhaInterna == senha) {
    System.out.println("Gerente autenticado.");
    return true;
    } else {
    System.out.println("Senha incorreta.");
    return false;
    }
    }
    // Outros métodos do Gerente
    }
    class Cliente implements Autenticavel {
    private int senhaAcesso;
    @Override
    public boolean autentica(int senha) {
    // Implementação específica para Cliente
    if (this.senhaAcesso == senha) {
    System.out.println("Cliente autenticado.");
    return true;
    }
    return false;
    }
    }
    