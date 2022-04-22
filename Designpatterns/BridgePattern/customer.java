package Designpatterns.BridgePattern;

public class customer {
    private static iCar car = new eClass(new dieselMotor());

    public static void main(String[] args) {
        car.startMotor();
    }
}
