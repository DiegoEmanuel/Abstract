public class AssistentesAdministrativos extends Assistentes {
    
    private double adicionalNoturno;
    
    public AssistentesAdministrativos(String n, String m, Gerentes s, double a){
        super(n, m, s);
        this.setAdicionalNoturno(a);
    }
    
    public double getAdicionalNoturno(){
        return this.adicionalNoturno;
    }
    public void setAdicionalNoturno(double a){
        this.adicionalNoturno = a;
    }
    
}
