import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    
    ArrayList<Pessoa> pessoas = new ArrayList();

    Endereco enderecoAluno = new Endereco(
        "Rua Orquidea",
         "67",
          "Ipatinga"
        );
    Aluno aluno = new Aluno(
        "Ciências da Computação",
         "Gabriel Souza Lord Linux",
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

        Endereco enderecoPesquisador = new Endereco(
        "Rua Orquidea",
         "67",
          "Ipatinga"
        );
    Pesquisador pesquisador = new Pesquisador(
        "Andre: a teoria de tudo",
        "TnmD000",
         "Andre@a.unileste.edu.br",
          "RH",
           enderecoPesquisador);


        pessoas.add(aluno);
        pessoas.add(professor);
        pessoas.add(funcionario);
        pessoas.add(pesquisador);

        for(Pessoa pessoa : pessoas){
            pessoa.exibirDados();
        }

        for(Pessoa pessoa : pessoas){
            pessoa.chamada(60);
        }

        professor.enviarnotificacao();
        aluno.enviarnotificacao();
        funcionario.enviarnotificacao();
    // aluno.exibirDados();   
    // professor.exibirDados();   
    // funcionario.exibirDados(); 
    
    // aluno.solicitarMatricula();
    // professor.registrarNota();
    // funcionario.realizarAtendimento();  

    // professor.chamada(60);
    // aluno.chamada(60);
    // funcionario.chamada(60);
    }
}
