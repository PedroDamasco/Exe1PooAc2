package ExercicioExe1Ac2;

public class AtendenteExe1Ac2 extends FuncionarioExe1Ac2 {

    private String setor, funcao;

    public AtendenteExe1Ac2() {

    }

    public AtendenteExe1Ac2(String nome, String cpf, String setor, String funcao) {
        setNome(nome);
        setCpf(cpf);
        this.setor = setor;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Atendente: " +
                "\n" + super.toString()
                + "\nSetor: " + setor
                + "\nFunção: " + funcao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}
