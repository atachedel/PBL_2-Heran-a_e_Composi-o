public class Pessoa{
    private String nome;
    private String matricula;
    private String email;

    private Endereco endereco;

    public Pessoa (String nome, String matricula, String email, Endereco Endereco){
        this.nome=nome;
        this.matricula=matricula;
        this.email=email;

        this.endereco=endereco;
    }

    //getters
    public String getNome(){
        return this.nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public String getEmail(){
        return this.email;
    }

    //exibição de dados
    public void exibirDados(){
        System.out.println("________________________________________\n"+
                            "Nome: "+this.getNome()+
                            "\nMatricula: "+this.getMatricula()+
                            "\nEmail: "+this.getEmail()+
                            "\nRua: "+this.endereco.getRua()+
                            "\nNumero: "+this.endereco.getNumero()+
                            "\nCidade: "+this.endereco.getCidade()+
                            "\n_______________________________________ ");
    }
}