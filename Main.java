public class Main {
    public static void main(String[] args) {
    Aluno aluno = new Aluno("Ciências da Computação", "Gabriel Souza", "CSa01", "gabriel@a.unileste.edu.br");
    Professor professor = new Professor("Demétrio", "CSp01", "reno@p.unileste.edu.br", "Computação");
    FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo("Dorinha", "Adm01", "Dorinha@f.unileste.edu.br", "Bibliotecário");

    aluno.exibirDados();   
    professor.exibirDados();   
    funcionario.exibirDados();   
    }
}
