public class Pesquisador extends Pessoa{
   private String campo;
public Pesquisador(String nome, String matricula, String email, String campo, Endereco endereco){
        super(nome, matricula, email, endereco);
        this.campo=campo;
    }
    @Override 
    public void chamada(int aula){
        System.out.println("\nO Pesquisador " +this.getNome() + " Confirmou a Matricula da " + aula+"ª aula.");
    }
     @Override 
     public void exibirDados(){
     super.exibirDados();
     System.out.println("Campo: " + this.campo + "\n________________________________________");
     }
}