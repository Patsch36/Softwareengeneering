package Designpatterns.BridgePattern;

public class dieselMotor implements iMotor{

    @Override
    public void start() {
        System.out.println("diesel motor started");
        
    }
    
}
