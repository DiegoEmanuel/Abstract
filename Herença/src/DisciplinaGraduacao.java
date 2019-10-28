public class DisciplinaGraduacao extends Disciplina {
    
    private int numeroDeTurmas;
    
    public DisciplinaGraduacao(String nm, String cm, String p, int t){
        super(nm, cm, p);
        this.setNumeroDeTurmas(t);
    }
    
    public int getNumeroDeTurmas(){
        return this.numeroDeTurmas;
    }
    public void setNumeroDeTurmas(int t){
        this.numeroDeTurmas = t;
    }
    
}