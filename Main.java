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
                13);
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

        testarValidacoes();

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

    public static void testarValidacoes() {

        System.out.println("\n--- Testes das validacoes ---");

        try {
            new Aluno(
                    "Ciências da Computação",
                    "",
                    "CSa02",
                    "aluno@a.unileste.edu.br",
                    new Endereco("Rua A", "10", "Ipatinga"),
                    12.3);
        } catch (IllegalArgumentException e) {
            System.out.println("Nome invalido: " + e.getMessage());
        }

        try {
            new Professor(
                    "Professor Teste",
                    "",
                    "professor@p.unileste.edu.br",
                    "Computação",
                    new Endereco("Rua B", "20", "Ipatinga"));
        } catch (IllegalArgumentException e) {
            System.out.println("Matricula invalida: " + e.getMessage());
        }

        try {
            new Pesquisador(
                    "Pesquisador Teste",
                    "Pes01",
                    "email-invalido",
                    "Pesquisa",
                    new Endereco("Rua C", "30", "Ipatinga"));
        } catch (IllegalArgumentException e) {
            System.out.println("Email invalido: " + e.getMessage());
        }

        try {
            new Aluno(
                    "Aluno Teste",
                    "Aluno Teste",
                    "Alu01",
                    "aluno@a.unileste.edu.br",
                    new Endereco("Rua D", "40", "Ipatinga"),
                    9).chamada(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Aula invalida: " + e.getMessage());
        }
    }
}
