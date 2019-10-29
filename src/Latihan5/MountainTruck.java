package Latihan5;

public class MountainTruck extends Truck {
//the MountainTruck subclass add one field

    public int seatHeight;
//the mountaintruck subclass has one contructor
    public MountainTruck(int startHeight,int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    // the mountaintruck subclass adds one method
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public static void main(String[] aku) {
        System.out.println("mulai Berjalan");
        MountainTruck MB = new MountainTruck(0, 0, 0, 0);
        System.out.println("gear="+MB.gear);
        System.out.println("speed="+MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear="+MB.gear);
        System.out.println("speed="+MB.speed);
        MB.setGear(2);
        System.out.println("gear="+MB.gear);
        System.out.println("speed="+MB.speed);
        
    }

}
