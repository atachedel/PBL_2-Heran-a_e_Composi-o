public class FuncionarioAdministrativo extends Pessoa{
    private String setor;
    
    //construtor
    public FuncionarioAdministrativo(String nome, String matricula, String email, String setor){
        super(nome, matricula, email);
        this.setor=setor;
    }

    public void realizarAtendimento(){
        System.out.println(this.getNome()+" iniciou um atendimento.");
    }
}