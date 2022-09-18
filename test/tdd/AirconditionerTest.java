package tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirconditionerTest {

    @Test
    public void turnOnAirconditioner() {
        //(precondition) Given that I have Airconditioner
        Airconditioner myNewAirconditioner = new Airconditioner();
        //(Action) when I turn on Airconditioner
        myNewAirconditioner.turnOn();
        //(Assert) Check that Airconditioner is on
        boolean turnOn = myNewAirconditioner.turnOnAc();
        assertTrue(turnOn);

    }

    @Test
    public void turnOffAirconditioner() {
        //(precondition) Given that I have Airconditioner
        // and Airconditioner is on..
        Airconditioner myNewAirconditioner = new Airconditioner();
        //(Action) when I turn on Airconditioner
        myNewAirconditioner.turnOff();
        //(Assert) Check that Airconditioner is on
        boolean turnOff = myNewAirconditioner.turnOffAc();
        assertFalse(turnOff);
    }

    @Test
    public void increaseAcTemp() {
        //(precondition) Given that I have an AC
        Airconditioner myNewAirconditioner = new Airconditioner();
        // and AC is on
        myNewAirconditioner.turnOn();
        // and AC temp is 16
        myNewAirconditioner.setAcTemperature(16);
        //(Action) When I increase AC
        myNewAirconditioner.setAcTemperature(16);
        myNewAirconditioner.increaseTemp(4);
        assertEquals(20, myNewAirconditioner.getAcTemperature());
    }

    @Test
    public void decreaseAcTemp() {
        //(precondition) Given that I have an AC
        Airconditioner myNewAirconditioner = new Airconditioner();
        // and AC is on
        myNewAirconditioner.turnOn();
        // and AC temp is 16
        myNewAirconditioner.setAcTemperature(30);
        //(Action) When I decrease AC
        myNewAirconditioner.setAcTemperature(30);
        myNewAirconditioner.decreaseTemp(6);
        assertEquals(24, myNewAirconditioner.getAcTemperature());
    }

    @Test
    public void increasePastMaxTemp() {
        //(Action) When I increase AC past 30
        Airconditioner myNewAirconditioner = new Airconditioner();
        myNewAirconditioner.setAcTemperature(10);
        myNewAirconditioner.increasePastThirty(9);
        assertEquals(30, myNewAirconditioner.getAcTemperature());

    }




}