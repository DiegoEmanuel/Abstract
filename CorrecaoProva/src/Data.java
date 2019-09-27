public class Data {
            
                private int dia;
                private int mes;
                private int ano;
                
            public Data(int d, int m, int a){
                this.setDia(d);
                this.setMes(m);
                this.setAno(a);
            }
            
            public void imprimirData (){
           
             System.out.println("a data é: " + this.getDia() +"/"+this.getMes() +"/"+ this.getAno());
            
          }
            
    public int getDia() {
        return dia;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}