public class AlunoGraduacao extends Aluno {
    
    private Disciplina disciplinaFrequente;
    
    public AlunoGraduacao(String n, String m, Disciplina df){
        super(n, m);
        this.setDisciplinaFrequente(df);
    }
    
    public Disciplina getDisciplinaFrequente(){
        return this.disciplinaFrequente;
    }
    public void setDisciplinaFrequente(Disciplina df){
        this.disciplinaFrequente = df;
    }
    
}
