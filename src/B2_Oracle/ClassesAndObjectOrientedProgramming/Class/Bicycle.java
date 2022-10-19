package Learning.FirstLearnign.ClassesAndObjectOrientedProgramming.Class;

public class Bicycle {
    //three fields
    public int cadence;
    public int gear;
    public int speed;

    private int id;

    private static int numberOfBicycles = 0;

    //one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        id = ++numberOfBicycles;
    }

    public int getID() {
        return id;
    }

    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    public int getCadence() {
        return cadence;
    }
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public int getGear() {
        return gear;
    }
    public void setGear(int newVale) {
        gear = newVale;
    }

    public int getSpeed() {
        return speed;
    }
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    //mountain bike subclass declaration
    public class MountainBike extends Bicycle {
        //the MountainBike subclass has one field
        public int seatHeight;

        //the MountainBike subclass has one constructor
        public MountainBike(int startHeight, int startCadence,
                            int startSpeed, int startGEar) {
            super(startCadence, startSpeed, startGEar);
            seatHeight = startHeight;
        }

        //the MountainBike subclass has one method
        public void setHeight(int newValue) {
            seatHeight = newValue;
        }
    }

    //create new bicycle object
    Bicycle myBike = new Bicycle(30, 0, 8);
}
