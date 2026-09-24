public class Main {
    public static void main(String[] args) {
    Endereco enderecoAluno = new Endereco(
        "Rua Orquidea",
         "67",
          "Ipatinga"
        );
    Aluno aluno = new Aluno(
        "Ciências da Computação",
         "Gabriel Souza",
          "CSa01",
           "gabriel@a.unileste.edu.br",
           enderecoAluno);

    Endereco enderecoProfessor = new Endereco(
        "rua Sanchez",
        "137-c",
        "Boob World"
    );
    Professor professor = new Professor(
        "Demétrio",
         "CSp01",
          "reno@p.unileste.edu.br",
           "Computação",
           enderecoProfessor
        );

    Endereco enderecoFuncionario = new Endereco(
        "Uni",
        "26",
        "Leste"
    );
    FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo(
        "Dorinha",
         "Adm01",
          "Dorinha@f.unileste.edu.br",
           "Bibliotecário",
            enderecoFuncionario
        );

    aluno.exibirDados();   
    professor.exibirDados();   
    funcionario.exibirDados();   
    }
}
