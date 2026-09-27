public class Endereco{
    private String rua;
    private String numero;
    private String cidade;

    public Endereco(String rua, String numero, String cidade){
        if (rua != null && numero != null && cidade !=null){
            this.rua = rua;
            this.numero = numero;
            this.cidade = cidade;
        }
    }
    //getters
    public String getRua(){
        return this.rua;
    }
    public String getNumero(){
        return this.numero;
    }
    public String getCidade(){
        return this.cidade;
    }
}