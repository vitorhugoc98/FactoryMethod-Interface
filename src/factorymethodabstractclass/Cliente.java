package factorymethodabstractclass;

public class Cliente {

    public static void main(String[] args) {
        FactoryFabricaoDeAviao factory = new FactoryFabricaoDeAviao(); 
        
        int capacidade = 100; 
        
        factory.verificaAviao(capacidade); 
    }
    
}
