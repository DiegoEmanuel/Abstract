public class TestaFilme {
    
    public static void main(String[] args) {
        
        Data data = new Data(6, 9, 2017);
        Filme filme = new Filme("It: A Coisa", 5.0, data);
        
        filme.getDataDeLancamento();
        filme.imprimir();
    }
    
}
