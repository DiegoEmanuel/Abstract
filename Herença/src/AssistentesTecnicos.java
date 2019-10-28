public class AssistentesTecnicos extends Assistentes {
    
    private double bonus;
    
    public AssistentesTecnicos(String n, String m, Gerentes s, double b){
        super(n, m, s);
        this.setBonus(b);
    }
    
    public double getBonus(){
        return this.bonus;
    }
    public void setBonus(double b){
        this.bonus = b;
    }
    
}