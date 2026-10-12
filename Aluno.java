public class Aluno extends Pessoa implements Notificavel {
    private double nota;
    private String curso;

    public Aluno(String curso, String nome, String matricula, String email, Endereco endereco, double nota){
        super(nome, matricula, email, endereco);
        this.curso = curso;
        this.setNota(nota);    
    }
    
    public void solicitarMatricula(){

        System.out.println("\n" + this.getNome()+" solicitou uma matrícula");

    }

    @Override

    public void enviarnotificacao(){

        System.out.println("\nO Aluno " + this.getNome() + " mandou um zap! ");

    }

    @Override

    public void chamada(int aula){

        validarAula(aula);
        System.out.println("\nO aluno " + this.getNome() + " assinou a lista de chamada da " + aula + "ª aula.");

    }

    @Override

    public void exibirDados(){

        super.exibirDados();
        System.out.println("Nota: " + this.nota);
        System.out.println("Curso: " + this.curso + "\n________________________________________");
        
    }
    public void setNota(double nota){
        if (nota <= 0 || nota > 10) {
            throw new IllegalArgumentException("Nota inválida. A nota deve estar entre 0 e 10.");
        }
        else{
            this.nota = nota;
        }
    }
}
