public class AlunoPosGraduacao extends Aluno {
    
    private Disciplina disciplinaInscrito;
    
    public AlunoPosGraduacao(String n, String m, Disciplina d){
        super(n, m);
        this.setDisciplinaInscrito(d);
    }
    
    public Disciplina getDisciplinaInscrito(){
        return this.disciplinaInscrito;
    }
    public void setDisciplinaInscrito(Disciplina d){
        this.disciplinaInscrito = d;
    }
    
}