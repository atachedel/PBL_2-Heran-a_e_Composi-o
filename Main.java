import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Endereco enderecoAluno = new Endereco(
                "Rua Orquidea",
                "67",
                "Ipatinga");
        Aluno aluno = new Aluno(
                "Ciências da Computação",
                "Gabriel Souza Lord Linux",
                "CSa01",
                "gabriel@a.unileste.edu.br",
                enderecoAluno, 
                3);
        Endereco enderecoProfessor = new Endereco(
                "rua Sanchez",
                "137-c",
                "Boob World");
        Professor professor = new Professor(
                "Demétrio",
                "CSp01",
                "reno@p.unileste.edu.br",
                "Computação",
                enderecoProfessor);
        Endereco enderecoFuncionario = new Endereco(
                "Uni",
                "26",
                "Leste");
        FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo(
                "Dorinha",
                "Adm01",
                "Dorinha@f.unileste.edu.br",
                "Bibliotecário",
                enderecoFuncionario);

        Endereco enderecoPesquisador = new Endereco(
                "Rua do medo",
                "13",
                "Cidade de Deus");
        Pesquisador pesquisador = new Pesquisador(
                "Andre, o teorico",
                "TnmD000",
                "Andre@a.unileste.edu.br",
                "RH",
                enderecoPesquisador);

        pessoas.add(aluno);
        pessoas.add(professor);
        pessoas.add(funcionario);
        pessoas.add(pesquisador);

        for (Pessoa pessoa : pessoas) {
            pessoa.exibirDados();
        }

        testarChamada(pessoas);

        professor.enviarnotificacao();
        aluno.enviarnotificacao();
        funcionario.enviarnotificacao();

    }

    public static void testarChamada(ArrayList<Pessoa> pessoas) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("\nInforme o numero da aula: ");
            int aula = entrada.nextInt();

            for (Pessoa pessoa : pessoas) {
                pessoa.chamada(aula);
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida. Informe um numero inteiro.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        entrada.close();
    }
}
