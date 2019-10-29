package Latihan5;

public class Truck {

    //the Truck class has three fields
    public int cadence;
    public int gear;
    public int speed;
    //the truck class has one constructor

    public Truck(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

    }

    // the  truck class has four method
    public void setCadence(int newvalue) {
        cadence = newvalue;
    }

    public void setGear(int newvalue) {
        gear = newvalue;

    }
    public void applybrake (int decrement){
        speed = decrement;
        
    }
    public void speedUp(int increment){
        speed = increment;
        
    }
    
}
