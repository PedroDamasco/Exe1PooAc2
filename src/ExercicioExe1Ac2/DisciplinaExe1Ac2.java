package ExercicioExe1Ac2;

public class DisciplinaExe1Ac2 {

    private int codigo;
    private String nome;

    public DisciplinaExe1Ac2() {

    }

    public DisciplinaExe1Ac2(int codigo, String nome) {
        this.nome = nome;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nCódigo: " + codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
