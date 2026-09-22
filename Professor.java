public class Professor extends Pessoa{
    private String area;

    public Professor(String nome, String matricula, String email, String area){
        super(nome, matricula, email);
        this.area=area;
    }
    public void resgistrarNota(){
        System.out.println(this.getNome()+" registrou uma nota.");
    }
}