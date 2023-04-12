package ExercicioExe1Ac2;

import java.util.ArrayList;

public class ProfessorExe1Ac2 extends FuncionarioExe1Ac2 {

    private String urlCurriculoLattes;
    private ArrayList<DisciplinaExe1Ac2> disciplinas = new ArrayList<>();
    
    public ProfessorExe1Ac2() {
        
    }
    
    public ProfessorExe1Ac2(String nome, String cpf, String urlCurriculoLattes) {
        setNome(nome);
        setCpf(cpf);
        this.urlCurriculoLattes = urlCurriculoLattes;
    }
    
    @Override
    public String toString() {
        return "Professor: " +
                "\n" + super.toString()
                + "\nUrlCurriculoLattes: " + urlCurriculoLattes
                + "\nDisciplinas: " + disciplinas;
    }
    
    public void addDisciplina(DisciplinaExe1Ac2 disciplina) {
        disciplinas.add(disciplina);
    }
    
    public void removeDisciplina(DisciplinaExe1Ac2 disciplina) {
        disciplinas.remove(disciplina);
    }
    
    public void removeDisciplina(int index) {
        disciplinas.remove(index);
    }
    
    public DisciplinaExe1Ac2 getDisciplina(int index) {
        return disciplinas.get(index);
    }
    
    public String getUrlCurriculoLattes() {
        return urlCurriculoLattes;
    }
    
    public void setUrlCurriculoLattes(String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
    }
    
    public ArrayList<DisciplinaExe1Ac2> getDisciplinas() {
        return disciplinas;
    }
    
    public void setDisciplinas(ArrayList<DisciplinaExe1Ac2> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
}
