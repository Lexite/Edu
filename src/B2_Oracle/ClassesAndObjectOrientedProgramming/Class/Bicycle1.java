package Learning.FirstLearnign.ClassesAndObjectOrientedProgramming.Class;

public class Bicycle1 {

        private int cadence;
        private int gear;
        private int speed;

        public Bicycle1(int startCadence, int startSpeed, int startGear) {
            gear = startGear;
            cadence = startCadence;
            speed = startSpeed;
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

        public void setGear(int newValue) {
            gear = newValue;
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
    }