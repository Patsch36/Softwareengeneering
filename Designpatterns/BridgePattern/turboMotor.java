package Designpatterns.BridgePattern;

public class turboMotor implements iMotor {

    @Override
    public void start() {
        System.out.println("turbo motor started");
        
    }
    
}
