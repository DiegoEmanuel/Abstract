
public class TestaEmpresa {
    
    public static void main(String[] args) {
        
        Gerentes g1 = new Gerentes("Monica", "0001", "Administrativo");
        Gerentes g2 = new Gerentes("Chandler", "0002", "Técnico");
        
        AssistentesAdministrativos a1 = new AssistentesAdministrativos("Joe", "00001-a", g1, 5.0);
        
        AssistentesTecnicos t1 = new AssistentesTecnicos("Phoebe", "00002-t", g2, 5.5);      
        
    }
    
}