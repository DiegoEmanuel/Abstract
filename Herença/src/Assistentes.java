public class Assistentes extends Funcionario {
    
    private Gerentes supervisor;
    
    public Assistentes(String n, String m, Gerentes s){
        super(n, m);
        this.setSupervidor(s);
    }
    
    public Gerentes getSupervisor(){
        return this.supervisor;
    }
    public void setSupervidor(Gerentes s){
        this.supervisor = s;
    }
    
}