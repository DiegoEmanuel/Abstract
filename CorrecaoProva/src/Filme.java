public class Filme {
    
    private String nome;
    private double nota;
    private Data dataDeLancamento;
    
    public Filme(String n, double g, Data d){
        
        this.setNome(n);
        this.setNota(g);
        this.setDataDeLancamento(d);
    }

    
    public String getNome(){
        
        return this.nome;
    }
    
    public void setNome(String n){
        
        this.nome = n;
    }
    
    public double getNota(){
        
        return this.nota;
    }
    
    public void setNota(double g){
        
        this.nota = g;
    }
    
    public Data getDataDeLancamento(){
        
        return this.dataDeLancamento;
    }
    
    public void setDataDeLancamento(Data d){
        
        this.dataDeLancamento = d;
    }

    void imprimir() {
        System.out.println("O filme é: "+this.nome);
    }

}