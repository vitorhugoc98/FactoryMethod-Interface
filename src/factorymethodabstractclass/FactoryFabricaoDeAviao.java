package factorymethodabstractclass;

public class FactoryFabricaoDeAviao implements CreatorFactoryFabricaDeAviao{
    
    public ProdutoAviao verificaAviao(int capacidadePassageiros) {
        if(capacidadePassageiros >= 300){
            return new AirbusA380();
        }else if(capacidadePassageiros < 300 && capacidadePassageiros > 150){
            return new Boeing737(); 
        }else {
            return new EmbraerE195E2(); 
        }
    }

}
