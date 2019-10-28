public class ProfessorIntegral extends Professor {
    
    private double salarioFixo;
    
    public ProfessorIntegral(String n, int i, String m, double sf){
        super(n, i, m);
        this.setSalarioFixo(sf);
    }
    
    public double getSalarioFixo(){
        return this.salarioFixo;
    }
    public void setSalarioFixo(double sf){
        this.salarioFixo = sf;
    }
    
}