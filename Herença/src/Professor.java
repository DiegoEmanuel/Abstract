public class Professor {
    
    private String nome;
    private int idade;
    private String matricula;
    
    public Professor(String n, int i, String m){
        this.setNome(n);
        this.setIdade(i);
        this.setMatricula(m);
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String m){
        this.matricula = m;
    }
    
}
