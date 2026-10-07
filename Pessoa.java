public abstract class Pessoa {
    private String nome;
    private String matricula;
    private String email;

    private Endereco endereco;

    public Pessoa(String nome, String matricula, String email, Endereco endereco) {
        validarNome(nome);
        validarMatricula(matricula);
        validarEmail(email);

        this.nome = nome;
        this.matricula = matricula;
        this.email = email;

        this.endereco = endereco;
    }
    //Overload
    public Pessoa(String nome, String matricula, String email) {
        validarNome(nome);
        validarMatricula(matricula);
        validarEmail(email);

        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    //recebe endereço
    public void receberEndereco(Endereco enderecoNovo) {
        this.endereco = enderecoNovo;
    }

    //validacao do nome
    private void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome nao pode estar vazio.");
        }
    }

    //validacao da matricula
    private void validarMatricula(String matricula) {
        if (matricula == null || matricula.trim().isEmpty()) {
            throw new IllegalArgumentException("A matricula nao pode estar vazia.");
        }
    }

    //validacao do email
    private void validarEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("O email informado e invalido.");
        }
    }

    //validacao do numero da aula
    protected void validarAula(int aula) {
        if (aula <= 0) {
            throw new IllegalArgumentException("O numero da aula deve ser maior que zero.");
        }
    }

    //abstract method
    public abstract void chamada(int aula);

    // getters
    public String getNome() {
        return this.nome;
    }
    public String getMatricula() {
        return this.matricula;
    }

    public String getEmail() {
        return this.email;
    }
    // exibição de dados
    public void exibirDados() {
        System.out.println("________________________________________\n" +
                "Nome: " + this.getNome() +
                "\nMatricula: " + this.getMatricula() +
                "\nEmail: " + this.getEmail() +
                "\nRua: " + this.endereco.getRua() +
                "\nNumero: " + this.endereco.getNumero() +
                "\nCidade: " + this.endereco.getCidade());
    }
}
