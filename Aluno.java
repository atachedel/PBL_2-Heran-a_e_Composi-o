public class Aluno extends Pessoa {
    private String curso;
    public Aluno(String curso, String nome, String matricula, String email){
        super(nome, matricula, email);
        this.curso=curso;
    }
    public void solicitarMatricula(){
        System.out.println(this.getNome()+" solicitou uma matrícula");
    }
}
