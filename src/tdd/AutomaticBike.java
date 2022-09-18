package tdd;

public class AutomaticBike {
    private boolean power;

    private int gear;
    private int speed;





    public void turnOn() {
        if (!power) {
            power = true;
        }
    }

    public void turnOff() {
        if (power) {
            power = false;
        }
    }
    public boolean getPower()
    {
        return power;
    }

    public void accelerate() {
        ++speed;
    }

    public int getSpeed() {
        return speed;
    }
}
