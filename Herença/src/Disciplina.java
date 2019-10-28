
public class Disciplina {
    
    private String nomeMateria;
    private String codigoMateria;
    private String professor;
    
    public Disciplina(String nm, String cm, String p){
        this.setNomeMateria(nm);
        this.setCodigoMateria(cm);
        this.setProfessor(p);
    }
    
    public String getNomeMateria(){
        return this.nomeMateria;
    }
    public void setNomeMateria(String nm){
        this.nomeMateria = nm;
    }
    
    public String getCodigoMateria(){
        return this.codigoMateria;
    }
    public void setCodigoMateria(String cm){
        this.codigoMateria = cm;
    }
    
    public String getProfessor(){
        return this.professor;
    }
    public void setProfessor(String p){
        this.professor = p;
    }
    
}
