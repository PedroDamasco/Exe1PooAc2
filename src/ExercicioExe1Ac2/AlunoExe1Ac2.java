package ExercicioExe1Ac2;

public class AlunoExe1Ac2 extends PessoaExe1Ac2 {

    private String ra, curso;

    public AlunoExe1Ac2() {

    }

    public AlunoExe1Ac2(String nome, String cpf, String ra, String curso) {
        setNome(nome);
        setCpf(cpf);
        this.ra = ra;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                "\n" + super.toString()
                + "\nRA: " + ra
                + "\nCurso: " + curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
