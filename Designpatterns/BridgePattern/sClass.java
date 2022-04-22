package Designpatterns.BridgePattern;

public class sClass implements iCar{
    private iMotor motor;
    
    public sClass(iMotor motor){
        this.motor = motor;
    }

    @Override
    public void startMotor() {
        this.motor.start();
    }
}
