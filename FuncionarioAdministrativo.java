public class FuncionarioAdministrativo extends Pessoa implements Notificavel{
    private String setor;
    
    //construtor
    public FuncionarioAdministrativo(String nome, String matricula, String email, String setor, Endereco endereco){
        super(nome, matricula, email, endereco);
        this.setor=setor;
    }

    public void realizarAtendimento(){
        System.out.println("\n" + this.getNome()+" iniciou um atendimento.");
    }
    public void chamada(int aula){
        System.out.println("\n"+this.getNome()+" lançou a chamada da "+ aula +"ª aula  no sistema.");
    }

        @Override
    public void enviarnotificacao(){
        System.out.println("\nO Funcionario " + this.getNome() + " mandou um zap zap");
    }

        @Override 
     public void exibirDados(){
     super.exibirDados();
     System.out.println("Setor: " + this.setor + "\n________________________________________");
     }
}