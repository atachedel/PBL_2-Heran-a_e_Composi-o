public class Aluno extends Pessoa {
    private String curso;
    public Aluno(String curso, String nome, String matricula, String email, Endereco endereco){
        super(nome, matricula, email, endereco);
        this.curso=curso;
    }
    public void solicitarMatricula(){
        System.out.println("\n" + this.getNome()+" solicitou uma matrícula");
    }

    @Override
    public void chamada(int aula){
        System.out.println("\nO aluno " + this.getNome() + " assinou a lista de chamada da " + aula + "ª aula.");
    }

    @Override 
     public void exibirDados(){
     super.exibirDados();
     System.out.println("Curso: " + this.curso + "\n________________________________________");
     }
}
