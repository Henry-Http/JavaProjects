package tdd;

public class Airconditioner {

    private boolean turnOn;
    private boolean turnOff;

    private int acTemperature;

    public void turnOn() {
        if (turnOn == false) {
            turnOn = true;
        }
    }
    public boolean turnOnAc() {

        return turnOn;
    }

    public void turnOff() {
        if (turnOff == true) {
            turnOff = false;
        }
    }

    public boolean turnOffAc() {

        return turnOff;
    }

    public void setAcTemperature(int temp) {
        if (temp >= 16 && temp <= 30) {
            acTemperature = temp ;
        }
    }
    public void increaseTemp(int temp) {
        acTemperature = acTemperature + temp;
    }

    public void decreaseTemp(int temp) {
        acTemperature = acTemperature - temp;
    }

    public void increasePastThirty(int temp) {
        acTemperature = acTemperature + temp;
        if (acTemperature > 30) {

        }
    }

    public int getAcTemperature() {
        return acTemperature;
    }


}
