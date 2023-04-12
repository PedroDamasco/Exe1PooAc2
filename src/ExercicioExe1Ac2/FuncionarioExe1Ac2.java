package ExercicioExe1Ac2;

public class FuncionarioExe1Ac2 extends PessoaExe1Ac2 {

    private int numeroCracha;
    private double salario;

    public FuncionarioExe1Ac2() {

    }

    public FuncionarioExe1Ac2(String nome, String cpf, int numeroCracha, double salario) {
        setNome(nome);
        setCpf(cpf);
        this.numeroCracha = numeroCracha;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nnumeroCracha: " + numeroCracha
                + "\nSalario: " + salario;
    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
