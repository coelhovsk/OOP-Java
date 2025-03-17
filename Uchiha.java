public class Uchiha extends Shinobi {
    private boolean sharinganDesperto, mangekyou;
    private int tomoe;

    public Uchiha(String name, String aldeia, int idade, boolean sharinganDesperto, boolean mangekyou, int tomoe){
        super(name, aldeia, idade);
        setMangekyou(mangekyou);
        setSharinganDesperto(sharinganDesperto);
        setTomoe(tomoe);
    }

   /* public Uchiha(boolean sharinganDesperto, boolean mangekyou, int tomoe){
        super();
        setMangekyou(mangekyou);
        setSharinganDesperto(sharinganDesperto);
        setTomoe(tomoe);
    }*/

    public void SharinganAtivado(){
        boolean isMangekyou = getMangekyou();
        if (sharinganDesperto && (isMangekyou != false)){
            System.out.println("Olá, meu nome é "+super.getName()+" ! Meu Sharingan foi ativado com "+getTomoe()+" tomoes.");
        }
    }

    public void setMangekyou(boolean mangekyou) {
        this.mangekyou = mangekyou;
    }
    public void setSharinganDesperto(boolean sharinganDesperto) {
        this.sharinganDesperto = sharinganDesperto;
    }
    public void setTomoe(int tomoe) {
        this.tomoe = tomoe;
    }
    public int getTomoe() {
        return this.tomoe;
    }
    public boolean getMangekyou(){
        return this.mangekyou;
    }
    public boolean getSharinganDesperto(){
        return this.sharinganDesperto;
    }
}
