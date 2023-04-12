package ExercicioExe1Ac2;

public class PessoaExe1Ac2 {

    private String nome, cpf;

    public PessoaExe1Ac2() {
    }

    public PessoaExe1Ac2(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString() {
        return "Nome: " + nome
                + "\nCPF: " + cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
