package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticBikeTest {

    @Test
    public void turnOnBike() {
        AutomaticBike myNewBike = new AutomaticBike();
        System.out.println(myNewBike.getPower());

        myNewBike.turnOn();
        boolean status = myNewBike.getPower();
        assertTrue(status);
    }

    @Test
    public void turnOffBike() {
        AutomaticBike myNewBike = new AutomaticBike();
        assertFalse(myNewBike.getPower());
    }

    @Test
    public void bikeMotionGearOne() {
        AutomaticBike myNewBike = new AutomaticBike(); //given i have a bike
        assertEquals(0,myNewBike.getSpeed());
        myNewBike.turnOn(); // when i turn it on
//        myNewBike.accelerate(); // when i accelerate
//        myNewBike.accelerate();
//        myNewBike.accelerate();

        assertEquals(2,myNewBike.getSpeed()); // confirm that my speed is 1
    }

}