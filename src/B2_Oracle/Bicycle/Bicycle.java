package B2_Oracle.Bicycle;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public Bicycle(int i, int i1, int i2) {
    }

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}

