package ExercicioExe1Ac2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01Ac2 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        ArrayList<PessoaExe1Ac2> pessoas = new ArrayList<>();
        ArrayList<DisciplinaExe1Ac2> disciplinas = new ArrayList<>();
        DisciplinaExe1Ac2 disciplina = new DisciplinaExe1Ac2();
        ProfessorExe1Ac2 professor = new ProfessorExe1Ac2();
        AtendenteExe1Ac2 atendente = new AtendenteExe1Ac2();
        AlunoExe1Ac2 aluno = new AlunoExe1Ac2();
        int a = 0;

        while (a != 7) {
            System.out.println("  >Menu<");
            System.out.println("Digite o numero para selecionar");
            System.out.println("1-> Coloque  Disciplina");
            System.out.println("2-> Coloque Professor");
            System.out.println("3-> Coloque Atendente");
            System.out.println("4-> Coloque Aluno");
            System.out.println("5-> Coloque Disciplina ao Professor");
            System.out.println("6-> Mostrar Pessoas");
            System.out.println("7-> Sair");
            a = l.nextInt();

            switch (a) {
                case 1:
                    disciplina = new DisciplinaExe1Ac2();
                    System.out.println("Digite o nome da Disciplina: ");
                    disciplina.setNome(l.next());
                    System.out.println("Digite o código da Disciplina: ");
                    disciplina.setCodigo(l.nextInt());
                    disciplinas.add(disciplina);
                    break;
                case 2:
                    professor = new ProfessorExe1Ac2();
                    System.out.println("Digite o nome do professor: ");
                    professor.setNome(l.next());
                    System.out.println("Digite o CPF do professor: ");
                    professor.setCpf(l.next());
                    System.out.println("Digite o URL do curriculo lates: ");
                    professor.setUrlCurriculoLattes(l.next());
                    System.out.println("Digite o salario do professor: ");
                    professor.setSalario(l.nextInt());
                    System.out.println("Digite o cracha do professor: ");
                    professor.setNumeroCracha(l.nextInt());

                    pessoas.add(professor);
                    break;
                case 3:
                    atendente = new AtendenteExe1Ac2();
                    System.out.println("Digite o nome do atendente: ");
                    atendente.setNome(l.next());
                    System.out.println("Digite o cpf do atendente: ");
                    atendente.setCpf(l.next());
                    System.out.println("Digite o salario do atendente: ");
                    atendente.setSalario(l.nextInt());
                    System.out.println("Digite o cracha do atendente: ");
                    atendente.setNumeroCracha(l.nextInt());
                    System.out.println("Digite o setor do atendente: ");
                    atendente.setSetor(l.next());
                    System.out.println("Digite a função do atendente: ");
                    atendente.setFuncao(l.next());
                    pessoas.add(atendente);
                    break;
                case 4:
                    aluno = new AlunoExe1Ac2();
                    System.out.println("Digite o nome do aluno: ");
                    aluno.setNome(l.next());
                    System.out.println("Digite o cpf do aluno: ");
                    aluno.setCpf(l.next());
                    System.out.println("Digite o ra do aluno: ");
                    aluno.setRa(l.next());
                    System.out.println("Digite o curso do aluno: ");
                    aluno.setCurso(l.next());
                    pessoas.add(aluno);
                    break;
                case 5:
                    System.out.println("Disciplinas: ");
                    for (int i = 0; i < disciplinas.size(); i++) {
                        System.out.println(disciplinas.get(i).getNome());
                    }
                    System.out.println("Digite o nome da disciplina que deseja adicionar:");
                    String disci = l.next();

                    System.out.println("Professores: ");
                    for (PessoaExe1Ac2 p : pessoas) {
                        ProfessorExe1Ac2 profe = (ProfessorExe1Ac2) p;
                        if (p instanceof ProfessorExe1Ac2) {
                            System.out.println(profe.getNome());
                        }
                    }

                    for (DisciplinaExe1Ac2 d : disciplinas) {
                        if (d.getNome().equals(disci)) {
                            disciplina = d;
                            break;
                        }
                    }

                    for (PessoaExe1Ac2 p : pessoas) {
                        ProfessorExe1Ac2 profe = (ProfessorExe1Ac2) p;
                        System.out.println("Digite o nome do professor");
                        String nome = l.next();
                        if (profe.getNome().equals(nome)) {
                            profe.addDisciplina(disciplina);
                            break;
                        }
                    } 
                    break;
                case 6:
                    for (int i = 0; i < pessoas.size();) {
                        System.out.println(pessoas.get(i));
                        System.out.println("");
                        i++;
                    }
                    break;
                case 7:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção invalida, escolha novamente: ");
                    System.out.println(" ");
            }
        }
    }

}
