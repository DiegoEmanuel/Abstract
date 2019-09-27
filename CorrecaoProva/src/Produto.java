public class Produto {
    
    private double preco;
    
    public Produto(double p){
        
        this.setPreco(p);
    }
    
    public double getPreco(){
        
        return this.preco;
    }
    
    public void setPreco(double p){
        
        this.preco = p;
    }
    
    public double calcularDesconto(){
        
        double desconto = getPreco() - (getPreco() * 0.25);
        return desconto;
    }
    
}