package Designpatterns.BridgePattern;

public class eMotor implements iMotor {

    @Override
    public void start() {
        System.out.println("electro motor started");
        
    }
    
}
