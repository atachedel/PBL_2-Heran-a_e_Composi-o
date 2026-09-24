public class Professor extends Pessoa{
    private String area;

    public Professor(String nome, String matricula, String email, String area, Endereco endereco){
        super(nome, matricula, email, endereco);
        this.area=area;
    }
    public void resgistrarNota(){
        System.out.println(this.getNome()+" registrou uma nota.");
    }
}