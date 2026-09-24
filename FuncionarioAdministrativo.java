public class FuncionarioAdministrativo extends Pessoa{
    private String setor;
    
    //construtor
    public FuncionarioAdministrativo(String nome, String matricula, String email, String setor, Endereco endereco){
        super(nome, matricula, email, endereco);
        this.setor=setor;
    }

    public void realizarAtendimento(){
        System.out.println(this.getNome()+" iniciou um atendimento.");
    }
}