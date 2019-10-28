public class TestaPessoa {
    
    public static void main(String[] args){
        
        Pessoa p1 = new Pessoa("Monica", "Av. ABC", "1234-5678");
        
        Fornecedor f1 = new Fornecedor("Rachel", "Av. DEF", "1357-2468", 5000, 2999.9);
        
        Empregado e1 = new Empregado("Joe", "Av. GHI ", "0987-6543", "01-b", 2000, 0.05);
        
        Administrador a1 = new Administrador("Chandler", "Av. CBA", "8765-4321", "01-a", 5000, 0.05, 1000);
        
        Operario o1 = new Operario("Ross", "Av. FED", "8642-7531", "01-c", 2000, 0.05, 15000, 0.1);
        
        System.out.println(f1.obterSaldo());
        System.out.println(e1.calcularSalario());
        System.out.println(a1.calcularSalario());
        System.out.println(o1.calcularSalario());
    }
    
}