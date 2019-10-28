public class ProfessorHorista extends Professor {
    
    private double salarioHora;
    
    public ProfessorHorista(String n, int i, String m, double sh){
        super(n, i, m);
    }
    
    public double getSalarioHora(){
        return this.salarioHora;
    }
    public void setSalarioHora(double sh){
        this.salarioHora = sh;
    }
    
}