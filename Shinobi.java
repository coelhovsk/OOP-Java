public class Shinobi {
    private String name, aldeia = "";
    private int idade = 0;

    public Shinobi(String nome, String aldeia, int idade){
        this.name = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }
    public Shinobi(){
        setAldeia(null);
        setIdade(0);
        setName(null);
    }
    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAldeia() {
        return this.aldeia;
    }
    public int getIdade() {
        return this.idade;
    }
    public String getName() {
        return this.name;
    }

}
