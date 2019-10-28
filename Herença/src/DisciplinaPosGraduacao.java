public class DisciplinaPosGraduacao extends Disciplina {
    
    private int alunos;
    
    public DisciplinaPosGraduacao(String nm, String cm, String p, int a){
        super(nm, cm, p);
        this.setAlunos(a);
    }
    
    public int getAlunos(){
        return this.alunos;
    }
    public void setAlunos(int a){
        this.alunos = a;
    }
    
}