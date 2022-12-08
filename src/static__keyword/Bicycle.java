package static__keyword;

public class Bicycle {
	private int cadence;
	private int gear;
	private int speed;
	
	private int id;
	
	private final int x;
	private static int numberOfBicycles = 0;
	
	public Bicycle (int cadence, int gear, int speed) {
		this.x = 1;
		this.setGear(gear);
		this.setCadence(cadence);
		this.setSpeed(speed);
		
		id = ++numberOfBicycles;
	}

	public int getId() {
		return id;
	}
	
	public static int getNumberOfBicycles() {
		return numberOfBicycles;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void applyBrake(int decrement) {
        this.speed -= decrement;
    }
        
    public void speedUp(int increment) {
        this.speed += increment;
    }
}
