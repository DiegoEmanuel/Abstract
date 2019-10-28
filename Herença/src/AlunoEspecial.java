public class AlunoEspecial extends Aluno {
    
    private Disciplina disciplinaPos;
    private Disciplina disciplinaGraduacao;
    
    public AlunoEspecial(String n, String m, Disciplina dp, Disciplina dg){
        super(n, m);
        this.setDisciplinaPos(dp);
        this.setDisciplinaGraduacao(dg);
    }
    
    public Disciplina getDisciplinaPos(){
        return this.disciplinaPos;
    }
    public void setDisciplinaPos(Disciplina dp){
        this.disciplinaPos = dp;
    }
    
    public Disciplina getDiscilplinaGraduacao(){
        return this.disciplinaGraduacao;
    }
    public void setDisciplinaGraduacao(Disciplina dg){
        this.disciplinaGraduacao = dg;
    }
    
}
