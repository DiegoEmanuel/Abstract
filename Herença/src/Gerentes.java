public class Gerentes extends Funcionario {
    
    private String nomeDepartamento;
    
    public Gerentes(String n, String m, String d){
        super(n, m);
        this.setNomeDepartamento(d);
    }
    
    public String getNomeDepartamento(){
        return this.nomeDepartamento;
    }
    public void setNomeDepartamento(String d){
        this.nomeDepartamento = d;
    }
    
}