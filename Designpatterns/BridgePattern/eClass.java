package Designpatterns.BridgePattern;

public class eClass implements iCar {
    private iMotor motor;

    public eClass(iMotor motor){
        this.motor = motor;
    }

    @Override
    public void startMotor() {
        this.motor.start();
    }
}
