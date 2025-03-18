public class Main{
    public static void main(String[] args) {
        Shinobi Naruto = new Shinobi("Naruto", "Folha", 17);
        Uchiha Sasuke = new Uchiha("Sasuke", "Folha", 17, true, true, 3);

        Sasuke.SharinganAtivado();
        System.out.println(Naruto.getName());
    }
}