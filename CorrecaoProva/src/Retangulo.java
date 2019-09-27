public class Retangulo {
    
    private double altura;
    private double base;
    
    public Retangulo(double h, double b){
        
        this.setAltura(h);
        this.setBase(b);
    }
    
    public double getAltura(){
        
        return this.altura;
    }
    
    public void setAltura(double h){
        
        this.altura = h;
    }
    
    public double getBase(){
        
        return this.base;
    }
    
    public void setBase(double b){
        
        this.base = b;
    }
    
    public double calcularArea(){
        
        double areaDoRetangulo = getBase() * getAltura();
        return areaDoRetangulo;
    }
    
}