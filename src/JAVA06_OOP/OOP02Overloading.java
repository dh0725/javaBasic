package JAVA06_OOP;

public class OOP02Overloading {

    public void speedUp(int value) {
        int speed = value;
    }

//    public void speedUp(int data) {
//        int speed = data;
//    }

    public void speedUp(double value) {
        double speed = value;
    }

    public void speedUp(int value, int maxValue) {
        int speed = value;
        int maxSpeed = maxValue;
    }

}
