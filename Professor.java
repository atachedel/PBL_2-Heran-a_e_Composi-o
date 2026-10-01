public class Professor extends Pessoa{
    private String area;

    public Professor(String nome, String matricula, String email, String area, Endereco endereco){
        super(nome, matricula, email, endereco);
        this.area=area;
    }
    public void registrarNota(){
        System.out.println("\n" + this.getNome()+" registrou uma nota.");
    }

    @Override 
    public void chamada(int aula){
        System.out.println("\nO professor " +this.getNome() + " distribuiu a chamada da " + aula+"ª aula.");
    }

        @Override 
     public void exibirDados(){
     super.exibirDados();
     System.out.println("Area: " + this.area + "\n________________________________________");
     }
}